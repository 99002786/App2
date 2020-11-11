package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class HomeActivity extends AppCompatActivity {

    String[] languages;
    private static final String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.w(TAG, "oncreate");
        languages = new String[]{"english","hindi","urdu","kannada"};
        //get intent which started this activity
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String data = extras.getString("mykey");
            TextView resultTextView = findViewById(R.id.textViewResult);//use some id from mainactivity the app ll crash n degguged using logcat
            resultTextView.setText(data);
        }
        ListView countriesListView = findViewById(R.id.countriesListview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, //layout file of each row in the listview
                R.layout.row_listview,
                languages);
        countriesListView.setAdapter(adapter);
    }

}