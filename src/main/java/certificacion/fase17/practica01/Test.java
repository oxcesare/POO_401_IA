package certificacion.fase17.practica01;

import java.time.LocalDate;
import java.time.Period;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();
        LocalDate result = test.process(LocalDate.of(2015, 1, 1));
        System.out.println(result);

        String str="a";

    }


    public LocalDate process(LocalDate ld){
        // add 1 month and 1 day to the given LocalDate
        LocalDate ld2 =ld.plus(Period.of(0, 1, 1));
        return ld2;
    }
}
