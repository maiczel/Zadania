public class Main {
    public static void main(String[] args) {

        /* ĆWICZENIE 0, VERSION2.
        Stwórz klasę MyClass, która ma dwa Pola:
        -liczbowe (int) o nazwie number
        - tekstowe (String) o nazwie text
         w metodzie main() stwórz dwa obiekty typu MyClass
         Uzupełnij wszystkie pola wartościami
         wypisz wartości pól za pomoca metody:*/

        MyClass myClass1 = new MyClass(30, "Klasa 1A");
        MyClass myclass2 = new MyClass(32, "Klasa 1B");

        System.out.println(myClass1.number + " " + myClass1.text);
        System.out.println(myclass2.number + " " + myclass2.text);
    }
}
