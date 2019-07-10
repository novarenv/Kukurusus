package com.example.kukurusus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kukurusus.adapter.CVListKursusAdapter;
import com.example.kukurusus.model.Kursus;
import com.example.kukurusus.model.KursusData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKursus;
    private ArrayList<Kursus> listKursus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKursus = findViewById(R.id.rv_kursus);
        rvKursus.setHasFixedSize(true);

        listKursus.addAll(KursusData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        CVListKursusAdapter cvListKursusAdapter = new CVListKursusAdapter(listKursus);
        cvListKursusAdapter.setListKursus(listKursus);
        rvKursus.setLayoutManager(new LinearLayoutManager(this));
        rvKursus.setAdapter(cvListKursusAdapter);
    }
}
