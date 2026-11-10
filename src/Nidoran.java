import ru.ifmo.se.pokemon.*;

public class Nidoran extends Pokemon {

    public Nidoran(String name, int level) {
        super(name, level);

        setType(Type.POISON);
        setStats(55, 47, 52, 40, 40, 41);
    }
}