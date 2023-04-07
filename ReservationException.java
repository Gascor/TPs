public class ReservationException extends Exception implements ConstantesErreur{
    private final int chCodeErreur;

    public ReservationException(int parCodeError){
        super();
        chCodeErreur = parCodeError;
    }

    public String getCodeErreur(){
        return ERREURS_RESERVATION[chCodeErreur];
    }
}
