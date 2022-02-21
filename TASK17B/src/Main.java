import org.w3c.dom.ls.LSOutput;

public class Main {

      /* TASK17B
        - stwórz metodę przyjmującą parametr typu in
        - wewnątrz metody stwórz tablicę 10-elementową typu int
        - uzupełnij tablicę liczbami całkowitymi, zazynając od tej podanej w parametrze
        - wypisz wszystkie elementy tablicy
        */


    public static int[] prepareArray(int parametr) { // rozwazanie na kursie
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = parametr++;
            System.out.println(array[i]);

        }
        return array;
    }


    public static void metoda(int index) {

        int[] tab = new int[10];                  // moja metoda rozwiązania
        for (int i = 0 + index; i < 10 + index; i++) {
            tab[index] = i;
            System.out.println(tab[index]);
        }
    }

    public static void main(String[] args) {

        metoda(4);
        System.out.println();
        prepareArray(4);

    }
}
