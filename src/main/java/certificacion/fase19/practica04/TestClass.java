package certificacion.fase19.practica04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {

    public static boolean checkLitst(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {

        boolean a = checkLitst(new ArrayList(), al -> al.isEmpty());
        boolean b = checkLitst(new ArrayList(), al -> al.add("hello"));

        System.out.println(a);
        System.out.println(b);

    }
}
