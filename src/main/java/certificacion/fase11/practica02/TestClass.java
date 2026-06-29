package certificacion.fase11.practica02;

public class TestClass {
    static int si = 10;

    public static void main(String[] args) {
        new TestClass();
    }

    //Constructor
    public TestClass() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TestClass.si" + this.si;
    }
}
