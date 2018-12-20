package com.example.shami.dhakaguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodActivity extends AppCompatActivity {
    Button burger,chicken,pizza,sausage,softdrinks,sub,rice,beef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void ItemChoose(View view)
    {
        Intent intent = new Intent(this, OrderActivity.class);



        Button bt = (Button)view;
        intent.putExtra("NameOfFood", bt.getText());

        startActivity(intent);
    }

}

