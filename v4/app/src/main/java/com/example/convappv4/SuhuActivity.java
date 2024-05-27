package com.example.convappv4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class SuhuActivity extends AppCompatActivity {
    private Button cTf, fTc, rtn;
    private TextView vHasil;
    private EditText nSuhu;
    double vHasil0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        cTf = findViewById(R.id.cTf);
        fTc = findViewById(R.id.fTc);
        rtn =findViewById(R.id.btnRtn);
        vHasil = findViewById(R.id.vHasil);
        nSuhu = findViewById(R.id.nSuhu);

        cTf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double suhu = Double.parseDouble(nSuhu.getText().toString());
                vHasil0 = (suhu * 1.8) + 32;
                vHasil.setText(String.valueOf(vHasil0));
            }
        });
        fTc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double suhu = Double.parseDouble(nSuhu.getText().toString());
                vHasil0 = (suhu - 32) / 1.8 ;
                vHasil.setText(String.valueOf(vHasil0));
            }
        });
        rtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(SuhuActivity.this, HomeActivity.class);
                startActivity(intent4);
                finish();
            }
        });
    }
}