package com.gigoallen.lifecycleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find r id
        Button btnDial = findViewById(R.id.btnDial);
        Button btnSecond = findViewById(R.id.btnSecond);
        Button btnFinish = findViewById(R.id.btnFinish);

        //set listener
        btnDial.setOnClickListener(myListener);
        btnSecond.setOnClickListener(myListener);
        btnFinish.setOnClickListener(myListener);

        Toast.makeText(this, "阿姆阿<我在Create(1)這個方法裡面喔", Toast.LENGTH_LONG).show();
    }

    private Button.OnClickListener myListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
