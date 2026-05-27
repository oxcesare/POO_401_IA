package certificacion.fase2.practica07;

public class Referencias {



    public static void main(String[] args) {
        Referencias t1,t2,t3,t4;
        t1 = t2 = new Referencias();
        t3 = new Referencias();

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);

        System.out.println(t1 instanceof Referencias);
        System.out.println(t1.getClass().getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
