package certificacion.fase12.practica04;


class A{

}

class AA extends A{

}

public class TestClass {

    public static void main(String[] args) {
        A a = new A();
        AA aa = new AA();
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());
    }
}
