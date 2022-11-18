package com.example.designpattern.adapter;

import android.util.Log;

public class Adapter implements MailSenderA {

    private final MailSenderB mailSenderB;
    public Adapter(MailSenderB mailSenderB) {
        this.mailSenderB = mailSenderB;
    } // 생성자 주입


    @Override
    public void send(String sendInfo) {
        Log.d("yj : Adapter", "Adapter 에서 mailSenderB 실행");    //기존 send 호출
        mailSenderB.sendApi(sendInfo);
    }
}
