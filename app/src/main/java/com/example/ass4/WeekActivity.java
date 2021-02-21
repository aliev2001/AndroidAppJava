package com.example.ass4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

public class WeekActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        setupUIViews();
        initToolbar();
    }

    private void setupUIViews() {
        toolbar = (Toolbar)findViewById(R.id.ToolbarWeek);
        listView = (ListView)findViewById(R.id.lvWeek);
    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Week");
    }

    private void setupListView(){
        String[] week = getResources().getStringArray(R.array.Week);
    }



}