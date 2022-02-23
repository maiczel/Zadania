public class App {
    public static void main(String[] args){

        Car car = new Car();
        car.setMaxSpeed(185);
        car.setName("OpelAstraH");
        car.setColor(Color.BLUE);

        System.out.println(car.getName() + " " + car.getMaxSpeed() + " " + car.getColor());

    }
}