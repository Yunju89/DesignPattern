package com.example.designpattern.adapter;

import android.util.Log;

public class HairDryer implements Electronic110v {
    @Override
    public void powerOn() {
        Log.d("yj : connect", "헤어 드라이기 110v");
    }
}

