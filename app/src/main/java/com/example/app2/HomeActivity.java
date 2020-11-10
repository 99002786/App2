package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.lang.reflect.Array;

public class HomeActivity extends AppCompatActivity {


    private static final String TAG = HomeActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.w(TAG, "oncreate");
        //get intent which started this activity
        Intent intent= getIntent();
        Bundle extras= intent.getExtras();
        String data=extras.getString("mykey");
        TextView resultTextView=findViewById(R.id.textViewResult);//use some id from mainactivity the app ll crash n degguged using logcat
        resultTextView.setText(data);
        }
}