package certificacion.fase10.practica01;

public class Test03 {
    public static void main(String[] args) {
        int c=0;
        JACK: while(c<8){
            JILL: System.out.println(c);
            if(c>3) break JACK;
            else c++;
        }
    }
}
