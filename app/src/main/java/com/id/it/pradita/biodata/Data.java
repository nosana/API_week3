package com.id.it.pradita.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Data extends AppCompatActivity {
    @OnClick (R.id.btn_telp)
            void button() {
        Intent telpon = new Intent(Intent.ACTION_DIAL);
        telpon.setData(Uri.parse("tel:083807555430"));
        startActivity(telpon);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        ButterKnife.bind(this);

    }
    public void procces (View view) {
        if(view.getId()==R.id.btn_email) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"novanopan26@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Aku cinta kamu");
            intent.putExtra(Intent.EXTRA_TEXT  , "WOW");
            intent.setType("message/rfc882");
            Intent chooser = Intent.createChooser(intent, "send email");
            startActivity(chooser);
        }

    }
}
