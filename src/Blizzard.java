import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {

    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    // 10% chance to freeze the opponent after a successful hit.
    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.freeze(p);
        }
    }

    @Override protected String describe() {
        return "замораживает противника";
    }
}