package org.example;

import org.example.adapters.SquarePegAdapter;
import org.example.round.RoundHole;
import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

public class Main {
    public static void main(String[] args) {

        RoundHole roundHole=new RoundHole(5);
        RoundPeg roundPeg=new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("rounHole entra in roundPeg");
        }

        SquarePeg squarePeg=new SquarePeg(20);
        SquarePegAdapter squarePegAdapter=new SquarePegAdapter(squarePeg);
        if (roundHole.fits(squarePegAdapter)) {
            System.out.println("squarePag entra in roundPeg");
        }


    }
}