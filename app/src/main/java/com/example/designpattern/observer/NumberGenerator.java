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
        Iterator it = observerList.iterator();             // Iterator 컬렉션(Set, List, Map)에 저장되어 있는 것을 일관성있게 꺼내 오는 방법

        while (it.hasNext()) {                          // 다음 읽어올 요소가 있는 동안 꺼내오기
            Observer observer = (Observer) it.next();   // Object obj = it.next();  -> 요소 하나씩 꺼내는 방법
            observer.update(number);              // Observer 클래스의 update 사용하여 NumberGenerator 변경 값을 알림
        }
    }

    public void execute() {                            // 숫자 생성
        for (int i = 0; i < 10; i++) {                 // 10번 반복
            number = random.nextInt(50);         // 0~50까지, int 형 파라미터를 입력하면, 0에서 그 파라미터 미만의 랜덤한 정수를 반환한다.
            notifyObservers();                          // 갱신
        }
    }
}