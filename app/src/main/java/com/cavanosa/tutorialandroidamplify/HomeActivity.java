package com.cavanosa.tutorialandroidamplify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    AmplifyCognito amplifyCognito;

    TextView tvUsername;
    Button btnSignout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amplifyCognito = new AmplifyCognito(getApplicationContext());
        setContentView(R.layout.activity_home);
        tvUsername  = findViewById(R.id.tvUsername);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        tvUsername.setText("Wellcome " + username + "!!");
        btnSignout = findViewById(R.id.btnSignout);
        btnSignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amplifyCognito.signOut();
            }
        });
    }
}