package com.example.shami.dhakaguide;

import android.content.Context;
import android.net.ConnectivityManager;

public class InternetConnection {
    public static boolean checkConnection(Context context) {
        return  ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }
}
