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

public class KulinerActivity extends AppCompatActivity {

    RecyclerView kulinerRecycle;
    CustomAdapter adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        kulinerRecycle = findViewById(R.id.kulinerRecycler);
        kulinerRecycle.setLayoutManager(new LinearLayoutManager(this));
        adapter1 = new KulinerActivity.CustomAdapter();
        kulinerRecycle.setAdapter(adapter1);
        
    }
    String[] namaKuliner = {

            "Kerak Telor", "Roti Cane", "Karedok", "Nasgor", "Gulai"
    };
    int[] gambarKuliner = {

            R.drawable.satu, R.drawable.dua, R.drawable.tiga, R.drawable.empat, R.drawable.lima
    };
    private class CustomAdapter extends RecyclerView.Adapter<KulinerActivity.CustomAdapter.MyViewHolder> {
        @Override
        public KulinerActivity.CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tourism_layout, null);
            return new KulinerActivity.CustomAdapter.MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(KulinerActivity.CustomAdapter.MyViewHolder holder, final int position) {

            holder.judul.setText(namaKuliner[position]);
            holder.img.setImageResource(gambarKuliner[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent a1 = new Intent(KulinerActivity.this, KulinerDetail.class);
                    a1.putExtra("aName", namaKuliner[position]);
                    a1.putExtra("aIcon", gambarKuliner[position]);
                    startActivity(a1);

                }
            });
        }

        @Override
        public int getItemCount() {
            return namaKuliner.length;
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
