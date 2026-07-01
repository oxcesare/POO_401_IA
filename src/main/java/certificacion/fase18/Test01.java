package certificacion.fase18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add(1, "Java");
        list.add(2, "Java");

        Collections.sort(list);
        System.out.println(list);
    }
}
