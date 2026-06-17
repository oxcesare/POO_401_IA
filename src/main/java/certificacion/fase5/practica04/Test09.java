package certificacion.fase5.practica04;

public class Test09 {

    public static void main(String[] args) {

        int [] a =  {1,2,3,4};
        int [] b =  {2,3,1,0};
        System.out.println(a[(a=b)[3]]);
    }
}
