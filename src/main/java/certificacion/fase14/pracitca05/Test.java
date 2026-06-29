package certificacion.fase14.pracitca05;

public class Test {
    public static void main(String[] args) {
        B o = new B();

        if (!((o instanceof B)|| (o instanceof A))){
            System.out.println("true");
        }

        if ((o instanceof B) && (!(o instanceof C))){
            System.out.println("true");
        }

        if ( (o instanceof B) && !((o instanceof C) || (o instanceof A))){
            System.out.println("true");
        }



    }
}

class A{

}

class B extends A{
}
class C extends B{
}
