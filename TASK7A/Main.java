public class Main {
    public static void main(String[] args){

/*  ćwiczenie 7a
▪ utwórz klasę Student z polem name typu String
▪ konstruktor powinien wymusić podanie tego pola
▪ utwórz w niej metodę printName(), która wypisze na ekran pole name
▪ w metodzie main() wypisz stwórz kilka obiektów typu Student i wywołaj na  nich tę metodę*/

        Student student = new Student("Leszel");
        Student student1 = new Student("Kinga");
        student.printName();
        student1.printName();
    }
}

}
