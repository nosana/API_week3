package com.id.it.pradita.biodata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @OnClick(R.id.btn_biodata)
    void button() {
        Intent intent = new Intent(MainActivity.this, Data.class);
        startActivity(intent);
    }
    @OnClick(R.id.btn_galery)
    void button1() {
        Intent intent = new Intent(MainActivity.this, Galery.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
}
