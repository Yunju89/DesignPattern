package com.example.designpattern.adaptermail;

import android.util.Log;

public class Adapter implements MailSenderA {

    private final MailSenderB mailSenderB;  // 생성자 주입

    public Adapter(MailSenderB mailSenderB) {
        this.mailSenderB = mailSenderB;
    }

    @Override
    public void send(String sendInfo) {
        Log.d("yj : send", "Adapter 에서 mailSenderB 실행");    //기존 send 호출
        mailSenderB.sendApi(sendInfo);
    }
}
