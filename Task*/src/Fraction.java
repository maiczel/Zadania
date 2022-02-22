import java.util.Random;

public class Fraction {

    private int counter;
    private int denominator;
    private double value;



    public static void printValue(){
        Random random = new Random();
        int counter = random.nextInt(10);
        int denominator = random.nextInt(10);
        double value = counter/(double)denominator;
        System.out.println(value + " [" + counter + "/" + denominator+"]");
    }


}
