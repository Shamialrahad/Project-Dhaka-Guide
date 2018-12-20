package com.example.shami.dhakaguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaceActivity extends AppCompatActivity {

    Button pst1,pst2,pst3,pst4,pst5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        pst1=(Button)findViewById(R.id.ps1);
        pst2=(Button)findViewById(R.id.ps2);
        pst3=(Button)findViewById(R.id.ps3);
        pst4=(Button)findViewById(R.id.ps4);
        pst5=(Button)findViewById(R.id.ps5);

        pst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this, Place1Activity.class);

                startActivity(intent);
            }
        });

        pst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this, Place2Activity.class);

                startActivity(intent);
            }
        });




    }
}
