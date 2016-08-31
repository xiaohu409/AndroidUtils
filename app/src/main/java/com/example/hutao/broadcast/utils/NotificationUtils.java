package com.example.hutao.broadcast.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;

/**
 * Created by hutao on 2016-08-13.
 */

public class NotificationUtils {

    private NotificationManager manager;

    public NotificationUtils(Context context) {
        manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void notify(int id, Notification notification) {
        manager.notify(id, notification);
    }
}
