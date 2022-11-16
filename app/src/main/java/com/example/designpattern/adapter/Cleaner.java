package com.example.designpattern.adapter;

import android.util.Log;

public class Cleaner implements Electronic220v {
    @Override
    public void connect() {
        Log.d("yj : connect", "청소기 220v on");
    }
}
