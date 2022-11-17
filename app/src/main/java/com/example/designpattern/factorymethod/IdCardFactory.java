package com.example.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory{
    private List ownerList = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        ownerList.add(((IdCard)product).getOwner());
    }

    public List getOwnerList(){
        return null;
    }
}
