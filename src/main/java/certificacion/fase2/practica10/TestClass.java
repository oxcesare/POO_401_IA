package certificacion.fase2.practica10;

public class TestClass {

    public static int getSwitch(String str ){
        return (int) Math.round(Double.parseDouble(str.substring(1, str.length()-1)));
    }
    public static void main(String[] args) {
        switch (getSwitch("--0.50")){
            case 0:
                System.out.println("Hello");
            case 1:
                System.out.println("Word");
                break;
            default:
                System.out.println("Good Bye");

        }
    }
}
