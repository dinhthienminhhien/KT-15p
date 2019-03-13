package com.example.student.myapplication;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void thaydoi (String chuoi)
    {
        Fragment_InFo fragment_inFo = (Fragment_InFo) getFragmentManager().findFragmentById(R.id.fragment4);
        if (fragment_inFo!= null && fragment_inFo.isInLayout())
        {
            fragment_inFo.tv_fr .setText(chuoi);
        }
        else
        {
            Intent it = new Intent(MainActivity.this,MainFragmentInfoActivity.class);
            it.putExtra("truyendata",chuoi);
            startActivity(it);
        }
    }
}
