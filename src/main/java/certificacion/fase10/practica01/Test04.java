package certificacion.fase10.practica01;

public class Test04 {

    public static void main(String[] args) {
        int k=0;
        int m=0;
        for(int i=0; i<=3;i++){
            k++;
            if(i==2){
                i=4;
            }
            m++;
        }
        System.out.println(k +" + " + m);
    }
}
