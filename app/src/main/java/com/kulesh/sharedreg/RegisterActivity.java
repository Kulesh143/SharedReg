package com.kulesh.sharedreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void SignUp(View view) {
        String id=((EditText)findViewById(R.id.id)).getText().toString();
        String name=((EditText)findViewById(R.id.name)).getText().toString();
        String pass=((EditText)findViewById(R.id.pass)).getText().toString();
        String mobile=((EditText)findViewById(R.id.mobile)).getText().toString();
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor e=preferences.edit();
        e.putString(id+"id",id);
        e.putString(id+"name",name);
        e.putString(id+"pass",pass);
        e.putString(id+"mobile",mobile);
        e.apply();
        Toast.makeText(getApplicationContext(), "Successfully Registered!!!", Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
}