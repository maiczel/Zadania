/*ćwiczenie 13
▪ napisz metodę, przyjmującą jeden parametr typu int
▪ w metodzie napisz pętle iterującą od 0 do wartości tego parametru
▪ pomiń każdą liczbę parzystą
▪ przerwij pętlę, jeśli liczba jest podzielna bez reszty
przez 11
▪ wypisz na konsolę pozostałe liczby */

public class MyClass {

    public staic void loop(int parametr){
        for (int i = 0; i < parametr; i++){
            if(i%2 == 0) {
                continue;
            } else {
                System.out.println(i);

            }
        }
    }


}
