package com.example.kukurusus.model;

import com.example.kukurusus.R;

import java.util.ArrayList;

public class KursusData {
    public static String[][] data = new String[][]{
            {"Raveraldz's Language", "100.000", Integer.toString(R.drawable.kursus_bahasa),
                    "Jl. Bahasain Aja 555", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Hehe", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"}
    };

    public static ArrayList<Kursus> getListData() {
        Kursus kursus = null;
        ArrayList<Kursus> list = new ArrayList<>();
        for (String[] aData : data) {
            kursus = new Kursus();
            kursus.setName(aData[0]);
            kursus.setPrice(aData[1]);
            kursus.setPhoto(aData[2]);
            kursus.setLocation(aData[3]);

            kursus.setDesc(aData[4]);
            kursus.setCertif(aData[5]);
            kursus.setKuota(aData[6]);
            kursus.setSchedule(aData[7]);

            list.add(kursus);
        }

        return list;
    }
}
