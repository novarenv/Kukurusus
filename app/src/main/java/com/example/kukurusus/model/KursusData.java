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
            {"Raveraldz's Code", "40.000", Integer.toString(R.drawable.btn_code), "Jl.Kampung Hacker 404",
                    "Tempat belajar programming dengan pilihan bootcamp dan online course. Terdapat" +
                    " lebih dari 10 bahasa pemrograman disertai framework dan design patternnya.",
                    "Certif", "Semua Kelas Tersedia kecuali Flutter", "Setiap hari untuk online dan" +
                    " Senin – Jumat kelas offline"},
            {"Raveraldz's Cook", "Jl. Makan Kenyang 99", Integer.toString(R.drawable.btn_code),
                    "Jl. Makan Kenyang 99", "Kami memberikan pelatihan masakan tradisional Indonesia" +
                    " dengan campuran gaya eropa.", "Certif", "Tersisa 5", "Selasa - Kamis"},
            {"Raveraldz's Drive", "300.000 per 5 pertemuan", Integer.toString(R.drawable.btn_code),
                    "Jl. Raya Ban 10", "Kami menyediakan lahan latihan, kendaraan, serta jaminan " +
                    "mendapatkan SIM untuk semua SIM A dan C.", "Certif", "SIM C tersedia, SIM A tersisa 10",
                    "Setiap Hari"},
            {"Raveraldz's Boutique Course", "300.000", Integer.toString(R.drawable.btn_code),
                    "Jl. Cantique Bingit 69", "Kami menyediakan kursus bagi anda yang ingin membangun" +
                    " butik anda, dari manajemen barang hingga bisnis.", "Certif", "Tersedia",
                    "Sabtu - Minggu"},
            {"Raveraldz's Elementary Course", "20.000", Integer.toString(R.drawable.btn_code),
                    "Jl. Dasar Hidup 2", "Kami memberikan kursus pelajaran SD dan mempersiapkan untuk UN SD",
                    "Certif", "Tersedia", "Senin - Jumat"},
            {"Raveraldz's Junior High School Course", "40.000", Integer.toString(R.drawable.btn_code),
                    "Jl. Tengah Tanggung", "Kami mengajarkan pelajaran SMP dengan jaminan masuk SMA negeri.",
                    "Certif", "Tersedia", "JSenin - Jumat"},
            {"Raveraldz's Senior High School Course", "60.000", Integer.toString(R.drawable.btn_code),
                    "Jl. Tinggi Amat 3", "Kami memberikan jaminan masuk PTN, tidak masuk PTN uang kembali 99%.",
                    "Certif", "Tersedia", "Senin - Jumat"},
            {"Raveraldz's Scuba Dive", "150.000", Integer.toString(R.drawable.btn_code), "Jl. Selam Dalam 9",
                    "Kami memberikan instruktur selam untuk anda, dengan fasilitas sewa perlatan menyelam" +
                    " gratis selama kursus.", "Certif", "Tersedia", "Sabtu - Minggu, Libur Nasional"},
            {"Raveraldz's Bonsai", "100.000", Integer.toString(R.drawable.btn_code), "Jl. Potong Rapi 7",
                    "Kami memberikan pelatihan melakukan bonsai kepada tanaman anda. Kami memberikan" +
                    " jaminan kenyamanan untuk Anda.", "Certif", "Tersedia", "Senin - Jumat"}
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
