public class Main {
    public static void main(String[] args) {

        // Cwiczenie 0.
        //Stwórz klasę MyClass, która ma dwa Pola:
        //-liczbowe (int) o nazwie number
        //- tekstowe (String) o nazwie text
        // w metodzie main() stwórz dwa obiekty typu MyClass
        // Uzupełnij wszystkie pola wartościami
        // wypisz wartości pól za pomoca metody:

        MyClass myClass1 = new MyClass();
        myClass1.number = 30;
        myClass1.text = "1A";
        System.out.println(myClass1.number);
        System.out.println(myClass1.text);

        MyClass myClass2 = new MyClass();
        myClass2.number = 29;
        myClass2.text = "1B";
        System.out.println(myClass2.number + " " + myClass2.text);
    }
}