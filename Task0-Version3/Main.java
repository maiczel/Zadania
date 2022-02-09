public class Main {
    public static void main(String [] args){

        MyClass myClass1 = new MyClass(30, "Klasa 1A");
        MyClass myclass2 = new MyClass(32, "Klasa 1B");

        System.out.println(myClass1.number + " " + myClass1.text);
        System.out.println(myclass2.number + " " + myclass2.text);
    }
}
