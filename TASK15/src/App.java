/*ćwiczenie 15
▪ pobierz za pomocą klasy Scanner dwie wartości:
- tekst (name)
- liczbę (engine.power)
▪ przypisz je do pól obiektu klasy Car
▪ wypisz wartości tego obiektu */

import java.util.Scanner;

public class App {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int power = scanner.nextInt();

        Engine engine = new Engine();

        Car car = new Car();
        car.setName(name);
        car.setEngine(engine);
        car.getEngine().setPower(power);

        System.out.println("Name is: " + car.getName());
        System.out.println("Power is: " + car.getEngine().getPower());

    }
}
