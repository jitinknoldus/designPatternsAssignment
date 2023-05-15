package factory;

public class AirConditioner implements Product{
    @Override
    public void specifications() {
        System.out.println("Rating - 5 star");
        System.out.println("Manufacturer - Hitachi");
    }
}
