package com.example.kukurusus.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kukurusus.R;
import com.example.kukurusus.model.Category;

import java.util.ArrayList;

public class CVCategoryAdapter extends RecyclerView.Adapter<CVCategoryAdapter.CardViewHolder> {
    private ArrayList<Category> listCategory;

    public CVCategoryAdapter(ArrayList<Category> listCategory) {
        this.listCategory = listCategory;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_kursus,
                viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Category category = getListCategory().get(position);

        holder.ivCategory.setImageResource(Integer.valueOf(category.getPhoto()));
        holder.tvCategory.setText(category.getName());
    }

    @Override
    public int getItemCount() {
        return getListCategory().size();
    }

    public ArrayList<Category> getListCategory() {
        return listCategory;
    }

    public void setListCategory(ArrayList<Category> listCategory) {
        this.listCategory = listCategory;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCategory;
        TextView tvCategory;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            ivCategory = itemView.findViewById(R.id.iv_category);
            tvCategory = itemView.findViewById(R.id.tv_category);
        }
    }
}
