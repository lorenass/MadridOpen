package com.example.madridopen.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.volley.Response
import com.example.madridopen.R
import com.example.madridopen.model.Activity
import com.example.madridopen.network.GsonRequest
import com.example.madridopen.network.RequestsManager

class CardsListFragment: Fragment() {


    companion object {
        fun newInstance(): CardsListFragment {
            return CardsListFragment()
        }
    }


    private fun getUrl(): String {
        return "https://datos.madrid.es/egob/catalogo/300107-0-agenda-actividades-eventos.json"
    }

    private fun getCards() {
        val gsonRequest = GsonRequest(getUrl(), Activity::class.java,null,  Response.Listener { activity ->
            //setLoading(false);
            if (activity != null) {
                Log.d("api", "data es string " + activity);
                /*
                val placeW = PlaceWeatherView(forecast, fName, id)
                placesArray!!.add(placeW)
                adapter!!.addPlace(placeW)
                adapter!!.notifyDataSetChanged()
                */
            }
        }, Response.ErrorListener { error ->
            //setLoading(false);
            Log.d("dataKO", "fail to load data " + error.message)
        })
        RequestsManager.getInstance().addToRequestQueue(context, gsonRequest)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("card", "on cretae")
        return inflater.inflate(R.layout.fragment_cards_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("card", "dentro")
        this.getCards()
    }

    }