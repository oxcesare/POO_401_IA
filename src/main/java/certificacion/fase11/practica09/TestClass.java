package certificacion.fase11.practica09;


interface I1 {
    int VALUE = 1;

    void m1();
}


interface I2 {
    int VALUE = 2;

    void m1();
}


public class TestClass implements I1, I2 {
    @Override
    public void m1() {
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        TestClass t = new TestClass();
        ((I1) t).m1();
    }
}
