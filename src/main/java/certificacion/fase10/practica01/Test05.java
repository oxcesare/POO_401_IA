package certificacion.fase10.practica01;

public class Test05 {
    public static void main(String[] args) {
        byte starting =3;
        short firsValue =5;
        int secondValue=7;
        int functionValue = (int) (starting/2 + firsValue/2 + (int) firsValue/3)+
                secondValue/2;
        System.out.println(functionValue);
    }
}
