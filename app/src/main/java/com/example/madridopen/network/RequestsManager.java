package com.example.madridopen.network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class RequestsManager {

    private static RequestsManager mInstance;
    private RequestQueue mRequestQueue;

    private RequestsManager() {
    }

    public static synchronized RequestsManager getInstance() {
        if (mInstance == null) {
            mInstance = new RequestsManager();
        }
        return mInstance;
    }

    private RequestQueue getRequestQueue(Context ctx) {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(ctx.getApplicationContext());
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Context ctx, Request<T> req) {
        getRequestQueue(ctx).add(req);
    }
}


