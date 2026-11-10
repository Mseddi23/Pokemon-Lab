import ru.ifmo.se.pokemon.*;

public class FakeOut extends PhysicalMove {

	public FakeOut() {
		super(Type.NORMAL, 40, 100);
	}

	@Override protected void applyOppEffects(Pokemon p) {
		Effect.flinch(p);
	}

	@Override protected String describe() {
		return "заставляет противника дрогнуть";
	}

}