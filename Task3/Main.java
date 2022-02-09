public class Main {


    public static void main(String[] args) {

   /*    ćwiczenie 3
▪ utwórz nową klasę StaticExample
▪ stwórz w niej dwie metody
▪ obydwie niech będą typu void
▪ jedna z nich niech będzie metodą statyczną
▪ każda z nich niech ma tylko jedną linię kodu:
    wypisanie czy jest statyczna czy nie (System.out)
▪ wywołaj obydwie metody w metodzie main()*/

        StaticExample staticExample = new StaticExample();
        staticExample.methodTest();//metodę niestatyczną wywołujemy na obiekcie
        StaticExample.methodTest1();// metodę statyczną możemy wywołac na klasie bez obiektu



    }
}
