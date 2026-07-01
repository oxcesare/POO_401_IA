package certificacion.fase18;

public class Test {

    public static void main(String[] args) {
        String phone = "1234567890";
        String hiddenPhone = hidePhone(phone);
        System.out.println(hiddenPhone); // Output: 12345678xxxx
        System.out.println(hidePhone(phone, 1)); // Output: 12345678xxxxx
        System.out.println(hidePhone(phone, 2,3));

    }


    public static String hidePhone(String phone) {

        return new StringBuilder(phone).substring(0, 8) + "xxxx";
    }

    public static String hidePhone(String phone, int v1) {

        return new StringBuilder(phone).replace(8, 12, "xxxx").toString();
    }

    public static String hidePhone(String phone, int v1, int v2) {

        return new StringBuilder("xxxx").insert(0,phone,0,8).toString();
    }

}
