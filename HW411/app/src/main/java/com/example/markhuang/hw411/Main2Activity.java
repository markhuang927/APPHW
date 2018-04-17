package com.example.markhuang.hw411;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String StuNum = getIntent().getStringExtra("StuNum");
        String word = getIntent().getStringExtra("word");
        String wordshow = StuNum + ":" + word;
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(wordshow);
    }
}
