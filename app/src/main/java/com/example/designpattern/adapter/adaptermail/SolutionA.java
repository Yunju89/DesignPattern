package com.example.designpattern.adapter.adaptermail;

import android.util.Log;

public class SolutionA implements MailSenderA {
    @Override
    public void send(String sendInfo) {
        Log.d("yj : send", "SolutionA 에서 실행 :" + sendInfo);
    }
}
