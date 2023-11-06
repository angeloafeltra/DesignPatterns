package org.example.adapters;

import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super();
        this.peg=squarePeg;
    }

    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
