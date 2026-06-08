package certificacion.fase4.pracitca06;

public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println(args.length);

        try{
            System.out.println(args[args.length-1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("3"+1+2);

        int x =4;
        switch (x){
            case 4:
                System.out.println("1");
            default:
                System.out.println("default");
                System.out.println("1");
                break;
        }
    }

}
