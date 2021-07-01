package com.example.usercredential;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText temail;
    private EditText tpassword;
    private Button mbtnlogin;
    private String validemail="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        temail=findViewById(R.id.etemail);
        tpassword=findViewById(R.id.etpassword);
        mbtnlogin=findViewById(R.id.btnlogin);
        mbtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isemailvalid=isemailvalid();
                boolean ispasswordvalid=ispasswordvalid();
                if(isemailvalid && ispasswordvalid){
                    Intent intent=new Intent(LoginActivity.this, HomeActivity.class);
                    intent.putExtra("useremail",temail.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }
    private boolean ispasswordvalid(){
        if(tpassword.getText().toString().length()>=6){
            return true;
        }else{
            tpassword.setError("Password length is small");
            return false;
        }
    }
    private boolean isemailvalid() {
        if (temail.getText().toString().matches(validemail)) {
            return true;
        } else {
            temail.setError("Invalid Email");
            return false;
        }
    }
}