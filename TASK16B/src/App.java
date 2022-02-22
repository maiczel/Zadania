/*ćwiczenie 16B
▪ stwórz 2 obiekty typu Car o takich samych wartościach
▪ porównaj je za pomocą instrukcji if i operatorów:
- ==
- equals()
▪ wypisz ich hashCode */

public class App {
 public static void main(String[] args){

     Engine engine = new Engine();



     Car car1 = new Car();
     car1.setName("Opel");
     car1.setMaxSpeed(185);
     car1.setEngine(engine);
     car1.getEngine().setCapacity(2000);
     car1.getEngine().setPower(150);

     Car car2 = new Car();
     car2.setName("Opel");
     car2.setMaxSpeed(185);
     car2.setEngine(engine);
     car2.getEngine().setCapacity(2000);
     car2.getEngine().setPower(150);

     if(car1 == car2){
         System.out.println("car1 == car2");
     }
     if(car1.equals(car2)){
         System.out.println("car1.equals(car2)");
     }
 }


}
