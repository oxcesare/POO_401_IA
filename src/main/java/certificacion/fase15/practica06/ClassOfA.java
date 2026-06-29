package certificacion.fase15.practica06;

public class ClassOfA {

    public static void main(String[] args) {

        ClassOfA c = new ClassOfA();
        ClassOfA a = new ClassOfA();
        ClassOfA b = new ClassOfA();
        B bb = new B();

        int i=0;

        if( bb instanceof ClassOfA){
            System.out.println("bb instanceof ClassOfA");
        }

        if (c instanceof ClassOfA) {
            System.out.println("1");
        }

        if(b instanceof ClassOfA) {
            System.out.println("2");
        }

        if(a.equals(b)){
            System.out.println("3");
        }
    }
}

class B extends ClassOfA {

}