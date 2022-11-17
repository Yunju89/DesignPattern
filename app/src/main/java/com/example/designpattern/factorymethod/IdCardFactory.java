package com.example.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory{
    private List<String> ownerList = new ArrayList();

    @Override
    protected Product createProduct(String owner) {     // create 메서드에서 호출 Product 객체 반환
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        ownerList.add(((IdCard)product).getOwner());
    }

    public List getOwnerList(){
        return ownerList;
    }
}
