/*TASK 6*
 -Stworz metodę, która przyjmuje parametr String (imię)
 - i zwraca wartośc logiczną tue/false (boolean)
 - metoda sprawdza, czy liczba liter w imieniu jest parzysta
 np Andrzej
    false
    Adam
    true */


import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        checkIfEven(name);



    }
    public static boolean checkIfEven(String name){

        boolean isNameEven;
        if(name.length()%2 == 0){
            isNameEven = true;
            System.out.println(name +" " + isNameEven);

        }else{
            isNameEven = false;
            System.out.println(name +" " + isNameEven);

        }
        return isNameEven;
    }


}
