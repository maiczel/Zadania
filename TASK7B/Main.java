public class Main {
    public static void main(String[] main){

/*  ćwiczenie 7b
▪ w klasie Student stwórz nową metodę o nazwie getExamDate(), która
        zwraca typ LocalDate
▪ metoda powinna wylosować dwie liczby, month (1-12) oraz day (1-31)
▪ następnie stworzyć obiekt LocalDate, dla obecnego roku i wylosowanego
        powyżej miesiąca i dnia
▪ zwróć tak stworzony obiekt daty
▪ w klasie Main stwórz obiekt Student
▪ wypisz wylosowaną dla niego datę*/

        Student student = new Student();
        System.out.println(student.getExamDate());

    }
}
