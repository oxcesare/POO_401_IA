package unidad2.sensores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        Percepcion p = new Percepcion("1.1", 10.00);
        p.setModelo("1.2");
        percepcionHub.add(p);
        percepcionHub.add(new SensorUltrasonido("1.0", 10.00));
        percepcionHub.add(new SensorVision("2.2", 10.00));
        p = new Percepcion("1.4", 14.00);
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
