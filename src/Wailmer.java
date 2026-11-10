import ru.ifmo.se.pokemon.*;

public class Wailmer extends Pokemon {

	public Wailmer(String name, int level) {
		super(name, level);
		setType(Type.WATER);
		setStats(130, 70, 35, 70, 35, 60);
		
		addMove(new FakeOut());
		addMove(new Swagger());
		addMove(new DoubleTeam());
	}
}