public class Main {
    public static void main(String[] args){

/*  ćwiczenie 4b
▪ rozbuduj klasy Car i Engine o odpowiednie gettery i settery
▪ ustaw wartości obiektów za pomocą setterów
▪ wyświetl ustawione wartości za pomocą getterów*/

        Car car = new Car();
        Engine engine = new Engine();


        car.setName("Opel");
        car.setMaxSpeed(185);
        car.setEngine(engine);
        car.getEngine().setPower(100);
        car.getEngine().setCapacity(2000);


        System.out.println(car.getName());
        System.out.println(car.getMaxSpeed());
        System.out.println(car.getEngine().getPower());
        System.out.println(car.getEngine().getCapacity());


    }
}

