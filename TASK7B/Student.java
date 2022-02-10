import java.time.LocalDate;
import java.util.Random;

public class Student {

    public LocalDate getExamDate(){

        Random random = new Random();

        int examMonth = random.nextInt(11)+1;
        int examDay = random.nextInt(30) +1;

        LocalDate examDate = LocalDate.of(2022,examMonth,examDay);

        return examDate;

    }
}
