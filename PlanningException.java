public class PlanningException extends Exception implements ConstantesErreur{

    private final int chCodeErreur;

    public PlanningException(int errCode){
        super();
        chCodeErreur = errCode;
    }

    public String getCodeErreur(){
        return ERREURS_PLANNING[chCodeErreur];
    }
}
