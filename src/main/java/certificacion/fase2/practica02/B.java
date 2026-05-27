package certificacion.fase2.practica02;


class A {
    public A() {

    }

    public A(int i) {
        System.out.print(i);
    }
}

class C {

}

public class B {
    A s1 = new A(1);
    A a = new A(2);

    public static void main(String[] args) {
        B b = new B();
        A a = new A(3);
    }

    A s2 = new A(4);
}
