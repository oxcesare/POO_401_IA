package certificacion.fase11.practica05;

public class A {

    protected  int i;

    A(int i){
         this.i = i;
    }
}

class B extends A {
    B(int i){
        super(i);
    }
}