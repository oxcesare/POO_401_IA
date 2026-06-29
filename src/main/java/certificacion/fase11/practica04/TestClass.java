package certificacion.fase11.practica04;

class Super {

}

class Sub extends Super {

}

public class TestClass {
    public static void main(String[] args) {
        Super s1 = new Super();
        Sub s2 = new Sub();
        s1 = (Super) s2;
    }
}
