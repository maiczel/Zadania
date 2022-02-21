
import java.util.Scanner;

public class Main {

    /*ćwiczenie 8
▪ stwórz obiekt car1 z wartością name = “car1”, maxSpeed = 100;
▪ stwórz obiekt car2 z wartością name = “car2”, maxSpeed = 200;
▪ stwórz warunek, który wypisze nazwę pojazdu o większej wartości pola
maxSpeed
▪ *stwórz metodę, który obiektowi o większej
wartości pola maxSpeed przypisze nową wartość
pola name => “faster car”
▪ *wypisz wartość name obydwu obiektów
*/

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("car1");
        car1.setMaxSpeed(100);

        Car car2 = new Car();
        car2.setName("car2");
        car2.setMaxSpeed(200);


        if (car1.getMaxSpeed() > car2.getMaxSpeed()){
            System.out.println(car1.getName() + " jest szybszy");
        } else if(car2.getMaxSpeed() > car1.getMaxSpeed()){
            System.out.println(car2.getName() + " jest szybszy");
        } else{
            System.out.println("Prędkośc jest taka sama");
        }
        fasterCar();

    }

    public static void fasterCar(){
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setMaxSpeed(100);
        car1.setName("car1");
        car2.setMaxSpeed(200);
        car2.setName("car2");
        if(car1.getMaxSpeed() > car2.getMaxSpeed()){
            car1.setName("Faster car");
        }else if(car2.getMaxSpeed() > car1.getMaxSpeed()){
            car2.setName("Faster car");
        }
        System.out.println();
        System.out.println(car1.getName());
        System.out.println(car2.getName());

    }
}