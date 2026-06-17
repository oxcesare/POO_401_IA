package certificacion.fase10.practica01;

public class Test01 {

    int x=05;

    public int getX() {
        return x;
    }

    public static void main(String[] args)  throws Exception {
       Test01 test01 = new Test01();
       test01.looper();
       System.out.println(test01.x);
    }

    public void looper(){
        int x=0;
        while( (x=getX())!=0) {
            for(int m =10; m>=0; m--){
                x=m;
            }
        }
    }
}
