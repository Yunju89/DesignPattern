package com.example.designpattern.adapter.adaptermail;

import android.util.Log;

public class Adapter implements MailSenderA {

    private final MailSenderB mailSenderB;  // 생성자 주입

    public Adapter(MailSenderB mailSenderB) {
        this.mailSenderB = mailSenderB;
    }

    @Override
    public void send(String sendInfo) {
        Log.d("yj : Adapter", "어댑터에서 mailSenderB 실행");    //기존 send 호출
        mailSenderB.sendApi(sendInfo);
    }
}
