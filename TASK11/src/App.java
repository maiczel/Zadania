/* ćwiczenie 11
▪ zmodyfikuj poprzednie zadanie:
- odwróć warunek (pętla “kręci się” dopóki parametr jest mniejszy od 0)
- zastosuj pętlę do..while */
public class App {
    public static void main(String[] args){

        int liczba = -17;

        do {
            System.out.println(liczba);
            liczba ++;
        }while (liczba<0);
    }
}
