
/*ćwiczenie 18
▪ pobierz z klawiatury dowolny tekst (jedna linia);
▪ stwórz metodę, która zwróci ten napis “od tyłu”
▪ wypisz na konsolę odwrócony napis
*/

import javax.print.DocFlavor;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String reversed = reverseString(text);
        System.out.println(reversed);

    }
    public static String reverseString(String innaNazwa){
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(innaNazwa);
    return stringBuilder.reverse().toString();
    }
}

