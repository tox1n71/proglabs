package mymoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Screech extends SpecialMove {
    public Screech(){super(Type.ELECTRIC, 0, 85);}

    @Override
    protected void applyOppEffects(Pokemon defender) {
        defender.setMod(Stat.DEFENSE, -2);
    }

    @Override
    protected String describe() {
        return "использует Screech";
    }
}
