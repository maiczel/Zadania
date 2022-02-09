public class Main {
    public static void main(String[] args){

/* ćwiczenie 4a
▪ rozbuduj klasę MyClass o odpowiednie gettery i settery
▪ oznacz pola jako private
▪ ustaw wartości obiektów za pomocą setterów
▪ wyświetl ustawione wartości za pomocą getterów */

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        myClass1.setNumber(1);
        myClass2.setNumber(2);
        myClass1.setText("Klasa1");
        myClass2.setText("Klasa2");

        System.out.println(myClass1.getNumber());
        System.out.println(myClass1.getText());
        System.out.println(myClass2.getNumber());
        System.out.println(myClass2.getText());
    }
}
