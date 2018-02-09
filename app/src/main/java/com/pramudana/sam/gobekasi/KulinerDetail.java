package com.pramudana.sam.gobekasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KulinerDetail extends AppCompatActivity {

    ImageView imgKuliner;
    TextView txtKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_detail);

        imgKuliner = (ImageView)findViewById(R.id.imgKuliner);
        txtKuliner = (TextView)findViewById(R.id.txtKuliner);

        txtKuliner.setText(getIntent().getStringExtra("aName"));
        imgKuliner.setImageResource(getIntent().getIntExtra("aIcon", 1));
    }
}
