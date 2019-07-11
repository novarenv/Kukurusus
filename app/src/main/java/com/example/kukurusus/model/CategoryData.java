package com.example.kukurusus.model;

import com.example.kukurusus.R;

import java.util.ArrayList;

public class CategoryData {
    public static String[][] data = new String[][]{
            {Integer.toString(R.drawable.btn_bahasa), "Bahasa"},
            {Integer.toString(R.drawable.btn_code), "Program"},
            {Integer.toString(R.drawable.btn_masak), "Masak"},
            {Integer.toString(R.drawable.btn_setir), "Setir"},
            {Integer.toString(R.drawable.btn_rias), "Rias"},
            {Integer.toString(R.drawable.btn_education), "Pelajaran"},
            {Integer.toString(R.drawable.btn_selam), "Selam"},
            {Integer.toString(R.drawable.btn_bonsai), "Bonsai"}
    };

    public static ArrayList<Category> getListData(){
        Category category = null;
        ArrayList<Category> list = new ArrayList<>();
        for (String[] aData : data) {
            category = new Category();
            category.setPhoto(aData[0]);
            category.setName(aData[1]);

            list.add(category);
        }

        return list;
    }
}