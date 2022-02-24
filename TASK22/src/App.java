/*ćwiczenie 22
▪ pobierz z konsoli (Scanner) wartość liczby całkowitej
▪ łap wyjątek, gdy ktoś poda niepoprawny parametr (np. tekst)
▪ pobieraj wartość do momentu, aż będzie liczbą całkowitą
np.
podaj liczbę:
1,3
abcd
11*/

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("Podaj liczbę całkowitą:");
        Integer number = null;
        do {
            number = getInputFromUser();
        } while (number == null);

        System.out.println(number);
    }

    private static Integer getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        Integer result = null;
        try {
            result = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("błędna wartość - podaj liczbę całkowitą");
        }

        return result;
    }
}

