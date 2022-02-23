import java.util.Scanner;
/*ćwiczenie 19
▪ pobierz z klawiatury dowolny tekst (jedna linia);
▪ w tekście mogą być kropki, ale nie muszą
▪ stwórz metodę, która zwróci ilość kropek w tekście
▪ wypisz na konsolę wyliczoną ilość kropek */

public class App {
    public static void main(String[] args){


        // Rozwiazanie NR1.

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int numberOfDotts = 0;
        int numberOFDotts2 = 0;

        line.toCharArray();
        char[] chars = line.toCharArray();

        for(int i = 0; i < chars.length; i++ ){
            if(chars[i] == '.'){
                numberOfDotts++;
            }
        }
        System.out.println(numberOfDotts);

        //ROZWIĄZANIE NR2.

        for(int i = 0; i <line.length(); i ++){
        if(line.charAt(i) == '.'){
            numberOFDotts2++;
        }
        }
            System.out.println(numberOFDotts2);

        //ROZWIĄZANIE NR3

        String replacement = line.replace(".","");
        numberOfDotts =  line.length() - replacement.length();
        System.out.println(numberOfDotts);
    }
}
