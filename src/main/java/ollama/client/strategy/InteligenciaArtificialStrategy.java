package ollama.client.strategy;

import ollama.client.template.PromptConfig;

public interface InteligenciaArtificialStrategy {

    // Definimos el contrato: recibir un prompt y devolver una respuesta

    String generarRespuesta(PromptConfig config);

    String getNombreModelo();
}
