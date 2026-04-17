package unidad3.genericos.version2;

import java.util.List;

public interface Modelo<T> {
    void activar (List<T> activaciones);
}
class ImplementaModelo implements Modelo<String>{
    @Override
    public void activar(List<String> activaciones) {
    }
}

class ImplementaModeloEnteros implements Modelo<Integer>{
    @Override
    public void activar(List<Integer> activaciones) {

    }
}
class ImplementaModeloDoubles implements Modelo<Double>{
    @Override
    public void activar(List<Double> activaciones) {

    }
}