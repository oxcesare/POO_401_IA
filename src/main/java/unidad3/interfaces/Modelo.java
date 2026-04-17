package unidad3.interfaces;

import java.util.*;

public interface Modelo<T>{

    public void ejectutar(List<T> modelos);
}

class Monitor implements  Modelo<Integer>{


    @Override
    public void ejectutar(List<Integer> modelos) {

    }
}

class Neurona implements Modelo<String>{

    @Override
    public void ejectutar(List<String> modelos) {

    }
}