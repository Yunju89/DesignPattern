package com.example.designpattern.templatemethod;

import android.util.Log;

public abstract class CoffeeTemplate {
    public final void makeCoffee() {
        boilWater();
        putEspresso();
        putIce();
        putExtra();
    }

    // subClass 에게 확장/변화가 필요한 코드만 작성한다.
    abstract void putExtra();

    // 공통 부분을 상위 클래스에서 해결, 코드 중복을 최소화 시킨다.
    private void boilWater() {
        Log.d("yj : makeCoffee", "boilWater");
    }

    private void putEspresso() {
        Log.d("yj : makeCoffee", "putEspresso");
    }

    private void putIce() {
        Log.d("yj : makeCoffee", "putIce");
    }
}

