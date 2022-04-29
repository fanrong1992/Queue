package com.example.queue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReserveDetectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_detection);

        Intent intent = getIntent();
        String point = intent.getStringExtra("Point");

        TextView pointName = (TextView) findViewById(R.id.pointName);
        pointName.setText(point);

        TextView queueInfo = (TextView) findViewById(R.id.queueInfo);
        queueInfo.setText("当前排队人数 20 人，预计排队时间 40 分钟");

        //Button queue = (Button) findViewById(R.id.queue);
    }

    public void Queue(View v) {
        TextView queueInfo = (TextView) findViewById(R.id.queueInfo);
        queueInfo.setText("21 号，您前面还有 20 人，预计排队时间 40 分钟");
        Toast.makeText(getApplicationContext(), "排队成功！", Toast.LENGTH_SHORT).show();
    }
}