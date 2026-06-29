package certificacion.fase11.practica02;

public class A {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a=b;
        //b=a; Esta línea da error
    }
}

class B extends A{

}
