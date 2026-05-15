package certificacion.practica11;

public class LocalExample {

    public static void main(String[] args) {

        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1)
                .minusDays(1).plusYears(1);

        System.out.println(dt);

        // Creacion de un objeto Integer
        Integer x = Integer.valueOf(1);
        System.out.println(x);
    }
}
