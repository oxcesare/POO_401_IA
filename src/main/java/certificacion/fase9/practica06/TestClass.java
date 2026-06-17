package certificacion.fase9.practica06;

class SomeException extends Exception{

}

class A extends SomeException{
    protected void m() throws SomeException{

    }
}

class B extends A{
    public void m(){
        System.out.println();
    }
}

public class TestClass {

    public static void main(String[] args) {

        try {
            A a = new B();
            a.m();
        } catch (SomeException e) {
            e.printStackTrace();

        }
    }
}
