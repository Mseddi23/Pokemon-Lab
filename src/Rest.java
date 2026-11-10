import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

	public Rest() {
		super(Type.NORMAL, 0, 100);
	}
	
	@Override protected void applySelfEffects(Pokemon p) {
		p.restore();
		Effect.sleep(p);
	}
	
	@Override protected String describe() {
		return "восстанавливает здоровье и засыпает";
	}

}