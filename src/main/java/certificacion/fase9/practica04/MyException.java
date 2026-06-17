package certificacion.fase9.practica04;

public class MyException extends Exception{


}

class TestClass{

    public void myMethod() throws Exception{
        throw new MyException();
    }
}
