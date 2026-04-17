package unidad3.ejercicios.listas;


import java.util.ArrayList;
import java.util.List;

class MetricaEntrenamiento{
       int epoca;
       double loss;
       double accuracy;

        public MetricaEntrenamiento(int epoca, double loss, double accuracy) {
            this.epoca = epoca;
            this.loss = loss;
            this.accuracy = accuracy;
        }

    @Override
    public String toString() {
        return "MetricaEntrenamiento{" +
                "epoca=" + epoca +
                ", loss=" + loss +
                ", accuracy=" + accuracy +
                '}';
    }
}


public class MonitorIA {

    public static void main(String[] args) {

        List<MetricaEntrenamiento> metricas = new ArrayList<>();
        metricas.add(new MetricaEntrenamiento(7,0.12,0.1));
        metricas.add(new MetricaEntrenamiento(3,0.62,0.3));
        metricas.add(new MetricaEntrenamiento(4,0.22,0.4));
        metricas.add(new MetricaEntrenamiento(1,0.32,0.5));

        System.out.println("Lista de Metrica de Entrenamiento"+ " " +  metricas);

        //Imprimir el primer y ultimo elemento

        //Eliminar el primer y ultimo elemento

        //Iterar la lista de metricas y detectar el orden de inserccion


    }
}
