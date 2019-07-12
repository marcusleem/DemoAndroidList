package com.marcus.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAPI;
    ArrayList<AndroidVersion> ApiList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAPI = findViewById(R.id.listViewApi);

        ApiList=new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0-8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0-7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow", "6.0-6.0.1");
        AndroidVersion item5 = new AndroidVersion("Lollipop", "5.0-5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat", "4.4-4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean", "4.1-4.3.1");

        ApiList.add(item1);
        ApiList.add(item2);
        ApiList.add(item3);
        ApiList.add(item4);
        ApiList.add(item5);
        ApiList.add(item6);
        ApiList.add(item7);

        adapter = new CustomAdapter(this,R.layout.row, ApiList);

        lvAPI.setAdapter(adapter);
    }
}
