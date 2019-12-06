package miage.alie.bowling;

public class Jeu {

    private Integer lancer1;
    private Integer lancer2;

    public Integer getLancer1() {
        return lancer1;
    }


    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Integer nombreQuillesTombees() {
        if(estUnStrike()){
            return lancer1;
        }
        return lancer1 + lancer2;
    }

    public boolean estUnSpare(){
        boolean estUnSpare = false;
        if (lancer1 != 10 && lancer1 + lancer2 == 10){
            estUnSpare = true;
        }
        return estUnSpare;
    }

    public boolean estUnStrike(){
        boolean estUnStrike = false;
        if (lancer1 == 10){
            estUnStrike = true;
        }
        return estUnStrike;
    }
}
