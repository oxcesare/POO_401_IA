package certificacion.fase14.practica04;

public class TestClass {

    public static void main(String[] args) {
        D obj = new D();
        if ((obj instanceof A) && !(obj instanceof C) && !(obj instanceof D)) {
            System.out.println("true");

        }
    }
}

class A {

}

class B extends A {
}

class C extends B {
}

class D extends C {
}