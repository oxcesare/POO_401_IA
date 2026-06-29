package certificacion.fase15.practica08;


class A {

}

class B extends A {


}

class C extends B {

}

class D extends C {

}

public class Test01 {
    public static void main(String[] args) {
        B obj = new B();

        if ((obj instanceof A) && !(obj instanceof C) && !(obj instanceof D)) {
            System.out.println("True");
        }
    }
}
