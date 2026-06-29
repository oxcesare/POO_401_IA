package certificacion.fase16.practica05;

public class Test01 {

    public static void main(String[] args) {

        System.out.println(hidePhone("1234567890"));
    }

    public static String hidePhone(String fullPhoneNumber){


        //return new StringBuilder(fullPhoneNumber).substring(0,8)+"xxxx";
        return new StringBuilder(fullPhoneNumber).append("xxxxxxxxxxxxx",8,12).toString();


    }
}
