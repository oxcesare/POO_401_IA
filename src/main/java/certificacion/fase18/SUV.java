package certificacion.fase18;

import java.util.ArrayList;

abstract class Vehicle{

}

interface Drivable{

}

class Car extends Vehicle implements Drivable{

}
public class SUV {
}
class Test03 {
    public static void main(String[] args) {

        ArrayList<Drivable> list = new ArrayList<>();
        Car c = new Car();
        list.add(c);

        StringBuilder sc = new StringBuilder();



        Drivable d1 = list.get(0);
        System.out.println(d1.getClass().getSimpleName());

    }
}