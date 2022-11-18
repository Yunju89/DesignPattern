package com.example.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory{
    private ArrayList<Product> ownerList = new ArrayList<>();

    @Override
    protected IdCard createProduct(String owner) {     // create 메서드에서 호출 Product 객체 반환
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        ownerList.add(product);
    }

    public ArrayList<Product> getOwnerList(){
        return ownerList;
    }
}
