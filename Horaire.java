public class Horaire {
    private int chHeure;
    private int chQuartHeure;

    /**
     * Constructeur de la classe Horaire.
     *
     * @param parHeure L'heure actuelle
     * @param parQuartHeure Le quart d'heure actuel
     */
    public Horaire (int parHeure, int parQuartHeure){
        chHeure = parHeure;
        chQuartHeure = parQuartHeure;
    }

    /**
     * @return L'horaire en minutes.
     */
    public int toMinutes(){
        return chHeure*60 + chQuartHeure;
    }

    public int getHeure(){
        return chHeure;
    }

    public int getQuartHeure(){
        return chQuartHeure;
    }

    public void setHeure(int parHeure){
        chHeure = parHeure;
    }

    public void setQuartHeure(int parQuartHeure){
        chQuartHeure = parQuartHeure;
    }

    /**
     * Renvoie l'horaire sous la forme d'un String.
     *
     * @return "Heure"h"QuartHeure"
     */
    public String toString(){
        return chHeure + "h" + chQuartHeure;
    }
}
