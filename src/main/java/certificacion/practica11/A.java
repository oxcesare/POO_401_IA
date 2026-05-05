package certificacion.practica11;

public class A {

    public static void main(String[] args) {

            A a = new A();
            B b = new B();
            a =b;
            //b =a; // no se puede hacer cast porque es subclase de A
            a = (B)b;
            b = (B)a;
    }
}


class B extends A {}