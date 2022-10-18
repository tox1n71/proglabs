package mymoves;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing(){super(Type.NORMAL, 0, 55);}


    @Override
    protected void applyOppEffects(Pokemon defender) {
        Effect.sleep(defender);
    }

    @Override
    protected String describe() {
        return "использует Sing";
    }
}

