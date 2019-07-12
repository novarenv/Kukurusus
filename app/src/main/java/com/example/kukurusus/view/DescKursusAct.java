package com.example.kukurusus.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kukurusus.MainActivity;
import com.example.kukurusus.R;
import com.example.kukurusus.model.Kursus;
import com.example.kukurusus.model.KursusData;

import java.util.ArrayList;

public class DescKursusAct extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    ImageView ivBack, ivDesc, ivCertif;
    TextView tvDNamaKursus, tvDesc, tvPrice, tvLocation, tvKuota, tvJadwal;
    Kursus kursus;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_kursus);

        ivBack = findViewById(R.id.iv_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DescKursusAct.this, MainActivity.class);
                startActivity(intent);
            }
        });
        intent = this.getIntent();
        kursus = intent.getParcelableExtra("Kursus");

        String gambarDetail = kursus.getPhoto();
        ivDesc = findViewById(R.id.iv_detail_kursuss);
        ivDesc.setImageResource(Integer.valueOf(gambarDetail));
        String nama = kursus.getName();
        tvDNamaKursus = findViewById(R.id.tv_d_nama_kursus);
        tvDNamaKursus.setText(nama);
        String desc = kursus.getDesc();
        tvDesc = findViewById(R.id.tv_desc);
        tvDesc.setText(desc);
        String price = kursus.getPrice();
        tvPrice = findViewById(R.id.tv_price);
        tvPrice.setText(price);
        String location = kursus.getLocation();
        tvLocation = findViewById(R.id.tv_location);
        tvLocation.setText(location);
        String certif = kursus.getCertif();
        ivCertif = findViewById(R.id.iv_certif);
        ivCertif.setImageResource(Integer.valueOf(certif));
        String kuota = kursus.getKuota();
        tvKuota = findViewById(R.id.tv_kuota);
        tvKuota.setText(kuota);
        String jadwal = kursus.getSchedule();
        tvJadwal = findViewById(R.id.tv_jadwal);
        tvJadwal.setText(jadwal);
    }
}
