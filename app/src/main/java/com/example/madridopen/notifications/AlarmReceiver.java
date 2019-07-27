package com.example.madridopen.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.madridopen.R;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Log.d("LORENA2", "Alarm!!!");

        //Notification notification = new Notification(context, intent);
        NotificationManager notification = new NotificationManager(context, intent);
    }


}
