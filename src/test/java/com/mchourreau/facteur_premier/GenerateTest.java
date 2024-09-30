package com.mchourreau.facteur_premier;

import com.mchourreau.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class GenerateTest {


    @Test
    void generate_1_devrait_retourner_1_liste_vide(){
        //Given
        List<Integer> expectedFacteurs = new ArrayList<Integer>();

        //When
        List<Integer> actualFacteurs = Generate.generate(1);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_2_devrait_retourner_liste_contenant_2(){
        //Given
        List<Integer> expectedFacteurs = new ArrayList<Integer>();
        expectedFacteurs.add(2);

        //When
        List<Integer> actualFacteurs = Generate.generate(2);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
}