package com.example.queue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayMessageActivity extends AppCompatActivity {
    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        RecyclerView recyclerView = findViewById(R.id.detectionPoint);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        if (message.indexOf("东城") > -1) {
            ArrayList<String> dongcheng = new ArrayList<>();
            dongcheng.add("雍和宫检测点");
            dongcheng.add("东直门检测点");
            dongcheng.add("王府井检测点");
            dongcheng.add("东单检测点");

            adapter = new MyRecyclerViewAdapter(this, dongcheng);
        } else if (message.indexOf("西城") > -1) {
            ArrayList<String> xicheng = new ArrayList<>();
            xicheng.add("平安里检测点");
            xicheng.add("菜市口检测点");
            xicheng.add("陶然亭检测点");
            xicheng.add("西单检测点");

            adapter = new MyRecyclerViewAdapter(this, xicheng);
        } else if (message.indexOf("海淀") > -1) {
            ArrayList<String> haidian = new ArrayList<>();
            haidian.add("知春里检测点");
            haidian.add("五棵松检测点");
            haidian.add("马连洼检测点");
            haidian.add("西苑检测点");

            adapter = new MyRecyclerViewAdapter(this, haidian);
        } else if (message.indexOf("朝阳") > -1) {
            ArrayList<String> chaoyang = new ArrayList<>();
            chaoyang.add("芍药居检测点");
            chaoyang.add("酒仙桥检测点");
            chaoyang.add("望京西检测点");
            chaoyang.add("望京检测点");

            adapter = new MyRecyclerViewAdapter(this, chaoyang);
        } else {
            Toast.makeText(this, "暂未收录", Toast.LENGTH_SHORT).show();
        }

        recyclerView.setAdapter(adapter);
    }

}