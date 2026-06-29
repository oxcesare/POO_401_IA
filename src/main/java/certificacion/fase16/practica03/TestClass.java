package certificacion.fase16.practica03;

import java.util.ArrayList;
import java.util.Iterator;

class Data {
    int value;

    public Data(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }
}

class MyFilter {
    public boolean test(Data d) {
        return d.value == 0;
    }
}

// declarar una interface funcional que exponga x -> x.value == 0;
@FunctionalInterface
interface MyPredicate {
    boolean test(Data d);
}



public class TestClass {


    public static void filterData(ArrayList<Data> dataList, java.util.function.Predicate<Data> f) {
        Iterator<Data> i = dataList.iterator();
        while (i.hasNext()) {
            if (f.test(i.next())) {
                i.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Data> al = new ArrayList<>();
        Data d = new Data(1);
        al.add(d);
        d = new Data(2);
        al.add(d);
        d = new Data(0);
        al.add(d);

        // Variable de tipo Predicate<Data>
        java.util.function.Predicate<Data> miPredicate = x -> x.value == 0;


        filterData(al, miPredicate);
        System.out.println(al);
    }

}
