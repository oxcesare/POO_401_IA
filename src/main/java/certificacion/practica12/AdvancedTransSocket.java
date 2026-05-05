package certificacion.practica12;

import certificacion.practica12.enthu.trans.ChannelException;


/**
 * para sobreescribir un metodo debe de ser del tipo
 * de la clase, debe ser el mismo tipo de retorno
 */
public class AdvancedTransSocket extends TransSocket {

    @Override
    long connect(String ipdAddr)  {
        return 0;
    }
}
