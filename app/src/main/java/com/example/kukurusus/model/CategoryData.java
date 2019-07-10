package com.example.kukurusus.model;

import java.util.ArrayList;

public class CategoryData {
    public static String[][] data = new String[][]{
            {"Photo", "Category"},
            {"Photo", "Category"},
            {"Photo", "Category"},
            {"Photo", "Category"},
            {"Photo", "Category"},
            {"Photo", "Category"},
            {"Photo", "Category"}
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
