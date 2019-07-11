package com.example.kukurusus.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.kukurusus.R;

import java.util.ArrayList;

public class KursusData implements Parcelable {
    Kursus kursus;
    String name, price;

    public static String[][] data = new String[][]{
            {"Raveraldz's Language", "100.000", Integer.toString(R.drawable.kursus_bahasa),
                    "Jl. Bahasain Aja 555", "Kami menyediakan jasa kursus semua bahasa yang ada di" +
                    " Eropa, dengan pengajar bersertifikasi internasional", "Certif", "Semua Bahasa " +
                    "Tersedia", "Senin - Jumat"},
            {"Hehe", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"},
            {"Name", "Harga", Integer.toString(R.drawable.btn_code), "Lokasi", "Desc", "Certif", "Kuota", "Jadwal"}
    };

    protected KursusData(Parcel in) {
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
        }
    }

    public static final Creator<KursusData> CREATOR = new Creator<KursusData>() {
        @Override
        public KursusData createFromParcel(Parcel in) {
            return new KursusData(in);
        }

        @Override
        public KursusData[] newArray(int size) {
            return new KursusData[size];
        }
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        for (String[] aData : data) {
            dest.writeString(aData[0]);
            dest.writeString(aData[1]);
            dest.writeString(aData[2]);
            dest.writeString(aData[3]);

            dest.writeString(aData[4]);
            dest.writeString(aData[5]);
            dest.writeString(aData[6]);
            dest.writeString(aData[7]);
        }
    }
}
