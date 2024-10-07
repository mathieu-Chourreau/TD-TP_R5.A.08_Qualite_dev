package com.mchourreau.tourner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class PersonnageTest {


    @Test
    void tourner_1_dervait_ecrire_EST(){
        Personnage avatar = new Personnage();
        Personnage.Orientation actualOrientation = avatar.tourner(1);
        assertThat(actualOrientation).isEqualTo(Personnage.Orientation.EST);
    }

    @Test
    void tourner_2_dervait_ecrire_SUD(){
        Personnage avatar = new Personnage();
        Personnage.Orientation actualOrientation = avatar.tourner(2);
        assertThat(actualOrientation).isEqualTo(Personnage.Orientation.SUD);
    }
    @Test
    void tourner_3_dervait_ecrire_OUEST(){
        Personnage avatar = new Personnage();
        Personnage.Orientation actualOrientation = avatar.tourner(3);
        assertThat(actualOrientation).isEqualTo(Personnage.Orientation.OUEST);
    }
    @Test
    void tourner_4_dervait_ecrire_NORD(){
        Personnage avatar = new Personnage();
        Personnage.Orientation actualOrientation = avatar.tourner(4);
        assertThat(actualOrientation).isEqualTo(Personnage.Orientation.NORD);
    }

    @Test
    void tourner_1_devrait_ecrire_SUD_si_on_est_sur_EST(){

    }

}