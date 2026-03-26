package unidad2.sensores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        Percepcion p = new Percepcion("1.1", 10.00);
        percepcionHub.add(p);

        p = new Percepcion("1.8", 12.00);
        p.setModelo("1.16");
        percepcionHub.add(p);

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }



        /**
         * Implementación Java 8
         * percepcionHub.forEach(SensorIA::leerDatos);
         */


    }
}
