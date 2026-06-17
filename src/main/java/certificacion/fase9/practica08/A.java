package certificacion.fase9.practica08;

class B{

}

class C extends B{

}
public class A {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        B polimorfico = new C();

        if(c instanceof C){
            System.out.println("c is object of C");
        }

        if(c instanceof B){
            System.out.println("c is object of B");
        }
        if (b instanceof C){
            System.out.println("b is object of C");
        }

    }
}
