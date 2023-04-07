public class PlageHoraireException extends Exception implements ConstantesErreur{
    private int chCodeErreur;

    public PlageHoraireException(int parCodeError){
        super();
        chCodeErreur = parCodeError;
    }

    public String getCodeErreur(){
        return ERREURS_PLAGE_HORAIRE[chCodeErreur];
    }
}
