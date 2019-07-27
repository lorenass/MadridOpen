package com.example.madridopen.notifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import androidx.core.app.NotificationCompat;

import com.example.madridopen.R;

//import com.example.madridopen.model.Forecast;
import com.example.madridopen.model.Notification;

import static android.content.Context.NOTIFICATION_SERVICE;

public class NotificationBuilder {

    public NotificationBuilder (Context context, Intent intent, Notification noti, String icon, int ID){

        NotificationManager notificationManager;
        notificationManager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
        initChannels(notificationManager);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "MadridOpen");
//        Intent emptyIntent = new Intent(context, Forecast.class);
        Intent emptyIntent = new Intent(context, com.example.madridopen.model.Notification.class);
        PendingIntent pi = PendingIntent.getActivity(context, 0, emptyIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder.setSmallIcon(R.drawable.ic_menu);
            builder.setColor(context.getResources().getColor(R.color.colorAccent));
        } else {
            builder.setSmallIcon(R.drawable.ic_menu_blue);
        }

        builder  .setWhen(System.currentTimeMillis())
                .setLargeIcon(bitmapIcon(context, this.getLargeIcon(context, icon)))
                .setContentTitle(noti.name)
                .setContentText(noti.title)
                .setContentIntent(pi)
                .setStyle(getBigTextStyle(noti))
                .setPriority(android.app.Notification.PRIORITY_MAX);

        notificationManager.notify(++ID, builder.build());
    }

    private int getLargeIcon(Context context, String icon) {
        return context.getResources().getIdentifier(icon, "drawable", context.getPackageName());
    }

    private Bitmap bitmapIcon(Context context, int id) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(),id);
        return bitmap;
    }

    private void initChannels(NotificationManager notificationManager) {
        if(Build.VERSION.SDK_INT < 26){
            return;
        }

        NotificationChannel notificationChannel = new NotificationChannel("YOURWEATHER", "Notificaciones meteorológicas", NotificationManager.IMPORTANCE_HIGH);
        notificationChannel.setShowBadge(true);
        notificationChannel.setDescription("Canal de notificaciones meteorológicas");
        notificationChannel.setLightColor(Color.CYAN);
        notificationChannel.setLockscreenVisibility(android.app.Notification.VISIBILITY_PUBLIC);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private NotificationCompat.Style getBigTextStyle(Notification n) {
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.bigText( n.description)
                .setBigContentTitle(n.title)
                .setSummaryText(n.name);
        return bigTextStyle;
    }


}
