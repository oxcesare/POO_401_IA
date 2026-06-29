package certificacion.fase14.practica06;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();
        A a = new A();
        A b = new B();
        b.mensaje();


    }
}

class A {
    public void mensaje() {
        System.out.println("Hola desde el Padre");
    }

}

class B extends A {
    public void mensaje() {
        System.out.println("Hola desde B ");
    }

}