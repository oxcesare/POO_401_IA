package certificacion.practica01;

public class ATest {

    String globlal = "111";

    public int parse(String arg) {

        int value = 0;

        try {
            String globlal = arg;
            value = Integer.parseInt(globlal);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.println(globlal + " " + value + " ");
        return value;
    }

    public static void main(String[] args) {
        ATest aTest = new ATest();
        System.out.println(aTest.parse("333"));
    }


}
