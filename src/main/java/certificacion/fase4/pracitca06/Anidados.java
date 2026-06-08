package certificacion.fase4.pracitca06;

class X {
    int val =10;
}

class Y{
    Y val =null;
}

public class Anidados {

    static int x =5;
    public static void main(String[] args) {

        int z = (x=3)*5;
        System.out.println("z"+z);


        Y y = new Y();


        int a = z-- >0?1:0;

        boolean x = true;
        if (x)
            if (x)
                if (x)
                    System.out.println("1");
                else
                    System.out.println("2");
            else
                System.out.println("3");
    }
}
