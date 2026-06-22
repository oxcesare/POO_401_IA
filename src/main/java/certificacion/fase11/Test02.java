package certificacion.fase11;

public class Test02 {

    public int luckyNumber(int seed){
        if(seed >10) return seed%10;
        int x =0;
        try{
            if(seed%2==0) throw new Exception("Even");
            else return x;

        }catch (Exception e) {
            System.out.println(e.getStackTrace());
            return 3;
        }finally{
            return 7;
        }

    }

     public static void main(String[] args) {
         Test02 test = new Test02();
         int amount =100, seed=6;
         System.out.println(test.luckyNumber(3));
         switch (new Test02().luckyNumber(6)){
             case 3:  amount  =  amount * 3;
             case 7:  amount  =  amount * 3;
         }
     }
}
