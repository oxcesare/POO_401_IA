package certificacion.fase19.practica01;

public class StringFormChar {
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};

        String newStr = "";
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }
        System.out.println(newStr);
        System.out.println((newStr == myStr) + "  " + (newStr.equals(myStr)));
    }
}
