package com.example.student.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainFragmentInfoActivity extends AppCompatActivity {

    TextView tv_fr;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main_fragment_info);
        tv_fr = findViewById(R.id.tv_fr);
        Intent it = getIntent();
        String s = it.getStringExtra("truyenData");
        tv_fr.setText (s);
    }
}
