package com.example.convappv4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        Button lgnbtn =(Button) findViewById(R.id.loginbtn);

        //username Vektor
        //password v3kt0r

        lgnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Vektor") && password.getText().toString().equals("v3kt0r")){
                    Toast.makeText(LoginActivity.this, "Login Success",Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent2);
                    finish();
                }else
                    Toast.makeText(LoginActivity.this, "Username or Password is incorrect",Toast.LENGTH_SHORT).show();
            }
        });
    }
}