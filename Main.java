public class Main {
    public static void main(String[] args) {

        /* CWICZENIE 1A
        Stwórz klasę Engine, która ma pola typu
        Integer (nazwy: power, capacity)
        - w metodzie main() stwórz dwa obiekty typu
        Engine,
        -uzupełnij wszystkie pola wartościami
        wypisz wynik za pomoca metody sout*/

        Engine engine1 = new Engine(100, 1500);
        Engine engine2 = new Engine(150, 2200);
        System.out.println("power " + engine1.power + " " + engine1.capacity );
        System.out.println("power " + engine1.power + " " + engine1.capacity );


    }
}
