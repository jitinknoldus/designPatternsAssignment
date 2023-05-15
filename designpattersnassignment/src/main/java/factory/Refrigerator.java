package factory;

public class Refrigerator implements Product {
    @Override
    public void specifications() {
        System.out.println("Rating - 4.2 stars");
        System.out.println("Manufacturer - Samsung");
    }
}
