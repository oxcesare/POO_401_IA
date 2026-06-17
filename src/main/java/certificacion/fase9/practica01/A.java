package certificacion.fase9.practica01;

public class A {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        a = b;
        //b = a;
        a = (B) b;
        b = (B) a;
    }
}

class B extends A {

}