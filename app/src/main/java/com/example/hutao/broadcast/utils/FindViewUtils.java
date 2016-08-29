package com.example.hutao.broadcast.utils;

import android.app.Activity;
import android.view.View;

/**
 * Created by hutao on 2016-08-29.
 */

public class FindViewUtils {

    private Activity context;

    public FindViewUtils(Activity context) {
        this.context = context;
    }

    public <T extends View> T findView(int id) {
        return (T) context.findViewById(id);
    }

}
