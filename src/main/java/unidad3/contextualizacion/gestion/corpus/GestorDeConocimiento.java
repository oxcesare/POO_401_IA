package unidad3.contextualizacion.gestion.corpus;

import java.util.*;

// Interfaz que dicta cómo debe fluir el conocimiento hacia la IA
public interface GestorDeConocimiento<T, K, V> {
    void ingerirDatos(List<T> corpus);
    Set<T> extraerVocabulario();
    void cargarEmbeddings(Map<K, V> mapaEmbeddings);
}