package unidad1.dataset.samuel;

class CapaNeuronal {
    public void propagacionHaciaAdelante(String tipo) {
        System.out.println("Procesando datos en la red");
    }
}

class CapaConvolucional extends CapaNeuronal {


    public void propagacionHaciaAdelante() {
        System.out.println("Aplicando convolucion");
    }
}

class CapaDensa extends CapaNeuronal {
    public void propagacionHaciaAdelante() {
        System.out.println("Aplicando capa densa");
    }
}
