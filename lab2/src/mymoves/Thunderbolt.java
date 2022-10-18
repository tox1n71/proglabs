package mymoves;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){super(Type.ELECTRIC, 90, 100);}

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.1) Effect.paralyze(defender);
    }

    @Override
    protected String describe() {
        return "использует Thunderbolt";
    }
}
