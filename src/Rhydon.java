import ru.ifmo.se.pokemon.*;

public class Rhydon extends Rhyhorn {

	public Rhydon(String name, int level) {

    		super(name, level);
    		
    		setStats(105, 130, 120, 45, 45, 40);

    		addMove(new FakeOut());
    		addMove(new Swagger());
    		addMove(new DoubleTeam());
    		addMove(new Sludge());
	}
}