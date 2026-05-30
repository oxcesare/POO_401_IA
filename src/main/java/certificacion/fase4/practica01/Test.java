package certificacion.fase4.practica01;

public class Test {

    public void ifTest(boolean flag) {
        if (flag)
            if (flag)
                System.out.println("True False");
            else
                System.out.println("True True");
        else
            System.out.println("False False");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.ifTest(false);
    }
}
