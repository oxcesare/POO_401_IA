package certificacion.practica04;

class A {

    public A() {

    }

    public A(int i) {
        System.out.println(i);
    }
}

/**
 * Los bloques staticos son los que se ejecutan primero
 */
public class B {

    static A s1 = new A(1);
    A a = new A(2);

    static void main(String args[]) {
        B b = new B();
        A a = new A(3);
    }

    static A s2 = new A(4);
}
