package com.mrj.zy.someutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= (TextView) findViewById(R.id.tv);
//        String time=DateFormatUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss");
        String time=DateFormatUtil.longToString(32713,"yyyy-MM-dd HH:mm:ss");
        tv.setText(time);

    }
}
