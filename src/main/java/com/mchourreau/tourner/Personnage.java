package com.mchourreau.tourner;

import java.awt.*;

public class Personnage {


    public enum Orientation{
        NORD,
        EST,
        SUD,
        OUEST
    }

    public Orientation defaultOrientation;

    // Constructor to set initial orientation to NORD
    public Personnage() {
        this.defaultOrientation = Orientation.NORD;
    }

    Orientation tourner(int nbre){

        if (nbre % 4 == 0)
        {
            return Orientation.NORD;
        }
        if (nbre % 4 == 1) {
            return Orientation.EST;
        }
        if (nbre % 4 == 2) {
            return Orientation.SUD;
        }
        if (nbre % 4 == 3) {
            return Orientation.OUEST;
        }
    }
}
