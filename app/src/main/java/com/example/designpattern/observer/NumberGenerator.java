package com.example.designpattern.observer;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class NumberGenerator {
    private final ArrayList<Observer> observerList = new ArrayList<>();      // Observer 목록 저장 할 ArrayList

    private Random random = new Random();
    private int number;

    public void addObserver(@NonNull Observer observer) {        // Observer 추가
        observerList.add(observer);
    }

    public void deleteObserver(@NonNull Observer observer) {     // Observer 삭제
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(number);
        }
    }

    public void execute() {
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(50);
            notifyObservers();                          // 갱신 (notifyObserver) 실행
        }
    }
}