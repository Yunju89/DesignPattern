package com.example.designpattern.factorymethod;

import android.util.Log;

public class IdCard extends Product{
    private String owner;

    IdCard(String owner){
        Log.d("yj : IdCard", owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        Log.d("yj : IdCard", owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}
