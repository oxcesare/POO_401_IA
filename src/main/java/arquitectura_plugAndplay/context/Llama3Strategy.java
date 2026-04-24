package arquitectura_plugAndplay.context;

import arquitectura_plugAndplay.strategy.InteligenciaArtificialStrategy;
import arquitectura_plugAndplay.template.PromptBuilder;

public class Llama3Strategy implements InteligenciaArtificialStrategy {

    @Override

    public String generarRespuesta(String prompt) {
        // 1. Aplicamos Ingeniería de Prompts mediante el Builder
        String promptEstructurado = new PromptBuilder()
                .conRol("Analista de Calidad de Software Senior")
                .conInstrucciones("Analiza el sentimiento del comentario sobre el código. Responde solo con: POSITIVO, NEGATIVO o NEUTRO.")
                .agregarEjemplo("Este método es una basura, no se entiende nada", "NEGATIVO")
                .agregarEjemplo("Excelente refactorización, muy limpio", "POSITIVO")
                .conEntrada(prompt)
                .build();

        // 2. Simulación de salida (Aquí iría la llamada real a Ollama)
        return "[Llama3 Inferencia Estructurada]:\n" + promptEstructurado;
    }

    @Override
    public String getNombreModelo() {
        return "Llama3";
    }


}
