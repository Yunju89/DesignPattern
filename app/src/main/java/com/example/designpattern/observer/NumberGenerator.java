package com.example.designpattern.observer;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class NumberGenerator {
    private final ArrayList observerList = new ArrayList();      // Observer 목록 저장 할 ArrayList

    private Random random = new Random();               // 난수 생성
    private int number;

    public void addObserver(@NonNull Observer observer) {        // Observer 추가
        observerList.add(observer);
    }

    public void deleteObserver(@NonNull Observer observer) {     // Observer 삭제
        observerList.remove(observer);
    }

    public void notifyObservers() {                        // Observer 알림 ↓
        for (Object o : observerList) {                    // Object 타입으로 for
            Observer observer = (Observer) o;              // Observer 타입으로 형 변환
            observer.update(number);                       // Observer 클래스의 update 사용하여 Number 값을 알림
        }
    }

    public void execute() {                            // 실행
        for (int i = 0; i < 10; i++) {                 // 10번 반복
            number = random.nextInt(50);         // 0~50까지, int 형 파라미터를 입력 -> 0에서 그 파라미터 미만의 랜덤한 정수를 반환.
            notifyObservers();                          // 갱신 (notifyObserver) 실행
        }
    }
}