package certificacion.fase12.b;


import certificacion.fase12.a.A;

public class B extends A {

    B(){
    }
    public void print(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        new B();
    }
}
