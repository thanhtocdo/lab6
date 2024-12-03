package com.example.and2_lab6;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    public static final String CHANNEL_ID = "CHANNEL_ID";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    @SuppressLint("NewApi")
    private void createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.DONUT){
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "CHANNEL_ID",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            channel.setDescription("Notification");
            NotificationManager manager = getSystemService(NotificationManager.class);
            if (manager != null){
                manager.createNotificationChannel(channel);
            }
        }
    }
}
