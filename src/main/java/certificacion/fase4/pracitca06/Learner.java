package certificacion.fase4.pracitca06;

public class Learner {
    public static void main(String[] args) {
        String[] dataArr = new String[4];
        dataArr[1] = "0";
        dataArr[2] = "0";
        dataArr[3] = "0";

        try {

            for (String data : dataArr) {
                System.out.println(data);
            }

        } catch (Exception e) {
            System.out.println(e.getClass());
        }


    }
}
