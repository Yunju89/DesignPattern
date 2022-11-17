package com.example.designpattern.templatemethod;

import android.util.Log;

public class IceAmericano extends CoffeeTemplate {

    @Override
    void putExtra() {
        Log.d("yj : IceAmericano", "putExtra water");
    }
}

