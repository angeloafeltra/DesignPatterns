package org.example.round;

public class RoundHole {

    private double radius;

    public RoundHole(double radius){
        this.radius=radius;
    }

    public double getRadius() {return this.radius;}

    public boolean fits(RoundPeg roundPeg){
        boolean result;
        result=(this.getRadius()>=roundPeg.getRadius());
        return result;
    }


}
