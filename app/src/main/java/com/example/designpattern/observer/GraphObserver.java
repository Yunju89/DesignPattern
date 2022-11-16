package com.example.designpattern.observer;

import android.util.Log;

public class GraphObserver implements Observer{        // Observer 구현

    StringBuffer str = new StringBuffer();

    @Override
    public void update(int number) {
        str.setLength(0);
        int count = number;
        for(int i = 0; i < count; i++){
            str.append("*");
        }
        Log.d("yj : GraphObserver", "" + str);
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
