package com.example.madridopen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /*


    private String getUrlOpenDataCulture(){
        return "https://datos.madrid.es/egob/catalogo/300107-0-agenda-actividades-eventos.json";
    }

    private func getCulturalActivities(){
        val gsonRequest = GsonRequest(getUrl(item.getLat(), item.getLon()), Forecast::class.java, null, Response.Listener { forecast ->
            //setLoading(false);
            if (forecast != null) {
                val placeW = PlaceWeatherView(forecast, fName, id)
                placesArray!!.add(placeW)
                adapter!!.addPlace(placeW)
                adapter!!.notifyDataSetChanged()
            }
        }, Response.ErrorListener { error ->
                //setLoading(false);
                Log.d("dataKO", "fail to load forecast data " + error.message)
        })
        com.lorena.yourweather.network.RequestsManager.getInstance().addToRequestQueue(context, gsonRequest)
    }
    */

    /*

    private fun getWeatherPlaces() {
        doAsync {
            val db = FavoritesPlacesDatabase.getFavoritesPlacesDatabase(activity)
            val fvs: List<FavoritePlace> = db.favoritesPlacesDao().all

            uiThread {
                if (fvs != null) {
                    if (fvs.isEmpty()){
                        (activity!!.findViewById<View>(R.id.tvNoPlaces) as TextView).visibility = View.https://gitlab.com/lorena.sierra/yourweatherandroid.gitVISIBLE
                    }
                    else {
                        (activity!!.findViewById<View>(R.id.tvNoPlaces) as TextView).visibility = View.INVISIBLE

                        for (item in fvs!!) {
                            val fName = item.getName()
                            val id = item.id
                            // Log.d("db", "place view id "+ item.getId());
                            val gsonRequest = GsonRequest(getUrl(item.getLat(), item.getLon()), Forecast::class.java, null, Response.Listener { forecast ->
                                //setLoading(false);
                                if (forecast != null) {
                                    val placeW = PlaceWeatherView(forecast, fName, id)
                                    placesArray!!.add(placeW)
                                    adapter!!.addPlace(placeW)
                                    adapter!!.notifyDataSetChanged()
                                }
                            }, Response.ErrorListener { error ->
                                    //setLoading(false);
                                    Log.d("dataKO", "fail to load forecast data " + error.message)
                            })
                            RequestsManager.getInstance().addToRequestQueue(context, gsonRequest)
                        }
                    }

                }

            }
        }
    }
*/
}
