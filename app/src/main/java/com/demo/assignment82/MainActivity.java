package com.demo.assignment82;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Button b1,b2;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Age = "AgeKey";
    public static final String Phone = "PhoneKey";
    public static final String City = "CityKey";
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        ed4 = (EditText)findViewById(R.id.editText4);
        b1=(Button)findViewById(R.id.save);
        b2=(Button)findViewById(R.id.button2);
        final String N = ed1.getText().toString();
        final String a = ed2.getText().toString();
        final String p = ed3.getText().toString();
        final String c = ed4.getText().toString();
        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString(Name,N);
                editor.putString(Age,a);
                editor.putString(Phone,p);
                editor.putString(City,c);
                editor.commit();
                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();
            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               SharedPreferences sharedPreferences = getSharedPreferences(MyPREFERENCES,MODE_PRIVATE);
               String N = ed1.getText().toString();
               String a = ed2.getText().toString();
               String p = ed3.getText().toString();
               String c = ed4.getText().toString();

           }
       });
    }
}
