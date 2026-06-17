package certificacion.fase5.practica05;

public class Test03 {

    public static void main(String[] args) {

        String[][][] arr = {
                {{"a", "b", "c"},
                 {"d", "e", null}},
                {{"x"}, null},
                {{"y"}},
                {{"z", "p"}, {}}
        };

        System.out.println(arr[0][1][2]);
        System.out.println(arr[0][0][0]);



    }
}
