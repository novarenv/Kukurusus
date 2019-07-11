package com.example.kukurusus.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Kursus implements Parcelable {
    private String name, price, photo, location, desc, certif, kuota, schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCertif() {
        return certif;
    }

    public void setCertif(String certif) {
        this.certif = certif;
    }

    public String getKuota() {
        return kuota;
    }

    public void setKuota(String kuota) {
        this.kuota = kuota;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.price);
        dest.writeString(this.photo);
        dest.writeString(this.location);
        dest.writeString(this.desc);
        dest.writeString(this.certif);
        dest.writeString(this.kuota);
        dest.writeString(this.schedule);
    }

    public Kursus() {
    }

    protected Kursus(Parcel in) {
        this.name = in.readString();
        this.price = in.readString();
        this.photo = in.readString();
        this.location = in.readString();
        this.desc = in.readString();
        this.certif = in.readString();
        this.kuota = in.readString();
        this.schedule = in.readString();
    }

    public static final Parcelable.Creator<Kursus> CREATOR = new Parcelable.Creator<Kursus>() {
        @Override
        public Kursus createFromParcel(Parcel source) {
            return new Kursus(source);
        }

        @Override
        public Kursus[] newArray(int size) {
            return new Kursus[size];
        }
    };
}
