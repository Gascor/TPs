public class Reservation implements Comparable <Reservation> {
    private DateCalendrier chDate;
    private PlageHoraire chPH;
    private String chTitre;

    /**
     * Constructeur de la classe Reservation.
     *
     * @param parDate Date de la réservation.
     * @param parPH Plage horaire de la réservation.
     * @param parTitre Nom de la réservation.
     */
    public Reservation(DateCalendrier parDate, PlageHoraire parPH, String parTitre) throws ReservationException {
        chDate = parDate;
        chPH = parPH;
        chTitre = parTitre;
        if (!estValide()) {
            throw new ReservationException (0);
        }
    }

    /**
     * Renvoie la réservation sous la forme d'un String.
     *
     * @return Titre, Date, Plage Horaire, Durée.
     */
    public String toString(){
        return chTitre + ", " + chDate + ", " + chPH;
    }

    /**
     * Compare deux réservations.
     *
     * @param parReservation La réservation à comparer.
     * @return -1 si la réservation donnée précède celle-ci, 1 si celle-ci précède la réservation donnée, 0 sinon.
     */
    public int compareTo(Reservation parReservation){
        int compDate = chDate.compareTo(parReservation.chDate);
        if (compDate == 0) {
            return chPH.compareTo(parReservation.chPH);
        }
        return compDate;
    }

    /**
     * Renvoie true si la réservation est correcte, false sinon.
     *
     * @return boolean
     */
    public boolean estValide(){
        return chDate.estValide() && chPH.estValide();
    }

    public DateCalendrier getDate() {
        return chDate;
    }
}
