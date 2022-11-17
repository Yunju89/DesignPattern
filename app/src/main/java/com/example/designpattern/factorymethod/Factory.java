package com.example.designpattern.factorymethod;

public abstract class Factory {
    public final Product create (String owner){     // create 메소드, return 값 Product 인스턴스
        Product p = createProduct(owner);           // createProduct 메소드 통해 생성 (파라미터로 오너 값 받는다)
        registerProduct(p);                         // owner List 에 owner 등록 (사용안함)
        return p;
    }
    protected abstract Product createProduct(String owner);     // 메서드 통해 생성
    protected abstract void registerProduct(Product product);   //ownerList 에서
}
