package com.mchourreau.facteur_premier;

import com.mchourreau.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class GenerateTest {
    private List<Integer> actualFacteurs;

    private List<Integer> expectedFacteurs;

    private List<Integer> listeFab(int ... composants){
        List<Integer> listeARetourner = new ArrayList<Integer>();

        for (int i : composants){
            listeARetourner.add(i);
        }
        return listeARetourner;
    }


    @Test
    void generate_1_devrait_retourner_1_liste_vide(){
        //Given
        expectedFacteurs = listeFab();
        //When
        List<Integer> actualFacteurs = Generate.generate(1);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_2_devrait_retourner_liste_contenant_2(){
        //Given
        expectedFacteurs = listeFab();
        expectedFacteurs.add(2);

        //When
        List<Integer> actualFacteurs = Generate.generate(2);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_3_devrait_retourner_liste_contenant_3(){
        //Given
        expectedFacteurs = listeFab();
        expectedFacteurs.add(3);

        //When
        List<Integer> actualFacteurs = Generate.generate(3);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }


    @Test
    void generate_4_devrait_retourner_liste_contenant_2_2(){
        //Given
        expectedFacteurs = listeFab();
        expectedFacteurs.add(2);
        expectedFacteurs.add(2);

        //When
        List<Integer> actualFacteurs = Generate.generate(4);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_4_devrait_retourner_liste_contenant_2_3(){
        //Given
        expectedFacteurs = listeFab(2,3);


        //When
        List<Integer> actualFacteurs = Generate.generate(6);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_8_devrait_retourner_liste_contenant_2_2_2(){
        //Given
        expectedFacteurs = listeFab(2,2,2);


        //When
        List<Integer> actualFacteurs = Generate.generate(8);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_9_devrait_retourner_liste_contenant_3_3(){
        //Given
        expectedFacteurs = listeFab(3,3);


        //When
        List<Integer> actualFacteurs = Generate.generate(9);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

}