package unidad2.procesamiento;

import java.util.ArrayList;
import java.util.List;

public abstract  class ProcesadorNLP {

    private String textoCrudo;

    protected List<String> listaPalabras = new ArrayList<>();

    public void cargarTexto(String texto) {
        this.textoCrudo = texto;
    }

    // Template Method: define el orden del pipeline
    public final Object procesarTexto() {
        limpiarTexto();
        tokenizar();
        return transformarParaModelo();
    }

    public abstract List<String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarParaModelo();

    public String getTextoCrudo() { return textoCrudo; }

    // protected: sólo subclases pueden modificarlo
    protected void setTextoCrudo(String textoCrudo) {
        this.textoCrudo = textoCrudo;
    }


}
