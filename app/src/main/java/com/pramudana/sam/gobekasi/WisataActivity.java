package com.pramudana.sam.gobekasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WisataActivity extends AppCompatActivity {

    ImageButton btnTravel, btnHotel, btnFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        btnTravel = (ImageButton)findViewById(R.id.btnTravel);
        btnHotel = (ImageButton)findViewById(R.id.btnHotel);
        btnFood = (ImageButton)findViewById(R.id.btnFood);

        btnTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent n1 = new Intent(getApplicationContext(), TourismActivity.class);
                startActivity(n1);
            }
        });
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent n2 = new Intent(getApplicationContext(), KulinerActivity.class);
                startActivity(n2);
            }
        });
        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent n3 = new Intent(getApplicationContext(), HotelActivity.class);
                startActivity(n3);
            }
        });
    }
}
