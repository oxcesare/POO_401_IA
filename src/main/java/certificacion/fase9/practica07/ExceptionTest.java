package certificacion.fase9.practica07;

class MyException extends Throwable {

}

class MyException1 extends MyException {

}

class MyException2 extends MyException {

}

class MyException3 extends MyException2 {

}


public class ExceptionTest {

    void myMethod() throws MyException3 {
        throw new MyException3();
    }

    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
        try {
            test.myMethod();
        } catch (MyException3 e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}
