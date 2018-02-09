package com.pramudana.sam.gobekasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TourismDetail extends AppCompatActivity {

    ImageView imgWisata;
    TextView txtWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_detail);


        imgWisata = (ImageView)findViewById(R.id.imgWisata);
        txtWisata = (TextView)findViewById(R.id.txtWisata);

        txtWisata.setText(getIntent().getStringExtra("judul"));
        imgWisata.setImageResource(getIntent().getIntExtra("icon", 1));

    }
}
