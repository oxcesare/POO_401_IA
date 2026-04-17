package unidad3.genericos;

import java.util.List;

public interface Modelo {
    void activar (List<String> activaciones);
}

class ImplementaModelo implements Modelo{

    @Override
    public void activar(List<String> activaciones) {

    }
}

