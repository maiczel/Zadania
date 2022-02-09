
public class main {

    public static void main(String[] args) {

        Engine engine = new Engine();

        Car car1 = new Car();
        Car car2 = new Car();


        car1.name = "car1";
        car1.maxSpeed = 180;
        car1.engine = engine;

        System.out.println(car1.maxSpeed);
        System.out.println(car1.name);
        System.out.println(car1.engine.power);
        System.out.println(car1.engine.capacity);

    }
}
