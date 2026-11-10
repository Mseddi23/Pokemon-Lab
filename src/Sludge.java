import ru.ifmo.se.pokemon.*;

public class Sludge extends SpecialMove {
	
	public Sludge() {
		super(Type.POISON, 65, 100);
	}

	@Override protected void applyOppEffects(Pokemon p) {
		if (Math.random() < 0.3) {
			Effect.poison(p);
		}
	}

	@Override protected String describe() {
		return "отравляет противника";
	}

} 