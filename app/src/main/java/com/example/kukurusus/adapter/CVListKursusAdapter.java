package com.example.kukurusus.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kukurusus.R;
import com.example.kukurusus.model.Kursus;

import java.util.ArrayList;

public class CVListKursusAdapter extends RecyclerView.Adapter<CVListKursusAdapter.CardViewViewHolder> {
    private ArrayList<Kursus> listKursus;

    public CVListKursusAdapter(ArrayList<Kursus> listKursus) {
        this.listKursus = listKursus;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_card_kursus,
                viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Kursus kursus = getListKursus().get(position);

        holder.ivFotoKursus.setImageResource(Integer.valueOf(kursus.getPhoto()));
        holder.tvNamaKursus.setText(kursus.getName());
        holder.tvHargaKursus.setText(kursus.getPrice());
        holder.tvLokasiKursus.setText(kursus.getLocation());
    }

    @Override
    public int getItemCount() {
        return getListKursus().size();
    }

    public ArrayList<Kursus> getListKursus() {
        return listKursus;
    }

    public void setListKursus(ArrayList<Kursus> listKursus) {
        this.listKursus = listKursus;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFotoKursus;
        TextView tvNamaKursus, tvHargaKursus, tvLokasiKursus;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFotoKursus = itemView.findViewById(R.id.iv_kursus);
            tvNamaKursus = itemView.findViewById(R.id.tv_nama_kursus);
            tvHargaKursus = itemView.findViewById(R.id.tv_harga_kursus);
            tvLokasiKursus = itemView.findViewById(R.id.tv_lokasi_kursus);
        }
    }
}
