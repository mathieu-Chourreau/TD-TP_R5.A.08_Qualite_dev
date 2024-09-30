package com.mchourreau.facteur_premier;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static List<Integer> generate(int nbre){
        List<Integer> facteurs = new ArrayList<Integer>();
        if (nbre > 1){
            facteurs.add(2);
        }
        return facteurs;
    }


}
