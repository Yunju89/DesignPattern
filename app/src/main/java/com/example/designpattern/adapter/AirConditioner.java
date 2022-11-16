package com.example.designpattern.adapter;

import android.util.Log;

public class AirConditioner implements Electronic220v {
    @Override
    public void connect() {
        Log.d("yj : connect", "에어컨 220v on");
    }
}

