package certificacion.fase16.practica02;

import java.util.Comparator;

public class Test01 {

    public static void main(String[] args) {


        Comparator<String> porLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };


        Comparator<String> porLongitudLambda = (s1, s2) -> Integer.compare(s1.length(), s2.length());


    }
}
