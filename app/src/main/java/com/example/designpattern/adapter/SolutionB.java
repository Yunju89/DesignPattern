package com.example.designpattern.adapter;

import android.util.Log;

public class SolutionB implements MailSenderB {
    @Override
    public void sendApi(String sendInfo) {
        Log.d("yj : sendApi", "SolutionB 에서 " + sendInfo);
    }
}
