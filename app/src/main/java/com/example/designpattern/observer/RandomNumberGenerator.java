package com.example.designpattern.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();               // 난수 생성
    private int number;

    @Override
    public int getNumber() {                            // 숫자 가져가기
        return number;
    }

    @Override
    public void execute() {                            // 숫자 생성
        for (int i = 0; i < 10; i++) {                 // 20번 반복
            number = random.nextInt(50);         // 0~50까지, int 형 파라미터를 입력하면, 0에서 그 파라미터 미만의 랜덤한 정수를 반환한다.
            notifyObservers();                          // 갱신
        }
    }
}
