package factory;

public class Main {
    public static void main(String[] args) {
        Product airConditioner = ProductFactory.createProduct("AirConditioner");
        Product refrigerator = ProductFactory.createProduct("Refrigerator");

        // Perform operations on the products
        airConditioner.specifications();
        refrigerator.specifications();
    }
}
