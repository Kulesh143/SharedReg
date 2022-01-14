package com.kulesh.sharedreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String balance=getIntent().getStringExtra("key");
        TextView tv=findViewById(R.id.nama);
        tv.setText(balance);
    }
}