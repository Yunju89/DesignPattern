package com.example.designpattern;

import android.util.Log;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        Log.d("yj : singleTonPattern", "인스턴스 생성");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}