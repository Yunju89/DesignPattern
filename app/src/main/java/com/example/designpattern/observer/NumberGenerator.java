package com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();      // Observer 목록 저장 할 ArrayList

    public void addObserver(Observer observer) {        // Observer 추가
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {     // Observer 삭제
        observers.remove(observer);
    }

    public void notifyObservers() {                     // Observer 알림 ↓
        Iterator it = observers.iterator();             // Iterator 컬렉션(Set, List, Map)에 저장되어 있는 것을 일관성있게 꺼내 오는 방법

        while (it.hasNext()) {                          // 다음 읽어올 요소가 있는 동안 꺼내오기
            Observer observer = (Observer) it.next();   // Object obj = it.next();  -> 요소 하나씩 꺼내는 방법
            observer.update(this);              // Observer 클래스의 update 사용하여 NumberGenerator 변경 값을 알림
        }
    }

    public abstract int getNumber();                    // 수를 취득할 abstract method

    public abstract void execute();                     // 수를 생성할 abstract method
}