import ru.ifmo.se.pokemon.*;

public class Scraggy extends Pokemon {

	public Scraggy(String name, int level) {

		super(name, level);
		setType(Type.DARK, Type.FIGHTING);
		setStats(50, 75, 70, 35, 70, 48);
	
		addMove(new TakeDown());
    		addMove(new Agility());
    		addMove(new Rest());
    		addMove(new Growl());
	}

}
