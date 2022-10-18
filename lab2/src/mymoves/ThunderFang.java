package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ThunderFang extends PhysicalMove {
    public ThunderFang(){super(Type.ELECTRIC, 65, 95);}

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.1) Effect.paralyze(defender);
        if(Math.random() < 0.1) Effect.flinch(defender);
    }

    @Override
    protected String describe() {
        return "использует Thunder Fang";
    }
}
