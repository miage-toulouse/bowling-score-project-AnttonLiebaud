package miage.alie.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> listeJeux = new ArrayList<>();

    public Partie(Jeu leJeu){
        for(int i = 0; i < 10; i++)
        {
            listeJeux.add(leJeu);
            if(i == 9) {
                if (leJeu.estUnSpare()) {
                    listeJeux.add(leJeu);
                }
                if (leJeu.estUnStrike()) {
                    listeJeux.add(leJeu);
                    listeJeux.add(leJeu);
                }
            }

        }

    }


    public Integer calculeScore(){
        Integer score = 0;

        for(int i = 0; i < 10; i++){
            score += listeJeux.get(i).nombreQuillesTombees();
            if(listeJeux.get(i).estUnSpare()){
                score += listeJeux.get(i+1).getLancer1();
            }
            if(listeJeux.get(i).estUnStrike()){
                score += listeJeux.get(i+1).getLancer1();
                score += listeJeux.get(i+2).getLancer1();
            }
        }

        return score;

    }
}
