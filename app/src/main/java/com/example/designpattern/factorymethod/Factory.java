package com.example.designpattern.factorymethod;

public abstract class Factory {
    public final IdCard create (String owner){     // create 메소드, return 값 Product
        IdCard p = createProduct(owner);           // createProduct 메소드 통해 Product 생성
        registerProduct(p);                         // owner List 에 owner 등록 (사용안함)
        return p;
    }
    protected abstract IdCard createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
