package certificacion.fase17.practica02;

import java.util.List;

public class Seal {

    String name;
    private final List<Seal> friends;

    public Seal(String name, List<Seal> friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public List<Seal> getFriends() {
        return friends;
    }
}

/**
 * What changes need to be made to make the following
 * immutable object pattern correct
 */
