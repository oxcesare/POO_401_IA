package certificacion.fase2.practica05;

public class Discounter {

    static double percent;
    int offset=10, base=50;

    public static void main(String[] args) {




    }

    public static double cal(double value){

        int coupon, offset, base;
        if(percent<10){
            coupon=10;
            offset=20;
            base=10;
        }
        //esta linea manda error porque las variables no estan inicializadas
        //return coupon*offset*base*value/100;
        return 0;
    }
}
