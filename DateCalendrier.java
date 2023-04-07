import java.util.Calendar;

public class DateCalendrier extends Date implements
        ConstantesCalendrier, Comparable <Date>{
    private int chJourSem;

    /**
     * Constructeur de la classe DateCalendrier sans argument. Créé une DateCalendrier correspondant à la date du jour.
     */
    public DateCalendrier() {
        super(0, 0, 0);
        Calendar today = Calendar.getInstance();
        chAnnee = today.get(Calendar.YEAR);
        chMois = today.get(Calendar.MONTH) + 1;
        chJour = today.get(Calendar.DAY_OF_MONTH);
        chJourSem = today.get(Calendar.DAY_OF_WEEK) - 1;
        if (chJourSem == 0) {
            chJourSem = 7;
        }
    }

    /**
     * Constructeur de la classe DateCalendrier pour 3 arguments.
     * @param parJ Le jour de la date.
     * @param parM Le mois de la date.
     * @param parA L'année de la date.
     */
    public DateCalendrier(int parJ, int parM, int parA){
        super(parJ,parM,parA);
        Calendar day = Calendar.getInstance();
        day.set(parA, parM-1, parJ);
        chJourSem = day.get(Calendar.DAY_OF_WEEK) - 1;
        if (chJourSem == 0) {
            chJourSem = 7;
        }
    }

    /**
     * Methode qui permet de transformer l'Objet DateCalendrier en String
     * @return String
     */
    public String toString(){
        return ConstantesCalendrier.JOURS_SEMAINE[chJourSem-1] + " " + chJour + " " + ConstantesCalendrier.MOIS[chMois-1] + " " + chAnnee;
    }

    /**
     * Renvoie une DateCalendrier correspondant à la Date du lendemain.
     *
     * @return DateCalendrier
     */
    public DateCalendrier dateDuLendemain(){
        Date lendemain = super.dateDuLendemain();
        return new DateCalendrier(lendemain.chJour, lendemain.chMois, lendemain.chAnnee);
    }

    /**
     * Renvoie une DateCalendrier correspondant à la Date de la veille.
     *
     * @return DateCalendrier
     */
    public DateCalendrier dateDeLaVeille(){
        Date veille = super.dateDeLaVeille();
        return new DateCalendrier(veille.chJour, veille.chMois, veille.chAnnee);
    }
}
