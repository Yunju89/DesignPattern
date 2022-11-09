package com.example.designpattern;

import android.util.Log;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        Log.d("yj : singleTonPattern", "인스턴스 생성");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}