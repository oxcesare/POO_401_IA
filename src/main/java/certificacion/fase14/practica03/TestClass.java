package certificacion.fase14.practica03;

public class TestClass {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        if (b instanceof T2){
            System.out.println("b is instance of T2");
        }
        if (b instanceof T1){
            System.out.println("b is instance of T1");
        }
        if (a instanceof T1){
            System.out.println("a is instance of T1");
        }

    }
}

interface T1 {

}

interface T2 {

}

class A implements T1,T2{

}

class B extends A {

}