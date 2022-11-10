package com.example.designpattern.observer;

import android.util.Log;

public class DigitObserver implements Observer {        // Observer 구현
    @Override
    public void update(NumberGenerator generator) {
        Log.d("yj : DigitObserver", ""+generator.getNumber());
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
