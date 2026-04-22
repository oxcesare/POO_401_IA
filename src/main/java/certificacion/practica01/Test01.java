package certificacion.practica01;

public class Test01 {
    public static void main(String[] args) {

        A a = null;
        B b = new B();

        System.out.println(a instanceof T1);
        System.out.println(a instanceof T2);
        System.out.println(b instanceof T1);
        System.out.println(b instanceof T2);
        System.out.println(b instanceof A);
    }
}

interface  T1{

}

interface  T2{

}

class A implements  T1,T2{

}
class B extends A{

}

