package certificacion.fase20.practica02;


import java.util.ArrayList;

interface Process{
    public void process (int a,int b);
}

class Data {
    int value;

    Data(int value) {
        this.value = value;
    }
}
public class Test {

    public static void processList(ArrayList<Data> dataList, Process process) {
        for(Data element : dataList) {
            process.process(element.value,element.value);
        }
    }

    public static void main(String[] args) {
        ArrayList<Data> dataList = new ArrayList<>();
        dataList.add(new Data(1));
        dataList.add(new Data(2));
        dataList.add(new Data(3));

        processList(dataList, (a, b) -> System.out.println(a *b));

        processList(dataList, (a, b) -> System.out.println(a + b));

        processList(dataList, (a,b) -> {
            System.out.println(a*b);
        });


    }
}
