package com.kulesh.sharedreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signin(View view) {

        String name=((EditText)findViewById(R.id.name)).getText().toString();
        String pass=((EditText)findViewById(R.id.pass)).getText().toString();
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        Map<String ,?>map=preferences.getAll();
        for(Map.Entry<String,?>e:map.entrySet()){
            String key=e.getKey();
            String value=e.getValue().toString();
            String str=key.split("name")[0];
            String hs=preferences.getString("1"+"name","Not found");
            ///String hs=key.split("pass")[0].toString();
//                String password=preferences.getString("pass",null);
            if (hs.equals(name)&&value.equals(pass)) {

            Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_SHORT).show();
            }
//            if (value.equals(name)) {
//                Toast.makeText(getApplicationContext(), "Sucessfully Logged In", Toast.LENGTH_SHORT).show();
//                String str=key.split("name")[0];
//                String password=preferences.getString(str+"password",null);
//                if (password.equals(pass)) {
//
//                    Toast.makeText(getApplicationContext(), "Successfully Logged In!", Toast.LENGTH_SHORT).show();
//                }
//            }
        }

    }
}