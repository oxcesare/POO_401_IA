package ollama.client.prompting.engine;

public class PromptConfig {

    private String rol;
    private String instrucciones;
    private String entrada;
    private String tipoPrompt;


    public PromptConfig(String rol, String instrucciones, String entrada,String tipoPrompt) {
        this.rol = rol;
        this.instrucciones = instrucciones;
        this.entrada = entrada;
        this.tipoPrompt = tipoPrompt;
    }

    // Getters
    public String getRol() { return rol; }
    public String getInstrucciones() { return instrucciones; }
    public String getEntrada() { return entrada; }

    public String getTipoPrompt() { return tipoPrompt; }

    public void setTipoPrompt(String tipoPrompt) {
        this.tipoPrompt = tipoPrompt;
    }
}
