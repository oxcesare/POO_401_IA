package certificacion.fase15.practica05;

class A {
    public int getCode() {
        return 2;
    }
}

class AA extends A {
    public int getCode() {
        return 3;
    }
}

public class TestClass {

    public static void main(String[] args) {
        A a = new A();
        A aa = new AA();
        System.out.println(a.getCode() + " , " + a.getCode());
    }


    public int getCoder() {
        return 1;
    }
}
