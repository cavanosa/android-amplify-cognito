package com.cavanosa.tutorialandroidamplify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfirmActivity extends AppCompatActivity {

    AmplifyCognito amplifyCognito;

    EditText etCode;
    Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        amplifyCognito = new AmplifyCognito(getApplicationContext());
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        etCode = findViewById(R.id.etCode);
        btnVerify = findViewById(R.id.btnVerify);
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = etCode.getText().toString();
                amplifyCognito.confirm(username, code);
            }
        });
    }
}