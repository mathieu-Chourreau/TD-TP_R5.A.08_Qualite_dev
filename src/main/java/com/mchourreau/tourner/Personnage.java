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
        if (nbre == 1)
        {
            return Orientation.EST;
        } else if (nbre == 2) {
            return Orientation.SUD;
        } else if (nbre == 3) {
            return Orientation.OUEST;
        }
        else{
            return Orientation.NORD;
        }
    }
}
