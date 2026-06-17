package certificacion.fase9.practica07;


class MyExceptions extends Exception {

}
public class TestClass {
    public void myMethod() throws MyExceptions {
        System.out.println("1");
    }

    public static void main(String[] args) throws MyExceptions {
        TestClass testClass = new TestClass();
        testClass.myMethod();
    }
}
