package com.kulesh.sharedreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Map;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void login(View view) {
        String name=((EditText)findViewById(R.id.name)).getText().toString();
        String pass=((EditText)findViewById(R.id.pass)).getText().toString();
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        Map<String ,?> map=preferences.getAll();
        for(Map.Entry<String,?>e:map.entrySet()){
            String key=e.getKey();
            String value=e.getValue().toString();
            String hs=preferences.getString("1"+"name","Not found!!!");
            if (hs.equals(name) && value.equals(pass)) {

                Toast.makeText(getApplicationContext(), "Successfully Logged In!!!", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(this,Home.class);
                i.putExtra("key",hs);
                startActivity(i);
            }
        }

    }
}