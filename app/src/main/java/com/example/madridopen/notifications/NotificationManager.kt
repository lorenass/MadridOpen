package com.example.madridopen.notifications

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.preference.PreferenceManager

//import android.support.v7.preference.PreferenceManager
import android.util.Log

import com.android.volley.Response
import com.android.volley.VolleyError

//import com.lorena.yourweather.db.FavoritesPlacesDatabase
//import com.lorena.yourweather.model.FavoritePlace
//import com.lorena.yourweather.model.Forecast
import com.example.madridopen.model.Notification
//import com.lorena.yourweather.model.PlaceWeatherView
import com.example.madridopen.network.GsonRequest
import com.example.madridopen.network.RequestsManager


class NotificationManager(context: Context, intent: Intent) {


    init {
/*
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val notification_current = prefs.getBoolean("notification_current", true)
        val notification_all = prefs.getBoolean("notification_all", true)

        if (notification_all) {
            this.sendAllFavsWeatherNotification(context, intent)
        } else {
            if (notification_current) {
                this.sentNotificationSavedLocation(context, intent)
            } else {
                Log.d("notif", "no actived notifications")
            }
        }
    }

    private fun sentNotificationSavedLocation(context: Context, intent: Intent) {
        doAsync {
            val db = FavoritesPlacesDatabase.getFavoritesPlacesDatabase(context)
            val fv = db.favoritesPlacesDao().findByName("Your location")
            Log.d("notif", "location no exists")

            uiThread {
                if (fv != null) {
                    Log.d("notif", "location es lat=" + fv.getLat() + "and lon=" + fv.getLon())
                    sendWeatherNotification(context, fv, intent, 0)
                }
            }
        }
    }

    private fun sendWeatherNotification(context: Context, item: FavoritePlace, intent: Intent, ID: Int) {


        val gsonRequest = GsonRequest(getForecastAPIUrl(item.getLat(), item.getLon()), Forecast::class.java, null, Response.Listener { forecast ->
            //setLoading(false);
            if (forecast != null) {
                val placeW = PlaceWeatherView(forecast, item.getName(), item.id)
                Log.d("notif", "fok placeweatherapi 2 " + placeW.description)

                val dt = System.currentTimeMillis() / 1000
                val iDt = dt.toInt()

                val text = getNotificationText (context, placeW.icon);
                val notification = Notification(placeW.description, placeW.cityName, text, iDt)

                addNotification(context, notification)
                NotificationBuilder(context, intent, notification, placeW.icon, ID)

            }
        }, Response.ErrorListener { error ->
            //setLoading(false);
            Log.d("dataKO", "fail to load forecast data " + error.message)
        })
        RequestsManager.getInstance().addToRequestQueue(context, gsonRequest)
    }

    private fun getForecastAPIUrl(lat: Double, lon: Double): String {

        Log.d("url", "lat  $lat y lon $lon")
        return "http://api.openweathermap.org/data/2.5/forecast?lat=$lat&lon=$lon&lang=es&units=metric&APPID=a9151d4b595d730bdc2da1f88c0bb4f2"
    }

    private fun  getNotificationText (context: Context, icon: String): String  {
        val text = context.getString(R.string.notif_weather_not_found);
        try {
            val name = "notif_" + icon;
            return  getStringResourceByName(context, name)
        }
        catch (e: Exception ) {
            return text
        }
    }

    private fun getStringResourceByName(context:Context, aString: String): String {
        val packageName = context.getPackageName()
        val resId = context.getResources().getIdentifier(aString, "string", packageName)
        return context.getString(resId)
    }

    private fun sendAllFavsWeatherNotification(context: Context, intent: Intent) {
        doAsync {
            var ID = 0
            val db = FavoritesPlacesDatabase.getFavoritesPlacesDatabase(context)
            val fv = db.favoritesPlacesDao().all
            uiThread {
                for (f in fv) {
                    sendWeatherNotification(context, f, intent, ID)
                    ID = ID + 1
                }
            }
        }

    }


    private fun addNotification(context: Context, notification: Notification) {
        doAsync {
            val db = FavoritesPlacesDatabase.getFavoritesPlacesDatabase(context)
            db.notificationsDao().insert(notification)
        }

*/
    }

}
