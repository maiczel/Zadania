public class Main {

    public static void main (String[] atgs){

        //Task2B - W klasie Engine stwórz metody, które wypiszą na ekran moc oraz pojemność
        // danego obiektu (pola power/capacity). Wywołaj metodę na nowym obiekcie typu Engine.

        Engine engine = new Engine();
        engine.power = 120;
        engine.capacity = 1300;
        engine.printEngine();
        
    }
}
