package ollama.client.prompting.engine;

import ollama.client.template.PromptConfig;

public interface PromptStrategy {

    GeneradorPrompt crearPrompt(PromptConfig config);
}
