package factory;

public class ProductFactory {

    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("AirConditioner")) {
            return new AirConditioner();
        } else if (type.equalsIgnoreCase("Refrigerator")) {
            return new Refrigerator();
        } else {
            throw new IllegalArgumentException("Invalid product type.");
        }
    }
}
