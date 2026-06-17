package certificacion.fase8;

public class A {
}

class B extends A{


}

class C extends B {

}

class X {
    B getB(){
        return new B();
    }
}

class Y extends X{

    /* No puede retonar un objeto de la superclase

    A getB(){
        return new A();
    }*/
}
