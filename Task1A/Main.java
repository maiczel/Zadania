public class Main {
    public static void main (String[] args){

        Engine engine = new Engine();
        engine.power = 150;
        engine.capacity = 1400;

        System.out.println("Power is: " + engine.power + ", Capacity is: " + engine.capacity);
    }
}
