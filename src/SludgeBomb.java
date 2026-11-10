import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {

    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    // 30% chance to poison the opponent after a successful hit.
    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.poison(p);
        }
    }

    @Override protected String describe() {
        return "отравляет противника";
    }
}