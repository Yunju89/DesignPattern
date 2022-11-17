package com.example.designpattern.templatemethod;

import android.util.Log;

public class IceLatte extends CoffeeTemplate {

    @Override
    void putExtra() {
        Log.d("yj : IceLatte", "putExtra milk");
    }
}
