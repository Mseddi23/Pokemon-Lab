import ru.ifmo.se.pokemon.*;

public final class Vaporeon extends Eevee {

    public Vaporeon(String name, int level) {
        super(name, level);

        setType(Type.WATER);
        setStats(130, 65, 60, 110, 95, 65);

        addMove(new FakeOut());
        addMove(new Rest());
    }
}