package com.example.kukurusus.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kukurusus.MainActivity;
import com.example.kukurusus.R;
import com.example.kukurusus.model.Kursus;
import com.example.kukurusus.view.DescKursusAct;

import java.util.ArrayList;

public class CVListKursusAdapter extends RecyclerView.Adapter<CVListKursusAdapter.CardViewViewHolder> {
    private ArrayList<Kursus> listKursus;
    View view;
    MainActivity mainActivity;
    private Context context;
    Intent intent;

    public CVListKursusAdapter(ArrayList<Kursus> listKursus, Context context, MainActivity mainActivity) {
        this.listKursus = listKursus;
        this.context = context;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_card_kursus,
                viewGroup, false);
        this.view = view;
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
        final Kursus kursus = getListKursus().get(position);

        holder.ivFotoKursus.setImageResource(Integer.valueOf(kursus.getPhoto()));
        holder.tvNamaKursus.setText(kursus.getName());
        holder.tvHargaKursus.setText(kursus.getPrice());
        holder.tvLokasiKursus.setText(kursus.getLocation());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                intent = new Intent(context, DescKursusAct.class);
                intent.putExtra(DescKursusAct.EXTRA_NAMA, kursus.getName());

                intent.putExtra("Kursus", kursus);
                mainActivity.startActivity(intent);
            }
        });
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

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
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
