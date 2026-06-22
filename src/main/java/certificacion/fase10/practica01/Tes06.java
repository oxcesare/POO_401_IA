package certificacion.fase10.practica01;

import java.util.*;

public class Tes06 {
    public static void main(String[] args) {

        Stack s1 = new Stack();
        Stack s2 = new Stack();
        processStacks(s1, s2);
        System.out.println(s1 + " " + s2);

    }

    public static void processStacks(Stack x1, Stack x2) {
        x1.push(Integer.valueOf(100));
        x2 = x1;
    }
}
