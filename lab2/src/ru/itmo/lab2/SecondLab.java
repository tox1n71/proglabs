package ru.itmo.lab2;
import ru.itmo.lab2.mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class SecondLab {
    public static void main(String[] args){
        Battle game = new Battle();
        Igglybuff ig = new Igglybuff("Саня", 1);
        Jigglypuff ji = new Jigglypuff("Андрей", 1);
        Wigglytuff wi = new Wigglytuff("Никита", 1);
        TapuLele tl = new TapuLele("Папич", 1);
        Gligar g1 = new Gligar("Стас", 1);
        Gliscor g2 = new Gliscor("Димас", 1);

        game.addAlly(ig);
        game.addAlly(ji);
        game.addAlly(wi);
        game.addFoe(tl);
        game.addFoe(g1);
        game.addFoe(g2);

        game.go();

    }

}
