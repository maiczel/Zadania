/* ćwiczenie 14
▪ stwórz dwie zmienne typu Double
▪ pobierz je za pomocą klasy Scanner
▪ dodaj je do siebie
▪ wyświetl wynik
▪ ile wynosi 0,1 + 0,2 ? */


import java.util.Scanner;

public class App {
    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double variable1 = scanner.nextDouble();
        double variable2 = scanner.nextDouble();
        System.out.println(variable1 + variable2);


    }
}
