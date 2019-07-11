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

public class DescKursusAct extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    ImageView ivBack;
    TextView tvDNamaKursus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_kursus);

        ivBack = findViewById(R.id.iv_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DescKursusAct.this, "Favorite ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DescKursusAct.this, MainActivity.class);
                startActivity(intent);
            }
        });
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        tvDNamaKursus = findViewById(R.id.tv_d_nama_kursus);
        tvDNamaKursus.setText(nama);
    }
}
