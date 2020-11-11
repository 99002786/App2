package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {
    String[] languagesData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        languagesData=new String[]{"english","hindi","kannada","urdu"};
        RecyclerView recyclerView = findViewById(R.id.RecylerView);
        Myadapter adapter = new Myadapter(languagesData);
    }
}