public class Main {
    public static void main(String[] args){

         /* ĆWICZENIE 0, VERSION2.
        Stwórz klasę MyClass, która ma dwa Pola:
        -liczbowe (int) o nazwie number
        - tekstowe (String) o nazwie text
         w metodzie main() stwórz dwa obiekty typu MyClass
         Uzupełnij wszystkie pola wartościami
         wypisz wartości pól za pomoca metody:*/

        MyClass myClass1 = new MyClass();
        System.out.println("myclass 1: " + myClass1.number + " " + myClass1.text);

        MyClass myclass2 = new MyClass();
        System.out.println("myClass 2: " + myclass2.number + " " + myclass2.text);
    }
}
