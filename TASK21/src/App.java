
/*ćwiczenie 21
▪ pobierz z konsoli (Scanner) wartość liczby typu Double
▪ łap wyjątek, gdy ktoś poda niepoprawny parametr (np. tekst)
- wypisz wtedy komunikat o błędzie
▪ jeżeli wynik jest poprawny, wypisz wartość pobranej liczby */

import java.util.Scanner;
public class App {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        try{
            Double liczba = scanner.nextDouble();
            System.out.println(liczba * 10);
        }catch (Exception e){
            System.out.println("Podana wartość musi być liczbą");
        }
    }

}
