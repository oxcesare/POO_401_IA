package certificacion.fase20.practica01;

import java.util.Arrays;
import java.util.List;

public class Data {

    int value;

    public Data(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        Data[]  datArr = new Data[] {
                new Data(1),
                new Data(2),
                new Data(3),new Data(4)
        };

        List<Data> dataList = Arrays.asList(datArr);

        for(Data element : dataList) {
            dataList.removeIf((Data d) -> {
                return d.value%2==0;});
            //System.out.println("Removed"+d+",");
        }
    }
}
