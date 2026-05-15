package certificacion.practica02;

import com.google.gson.Gson;

class Usuario {
    String nombre;
    int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}


public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Usuario user = new Usuario("Ana", 30);

        // --- SERIALIZAR (Objeto -> JSON) ---
        String json = gson.toJson(user);
        System.out.println("JSON: " + json); // {"nombre":"Ana","edad":30}

        // --- DESERIALIZAR (JSON -> Objeto) ---
        Usuario usuarioObj = gson.fromJson(json, Usuario.class);
        System.out.println("Nombre: " + usuarioObj.nombre);
    }
}