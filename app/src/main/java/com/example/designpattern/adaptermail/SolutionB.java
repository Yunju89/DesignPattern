package com.example.designpattern.adaptermail;

import android.util.Log;

public class SolutionB implements MailSenderB {
    @Override
    public void sendApi(String sendInfo) {
        Log.d("yj : send", "SolutionB 에서 실행 :" + sendInfo);
    }
}
