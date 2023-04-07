import java.util.Arrays;

public class Planning {
    private Reservation [] chTabReserv;
    static final int SIZE = 24;


    /**
     * Constructeur de la classe Planning.
     */
    public Planning(){
        chTabReserv = new Reservation[SIZE];
    }

    /**
     * Renvoie le planning sous la forme d'un String.
     *
     * @return String
     */
    public String toString(){
        String returnValue = "════════════\n";
        for (int i = 0 ; i < SIZE && chTabReserv[i] != null ; i++) {
            returnValue = returnValue + " ▪ " + chTabReserv[i].toString() + "\n";
        }
        return returnValue + "════════════";
    }

    /**
     * Ajoute une réservation au planning.
     *
     * @param parReserv La Réservation à ajouter.
     * @throws PlanningException lorsque la Réservation ne peut pas être ajoutée.
     */
    public void ajout(Reservation parReserv) throws PlanningException {
        if (chTabReserv[SIZE - 1] != null) {
            throw new PlanningException(1);
        }
        int i;
        for (i = 0; i < SIZE && chTabReserv[i] != null; i++) {
            if (chTabReserv[i].compareTo(parReserv) == 0) {
                throw new PlanningException(2);
            }
        }
        chTabReserv[i] = parReserv;
    }

    /**
     * Renvoie la réservation correspondant à une date donnée.
     *
     * @param parDate La date de la réservation recherchée.
     * @return La première réservation correspondante ou null si aucune ne corresponds.
     */
    public Reservation getReservation (Date parDate) {
        for (int i = 0; i < SIZE; i++) {
            if (chTabReserv[i]!=null && parDate.compareTo(chTabReserv[i].getDate()) == 0) {
                return chTabReserv[i];
            }
        }
        return null;
    }

    /**
     * Renvoie toutes les réservations correspondants à une date donnée.
     *
     * @param parDate La date des réservations recherchées.
     * @return Un tableau contenant toutes les réservations correspondantes.
     */
    public Reservation [] getReservations (Date parDate){
        int taille = 0;
        for (int i = 0; i < SIZE; i++) {
            if (chTabReserv[i]!=null && parDate.compareTo(chTabReserv[i].getDate()) == 0) {
                taille++;
            }
        }
        Reservation [] toReturn = new Reservation[taille];
        int indice = 0;
        for (int i = 0; i < SIZE; i++) {
            if (chTabReserv[i]!=null && parDate.compareTo(chTabReserv[i].getDate()) == 0) {
                toReturn[indice] = chTabReserv[i];
                indice++;
            }
        }
        return toReturn;
    }

    /**
     * Renvoie l'indice de la réservation ayant la date la plus lointaine du planning dans une certaine plage de dates.
     *
     * @param parDebut Date la plus lointaine autorisée.
     * @param parFin Date la plus proche autorisée.
     * @return int
     */
    public int plusAncienneReservation(int parDebut, int parFin){
        int indiceMin = parDebut;
        for (int i = parDebut + 1 ; i <= parFin ; i++){
            if (chTabReserv[indiceMin] != null &&
                chTabReserv[i] != null &&
                chTabReserv[indiceMin].compareTo(chTabReserv[i]) > 0){
                indiceMin = i;
            }
        }
        return indiceMin;
    }

    /**
     * Trie les réservations du planning par sélection.
     */
    public void triParSelection(){
        for (int i = 0; i < SIZE && chTabReserv[i] != null; i++){
            int ind = plusAncienneReservation(i, SIZE-1);
            Reservation tempo = chTabReserv[i];
            chTabReserv[i] = chTabReserv[ind];
            chTabReserv[ind] = tempo;
        }
    }

    /**
     * Trie les réservations du planning par insertion.
     */
    public void triParInsertion(){
        for (int i = 0; i < SIZE - 1 && chTabReserv[i] != null; i++ ){
            Reservation x = chTabReserv[i];
            for (int j = i ; j > 0 && chTabReserv[j-1] != null && chTabReserv[j-1].compareTo(x) > 0; j-- ){
                chTabReserv[j] = chTabReserv[j-1];
            }

        }
    }

    /**
     * Trie les réservations du planning en utilisant Arrays.
     */
    public void sort(){
        int ind = 0;
        while (chTabReserv[ind] != null){
            ind++;
        }
        Reservation [] newTab = new Reservation[ind];
        for (int i = 0; i < ind; i++){
            newTab[i] = chTabReserv[i];
        }
        Arrays.sort(newTab);
        for (int i = 0; i < ind; i++){
            chTabReserv[i] = newTab[i];
        }
    }
}
