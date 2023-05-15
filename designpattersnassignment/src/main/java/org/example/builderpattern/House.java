package org.example.builderpattern;

public class House {
    String type;
    Double price;           //price quoted in $

    String furnishedType;

    public House(String type, Double price, String furnishedType) {
        this.type = type;
        this.price = price;
        this.furnishedType = furnishedType;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", furnishedType='" + furnishedType + '\'' +
                '}';
    }
}
