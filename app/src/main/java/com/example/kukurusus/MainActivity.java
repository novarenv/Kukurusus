package com.example.kukurusus;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.kukurusus.adapter.CVCategoryAdapter;
import com.example.kukurusus.adapter.CVListKursusAdapter;
import com.example.kukurusus.model.Category;
import com.example.kukurusus.model.CategoryData;
import com.example.kukurusus.model.Kursus;
import com.example.kukurusus.model.KursusData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKursus;
    private RecyclerView rvCategory;
    private ArrayList<Kursus> listKursus = new ArrayList<>();
    private ArrayList<Category> listCategory = new ArrayList<>();
    Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKursus = findViewById(R.id.rv_kursus);
        rvKursus.setHasFixedSize(true);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        listKursus.addAll(KursusData.getListData());
        listCategory.addAll(CategoryData.getListData());
        showListKursus();
        showCategory();
    }

    private void showListKursus() {
        CVListKursusAdapter cvListKursusAdapter = new CVListKursusAdapter(listKursus, context, this);
        cvListKursusAdapter.setListKursus(listKursus);
        rvKursus.setLayoutManager(new LinearLayoutManager(this));
        rvKursus.setAdapter(cvListKursusAdapter);
    }

    private void showCategory() {
        CVCategoryAdapter cvCategoryAdapter = new CVCategoryAdapter(listCategory);
        cvCategoryAdapter.setListCategory(listCategory);
        rvCategory.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false));
        rvCategory.setAdapter(cvCategoryAdapter);
    }
}
