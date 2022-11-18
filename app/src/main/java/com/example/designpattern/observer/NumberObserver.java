package com.example.designpattern.observer;

import android.util.Log;

public class NumberObserver implements Observer {
    @Override
    public void update(int number) {
        Log.d("yj : DigitObserver", ""+ number);
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
