package certificacion.fase2.practica08;

public class Matricula {

    private String numeroMatricula;

    public static void main(String[] args) {
            Matricula m1 = new Matricula();
            m1.setNumeroMatricula("ux99992353");
            m1 = m1.reemplazaMatricula("ux99992354");
            System.out.println(m1.getNumeroMatricula());
    }


    Matricula reemplazaMatricula (String numeroMatricula) {
        Matricula m = new Matricula();
        m.setNumeroMatricula(numeroMatricula);
        return m;
    }

    public String getNumeroMatricula() {
            return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
