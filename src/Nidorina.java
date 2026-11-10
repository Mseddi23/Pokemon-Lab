import ru.ifmo.se.pokemon.*;

public class Nidorina extends Nidoran {

    public Nidorina(String name, int level) {

        super(name, level);
        setStats(70, 62, 67, 55, 55, 56);
	
	addMove(new FakeOut());
        addMove(new Rest());
        addMove(new SludgeBomb());
    }
}