package com.pluto.keeper;

import android.content.Context;
import android.content.SharedPreferences;

public class Utils {

    private static final String PREFERENCES_FILE = "MyPrefs";
    private static final Object lock = new Object();

    // Function to save a token in a thread-safe manner
    public static void saveToken(Context context, String token) {
        synchronized (lock) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("token", token);
            editor.apply();
        }
    }

    // Function to get a token in a thread-safe manner
    public static String getToken(Context context) {
        synchronized (lock) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
            return sharedPreferences.getString("token", null);
        }
    }

    // Add more utility functions as needed
}