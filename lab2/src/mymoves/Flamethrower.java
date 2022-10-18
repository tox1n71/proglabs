package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {super(Type.FIRE, 90, 100);}

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.1){
            Effect.burn(defender);
        }
    }

    @Override
    protected String describe() {
        return "Использует Flamethrower";
    }
}
