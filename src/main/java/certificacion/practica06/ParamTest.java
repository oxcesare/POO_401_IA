package certificacion.practica06;

public class ParamTest {

    public static void main(String[] args) {

        printSum(1,2);
    }


    public static void printSum(int a, int b){
        System.out.println("primitivos");
    }

    public static  void printSum(Integer a, Integer b){
        System.out.println("Integer");
    }


    public static  void printSum(double a, double b){
        System.out.println("double");
    }



}
