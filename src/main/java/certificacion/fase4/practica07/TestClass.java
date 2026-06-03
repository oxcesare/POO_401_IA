package certificacion.fase4.practica07;

import certificacion.fase4.practica05.Test;

public class TestClass {

    boolean bool;

    public static void main(String[] args) {
        int i =1;
        int [] iArr = {1};
        incr(i);
        incr(iArr);
        System.out.println("i = " + i + " iArr[0] = " + iArr[0]);

        Object oA [] = new Object[1];
        System.out.println(oA[0]);

        TestClass c = new TestClass();

        System.out.println(c.bool);

        Object [] obj = {new Test(),new Test()};




    }

    public static void incr(int n ){
        n++;
    }

    public static void incr(int [] n ){
        n[0]++;
    }
}
