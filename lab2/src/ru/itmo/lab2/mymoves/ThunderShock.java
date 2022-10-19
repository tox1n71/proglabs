package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {
    public ThunderShock(){super(Type.ELECTRIC, 40, 100);}

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.1) Effect.paralyze(defender);
    }

    @Override
    protected String describe() {
        return "использует Thunder Shock";
    }
}
