package org.example.builderpattern;

public class HouseBuilder {
    String type;
    Double price;

    String furnishedType;

    public HouseBuilder(String type){
        this.type= type;
    }

    public HouseBuilder price(Double price){
        this.price = price;
        return this;
    }

    public HouseBuilder furnishedType(String furnishedType){
        this.furnishedType = furnishedType;
        return this;
    }

    public House build(){
        return new House(type,price,furnishedType);
    }

}
