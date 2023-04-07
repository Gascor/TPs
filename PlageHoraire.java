public class PlageHoraire implements Comparable <PlageHoraire> {
    private Horaire chDeb, chFin;
    final static int DUREE = 60;

    /**
     * Constructeur de la classe PlageHoraire.
     *
     * @param parDeb Date de début de la plage horaire.
     * @param parFin Date de fin de la plage horaire.
     */
    public PlageHoraire(Horaire parDeb, Horaire parFin) throws PlageHoraireException{
        chDeb = parDeb;
        chFin = parFin;
        if (!estValide()) {
            throw new PlageHoraireException(0);
        }
    }

    /**
     * Renvoie la plage horaire sous la forme d'un String.
     *
     * @return Horaire1 - Horaire2, durée : durée
     */
    public String toString(){
        int min = duree() % 60;
        int heure = (duree() - min) / 60;
        return chDeb.toString() + " - " + chFin.toString() + ", durée : " + heure + "h" + min + "mn";
    }

    /**
     * @return Le nombre de minutes comprises dans la plage horaire.
     */
    public int duree(){
        return chFin.toMinutes() - chDeb.toMinutes();
    }

    /**
     * Renvoie un booléen testant si la plage horaire est bien supérieure ou égale à la constante DUREE.
     *
     * @return true si la date est valide, false sinon.
     */
    public boolean estValide(){
        return duree() >= DUREE;
    }

    /**
     * Compare deux plages horaires, renvoie un négatif quand this précède parPH, positif quand parPh précède this, et 0 quand les deux plages.
     *
     * @param parPH La plage horaire à comparer.
     * @return
     * horaires sont incompatibles.
     */
    public int compareTo(PlageHoraire parPH){
        if (this.chFin.toMinutes() < parPH.chDeb.toMinutes()) {
            return -1;
        } else if (this.chDeb.toMinutes() > parPH.chFin.toMinutes()) {
            return 1;
        } else {
            return 0;
        }
    }


}
