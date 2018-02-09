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

public class TourismActivity extends AppCompatActivity {

    RecyclerView tourismRecycle;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism);

        tourismRecycle = findViewById(R.id.tourismRecycler);
        tourismRecycle.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        tourismRecycle.setAdapter(adapter);

    }
    String[] namaWisata = {

            "Teluk Jakarta", "Museum IPTEK", "Taman Burung TMII", "Curug Parigi", "Taman Wisata Mekarsari"
    };
    int[] gambarWisata = {

           R.drawable.iso, R.drawable.idn, R.drawable.tkj, R.drawable.sriwijaya, R.drawable.developer
    };
    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tourism_layout, null);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {

            holder.judul.setText(namaWisata[position]);
            holder.img.setImageResource(gambarWisata[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent a1 = new Intent(TourismActivity.this, TourismDetail.class);
                    a1.putExtra("judul", namaWisata[position]);
                    a1.putExtra("icon", gambarWisata[position]);
                    startActivity(a1);

                }
            });
        }

        @Override
        public int getItemCount() {
            return namaWisata.length;
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
