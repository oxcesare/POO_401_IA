package certificacion.fase17.practica01;

interface CanClimb {
    public abstract void climb();
}

interface CanClimbTrees extends CanClimb {

}

abstract class Chimpumk implements CanClimbTrees {
    public abstract void chew();
}

/**
 * La clase EasternChipumk extiende de Chimpumk que a su vez implementa CanClimbTrees
 * por lo tanto al extender de ella debe de implemntar el metodo chew y climb
 */
public class EasternChipumk extends Chimpumk {

    public static void main(String[] args) {

    }

    @Override
    public void chew() {

    }

    @Override
    public void climb() {

    }
}
