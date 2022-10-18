package mypokemons;

import mymoves.ShadowBall;
import mymoves.Sing;
import ru.ifmo.se.pokemon.*;

public class Igglybuff extends Pokemon {

    public Igglybuff(String name, int level){
        super(name, level);
        setStats(90, 30,15,40,20,15);
        setType(Type.NORMAL,Type.FAIRY);
        setMove(new ShadowBall(), new Sing());

    }
}
