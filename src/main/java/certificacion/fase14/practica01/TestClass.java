package certificacion.fase14.practica01;

public class TestClass {

    public static void main(String[] args) {
        B b = new D();
        b.imprimeMensaje();

        A a = b;

        if (a instanceof A) {
            System.out.println("A");
        }
        if (a instanceof B) {
            System.out.println("B");
        }
        if (a instanceof C) {
            System.out.println("C");
        }
        if (a instanceof D) {
            System.out.println("D");
        }

    }
}


class A {

}

class B extends A {
    public void imprimeMensaje(){
        System.out.println("Mensaje desde B");
    }
}

class C extends B {
}

class D extends C {

    public void imprimeMensaje(){
        System.out.println("Mensaje desde D");
    }
}

class E {

}

