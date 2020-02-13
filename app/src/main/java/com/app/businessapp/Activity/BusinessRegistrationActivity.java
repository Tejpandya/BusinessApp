package com.app.businessapp.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.businessapp.Helper.Constant;
import com.app.businessapp.R;

public class BusinessRegistrationActivity extends AppCompatActivity {



    Button btn_save;
    EditText email_id,name,contact_no,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_registration);

        init();


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (name.getText().toString().isEmpty()){
                    Constant.showMessage(BusinessRegistrationActivity.this,"Please Enter Your Business Name");
                }else if (address.getText().toString().isEmpty()){
                    Constant.showMessage(BusinessRegistrationActivity.this,"Please Enter Your Address");
                }else if (contact_no.getText().length() != 10){
                    Constant.showMessage(BusinessRegistrationActivity.this,"Please Enter 10 digit Mobile number");
                }else if (!Patterns.EMAIL_ADDRESS.matcher(email_id.getText().toString()).matches()){
                    Constant.showMessage(BusinessRegistrationActivity.this,"Please Enter Valid Email Id");
                }else {
                    Toast.makeText(BusinessRegistrationActivity.this, "Information Saved successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(BusinessRegistrationActivity.this,MainActivity.class));
                }
            }
        });


    }


    public  void init(){

        btn_save = findViewById(R.id.btn_save);
        email_id = findViewById(R.id.email_id);
        name  = findViewById(R.id.name);
        contact_no = findViewById(R.id.contact_no);
        address = findViewById(R.id.address);
    }

}
