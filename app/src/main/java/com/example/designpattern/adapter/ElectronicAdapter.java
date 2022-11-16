package com.example.designpattern.adapter;

import android.util.Log;

public class ElectronicAdapter implements Electronic110v{

    private Electronic220v electronic220v;

    public ElectronicAdapter(Electronic220v electronic220v){
        this.electronic220v = electronic220v;
    }

    @Override
    public void powerOn() {
        electronic220v.connect();
        Log.d("yj : adapter", "어댑터에서 실행");
    }
}
