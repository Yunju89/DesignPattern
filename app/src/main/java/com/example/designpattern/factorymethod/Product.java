package com.example.designpattern.factorymethod;

public abstract class Product {
    public abstract void use();
}


/**
 *
 * Product 추상클래스를 상속 받은 IdCard 클래스를 만들고,
 * IdCard 클래스 생성자에서 owner 를 파라미터로 받아서 카드 제작, use 메소드 오버라이드
 *
 * Factory 추상클래스에서 create 메소드 통해 - Factory 상속받은 IdCardFactory 에서 createProduct 메소드로 IdCard 객체생성
 *
 */