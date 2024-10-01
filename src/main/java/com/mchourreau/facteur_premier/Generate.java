package com.mchourreau.facteur_premier;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static List<Integer> generate(int nbre){
        List<Integer> facteurs = new ArrayList<Integer>();{
        int candidat = 2;
        while (nbre > 1){
            if ((nbre%candidat) ==0){
                nbre /= candidat;
                facteurs.add(candidat);

            }
            else {
                candidat++;
            }
        }
        return facteurs;
    }
    }
}
