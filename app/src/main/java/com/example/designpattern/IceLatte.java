package com.example.designpattern;

import android.util.Log;

public class IceLatte extends CoffeeTemplate {

    @Override
    void putExtra() {
        Log.d("yj : IceLatte", "putExtra milk");
    }
}
