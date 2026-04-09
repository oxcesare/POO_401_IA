package certificacion;

public class Elliptical {

    public int radiusA, radiusB;
    public int sum =100;

    public void setRadius(int r ){
        if(r>99) throw new IllegalArgumentException();
        radiusA =r;
        radiusB = sum - radiusA;
    }

    public static void main(String[] args) {
        Elliptical e = new Elliptical();
        e.radiusA=10;
        e.radiusB=100;
        e.setRadius(20);
        System.out.println(e.radiusA + " " + e.radiusB);
    }
}
