package unidad3.contextualizacion.gestion.corpus;

import java.util.*;

public class GestorDeConocimientoImpl implements GestorDeConocimiento<String, String, double[]> {

    private List<String> corpusOrdenado = new ArrayList<>();
    private Set<String> vocabularioUnico = new HashSet<>();
    private Map<String, double[]> embeddings = new HashMap<>();

    @Override
    public void ingerirDatos(List<String> corpus) {
        this.corpusOrdenado.addAll(corpus);
        // Al procesar la ingesta, alimentamos automáticamente el Set para el vocabulario
        this.vocabularioUnico.addAll(corpus);
    }

    @Override
    public Set<String> extraerVocabulario() {
        return Collections.unmodifiableSet(vocabularioUnico);
    }

    @Override
    public void cargarEmbeddings(Map<String, double[]> mapaEmbeddings) {
        this.embeddings = mapaEmbeddings;
    }

    // Método de inferencia específico
    public double[] obtenerVector(String token) {
        return embeddings.getOrDefault(token, new double[]{0.0});
    }
}