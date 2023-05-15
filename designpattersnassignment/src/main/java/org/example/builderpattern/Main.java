package org.example.builderpattern;

public class Main {
    public static void main(String[] args) {
        House house = new HouseBuilder("villa")
                .price(568980.25)
                .furnishedType("Fully furnished")
                .build();
        System.out.println(house);
    }
}
