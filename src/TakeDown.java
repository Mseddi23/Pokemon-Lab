import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
	public TakeDown() {

		super(Type.NORMAL, 90, 85);
		// type = Type.NORMAL;
		// pow = 90;
		// acc = 85;

	}
	
	// Overrides applySelfDamage() from DamageMove.Applies recoil damage to the attacking Pokemon (25% of damage dealt).
	@Override protected void applySelfDamage(Pokemon att, double damage) {
		int recoil = (int) Math.round(damage * 0.25);
		att.setMod(Stat.HP, recoil);
		
	}

	// Overrides describe() from Move.
	@Override protected String describe() {
		return "атакует, используя TakeDown";
	}
}