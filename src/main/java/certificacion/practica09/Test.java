package certificacion.practica09;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("mxr");
        String s = sb.toString();
        list.add(s);
        System.out.println(s.getClass().getName());
        System.out.println(list.getClass());
    }
}
