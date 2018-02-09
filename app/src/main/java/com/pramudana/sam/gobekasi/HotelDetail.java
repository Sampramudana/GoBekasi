package com.pramudana.sam.gobekasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelDetail extends AppCompatActivity {

    ImageView imgHotel;
    TextView txtHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        imgHotel = (ImageView)findViewById(R.id.imgHotel);
        txtHotel = (TextView)findViewById(R.id.txtHotel);

        txtHotel.setText(getIntent().getStringExtra("Nama"));
        imgHotel.setImageResource(getIntent().getIntExtra("Ikon", 1));
    }
}
