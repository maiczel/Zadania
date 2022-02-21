/*ćwiczenie 9
        ▪ stwórz metodę, która pobiera liczbę całkowitą
        ▪ wykorzystaj instrukcję switch do sprawdzenia, czy liczba z parametru jest
        parzysta
        ▪ stwórz analogiczną metodę z wykorzystaniem if-else */

public class Main {
    public static void main (String[] args){

        printIsEven( 17);
        printIsEvenWithoutSwitch(10);

    }
    public static void printIsEven(int liczba){
        switch(liczba%2){
            case 0:
                System.out.println( liczba + " jest parzysta");
                break;
            case 1:
                System.out.println(liczba + " jest nieparzysta");
        }
    }
    public static void printIsEvenWithoutSwitch(int liczba){

        if(liczba%2 == 1){
            System.out.println(liczba + " Liczba jest nieparzysta");
        }else if (liczba % 2 == 0){
            System.out.println(liczba + " Liczba jest parzysta");
        }
    }

}
