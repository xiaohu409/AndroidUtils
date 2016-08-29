package com.example.hutao.broadcast.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * Created by hutao on 2016-08-29.
 */

public class SharePreUtils {

    private SharedPreferences preferences;

    public SharePreUtils(Context context, String fileName) {
        preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
    }

    public <T> void put(String key, T value) {
        SharedPreferences.Editor editor = preferences.edit();
        if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        }
        else if (value instanceof String){
            editor.putString(key, (String) value);
        }
        editor.apply();
    }

    public void remove(String key) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove(key);
        editor.apply();
    }
}
