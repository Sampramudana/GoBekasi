package com.pramudana.sam.gobekasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelActivity extends AppCompatActivity {

    RecyclerView hotelRecycler;
    CustomAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        hotelRecycler = findViewById(R.id.hotelRecycler);
        hotelRecycler.setLayoutManager(new LinearLayoutManager(this));
        adapter2 = new HotelActivity.CustomAdapter();
        hotelRecycler.setAdapter(adapter2);
    }
    String[] namaHotel = {

            "Borobudur", "Purnama", "Nascoo", "Art", "Ibis"
    };
    int[] gambarHotel = {

            R.drawable.tu, R.drawable.wa, R.drawable.ga, R.drawable.pat, R.drawable.ma
    };
    private class CustomAdapter extends RecyclerView.Adapter<HotelActivity.CustomAdapter.MyViewHolder> {
        @Override
        public HotelActivity.CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_layout, null);
            return new HotelActivity.CustomAdapter.MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(HotelActivity.CustomAdapter.MyViewHolder holder, final int position) {

            holder.judul.setText(namaHotel[position]);
            holder.img.setImageResource(gambarHotel[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent a1 = new Intent(HotelActivity.this, HotelDetail.class);
                    a1.putExtra("Nama", namaHotel[position]);
                    a1.putExtra("Ikon", gambarHotel[position]);
                    startActivity(a1);

                }
            });
        }

        @Override
        public int getItemCount() {
            return namaHotel.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView judul;
            ImageView img;

            public MyViewHolder(View itemView) {
                super(itemView);

                judul = itemView.findViewById(R.id.judul);
                img = itemView.findViewById(R.id.img);
            }
        }
    }
}
