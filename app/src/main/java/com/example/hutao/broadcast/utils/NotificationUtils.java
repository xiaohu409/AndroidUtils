package com.example.hutao.broadcast.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

import com.example.hutao.broadcast.R;

/**
 * Created by hutao on 2016-08-13.
 */

public class NotificationUtils {

    private static final int id = 517;
    
    public static void showNotification(Context context, String title, String text,Intent intent) {
        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);

        Notification.Builder builder = new Notification.Builder(context);
        builder.setTicker(title)
                .setContentTitle(title)
                .setContentText(text)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher);

        notificationManager.notify(id, builder.build());
    }
}
