package com.example.kukurusus.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kukurusus.MainActivity;
import com.example.kukurusus.R;
import com.example.kukurusus.model.Kursus;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class CVListKursusAdapter extends RecyclerView.Adapter<CVListKursusAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Kursus> listKursus;
    MainActivity mainActivity = new MainActivity();

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

//        Glide.with(holder.itemView.getContext())
//                .load(mainActivity.getImage(kursus.getPhoto()))
//                .apply(new RequestOptions())
//                .into(holder.ivFotoKursus);
        holder.ivFotoKursus.setImageResource(Integer.valueOf(kursus.getPhoto()));
        holder.tvNamaKursus.setText(kursus.getName());
        holder.tvHargaKursus.setText(kursus.getPrice());
        holder.tvLokasiKursus.setText(kursus.getLocation());
    }

    @Override
    public int getItemCount() {
        return getListKursus().size();
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
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
