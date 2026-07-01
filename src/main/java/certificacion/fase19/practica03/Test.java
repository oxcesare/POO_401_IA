package certificacion.fase19.practica03;

import java.util.function.Predicate;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

         checkList(list, al -> al.isEmpty());
    }

    public static boolean checkList(List list, Predicate<List>p ){
        return p.test(list);
    }
}
