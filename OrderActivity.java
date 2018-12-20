package com.example.shami.dhakaguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    EditText edt;
    Button cbtn ,sbtn;
    String nameOfFood;
    int picOfFood;
    ImageView burgerimage;
    TextView foodName, totalBill, usdID;
    int price;
    EditText quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        burgerimage=(ImageView) findViewById(R.id.burgerimageid);
        cbtn =(Button) findViewById(R.id.Callbtn);
        foodName = (TextView) findViewById(R.id.foodNameID);
        quantity = (EditText) findViewById(R.id.quantityid);
        totalBill = (TextView) findViewById(R.id.totalbillid);
        usdID = (TextView) findViewById(R.id.usdid);
        sbtn = (Button) findViewById(R.id.smsbtn);

        Bundle bundle = getIntent().getExtras();

        nameOfFood = bundle.getString("NameOfFood");
        foodName.setText(nameOfFood);

        if(nameOfFood.equals("Burger"))
            price = 350;
        else if(nameOfFood.equals("Pizza"))
            price = 1200;
        else if(nameOfFood.equals("sandwich"))
            price = 120;
        else if(nameOfFood.equals("Sausage"))
            price = 280;
        else if(nameOfFood.equals("Fried Chicken"))
            price = 120;
        else if(nameOfFood.equals("Drinks"))
            price = 260;
        else if(nameOfFood.equals("Beef Steak"))
            price = 260;
        else if(nameOfFood.equals("Rice Bowl"))
            price = 260;
        else
            price = 0;

        double bill;
        bill = Integer.parseInt(quantity.getText().toString()) * price;
        double usd =bill/80;

        totalBill.setText("Total Bill: "+bill);
        usdID.setText("Covertion USD :"+usd);


        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dial = new Intent();
                dial.setAction("android.intent.action.DIAL");
                dial.setData(Uri.parse("tel:"+01753437652));
                startActivity(dial);
            }
        });

        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address", "01753437652");
                smsIntent.putExtra("sms_body","Quantity: Address:");
                startActivity(smsIntent);

            }
        });


    }
}

