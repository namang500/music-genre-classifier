package com.example.adityaaggarwal.audiofile_sender;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Aditya Aggarwal on 18-11-2017.
 */

public class oneSingleton {

    private static oneSingleton mInstance;
    private RequestQueue requestQueue;
    private static Context mCtx;


    private oneSingleton(Context context)
    {
        mCtx =  context;
        requestQueue = getRequestQueue();
    }

    private RequestQueue getRequestQueue()
    {
        if(requestQueue == null)
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        return requestQueue;
    }

    public static synchronized oneSingleton getInstance(Context context)
    {
       if(mInstance == null)
       {
           mInstance = new oneSingleton(context);
       }
       return mInstance;
    }


    public<T> void addToRequestQue(Request<T> request)
    {
        getRequestQueue().add(request);
    }

}
