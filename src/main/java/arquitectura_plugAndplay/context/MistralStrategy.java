package arquitectura_plugAndplay.context;


import arquitectura_plugAndplay.strategy.InteligenciaArtificialStrategy;
import arquitectura_plugAndplay.template.PromptBuilder;

public class MistralStrategy implements InteligenciaArtificialStrategy {

    @Override

    public String generarRespuesta(String prompt) {

        // Configuramos el Builder con una estructura de "Pensamiento en Cadena"
        String promptCoT = new PromptBuilder()
                .conRol("Arquitecto de Software Senior y Auditor de Seguridad")
                .conInstrucciones("""
                        Analiza el código proporcionado siguiendo estos pasos:
                        1. Identifica la estructura principal del código.
                        2. Busca posibles vulnerabilidades o errores de lógica.
                        3. Explica tu razonamiento paso a paso.
                        4. Finalmente, proporciona una recomendación de mejora.
                        """)
                .conEntrada(prompt)
                .build();

        // En una implementación real, aquí enviaríamos promptCoT a Ollama
        return "[Mistral Inferencia CoT]:\n" + promptCoT;

    }

    @Override

    public String getNombreModelo() {
        return "Mistral";
    }

}

