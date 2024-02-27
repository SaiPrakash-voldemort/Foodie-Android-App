package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Connect extends AppCompatActivity {
    Button conChef,conCustomer,conDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        conChef=findViewById(R.id.connectAsChef);
        conChef.setOnClickListener(view -> openConChefFun());
        conCustomer=findViewById(R.id.connectAsCustomer);
        conCustomer.setOnClickListener(view -> openConCusFun());
        conDelivery=findViewById(R.id.connectAsDeliveryPerson);
        conDelivery.setOnClickListener(view -> openConDelFun());
    }
    public void openConChefFun(){
        Intent intent=new Intent(this, ChefRegistration.class);
        startActivity(intent);

    }
    public void openConCusFun(){
        Intent intent=new Intent(this, CustomerRegistration.class);
        startActivity(intent);
        finish();
    }
    public void openConDelFun(){
        Intent intent=new Intent(this, DeliveryPersonRegistration.class);
        startActivity(intent);
        finish();
    }
}