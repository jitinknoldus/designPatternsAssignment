package singleton;

public class Circle {
    private static Circle circle;

    public Circle() {
    }

    public static Circle getCircle(){
        if(circle == null){
            synchronized (Circle.class){
                if(circle == null){
                    circle = new Circle();
                }
            }
        }
        return circle;
    }

    public void draw(){
        System.out.println("Drawing Circle");
    }

}
