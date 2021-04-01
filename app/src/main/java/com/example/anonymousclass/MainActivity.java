package com.example.anonymousclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button mbutton1;
    TextView mTextview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton1 = findViewById(R.id.button1);
        mTextview1 = findViewById(R.id.textView1);

        mbutton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mTextview1.setText("you clicked button1");
    }
}