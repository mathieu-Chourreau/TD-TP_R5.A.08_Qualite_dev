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
        Orientation OrientationFinale = Orientation.NORD;

        if (nbre % 4 == 1) {
            OrientationFinale = Orientation.EST;
        }
        else if (nbre % 4 == 2) {
            OrientationFinale = Orientation.SUD;
        }
        else if (nbre % 4 == 3){
            OrientationFinale = Orientation.OUEST;
        }
        return OrientationFinale;
    }
}
