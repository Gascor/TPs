import java.util.Arrays;

public class DenseMatrix {
    private int chnRow;
    private int chnCol;
    private double[][] chVals;

    /**
     * Constructeur de la classe DenseMatrix sans argument. Crée une Matrice à 0 lignes et à 0 colonnes.
     */
    public DenseMatrix(){
        chnRow = 0;
        chnCol = 0;
        chVals = new double[0][0];
    }

    /**
     * Constructeur de la classe DenseMatrix pour un argument. Crée une Matrice à partir d'un tableau à deux dimensions.
     *
     * @param parMat Tableau à deux dimensions.
     */
    public DenseMatrix(double[][] parMat) {
        chnRow = parMat.length;
        chnCol = parMat[0].length;
        chVals = parMat;
    }

    /**
     * Constructeur de la classe DenseMatrix à deux arguments. Crée une Matrice de N lignes et M colonnes.
     *
     * @param parN Nombre de lignes.
     * @param parM Nombre de colonnes.
     */
    public DenseMatrix(int parN, int parM) {
        chnRow = parN;
        chnCol = parM;
        chVals = new double[parN][parM];
    }

    public int getRowDimension(){
        return chnRow;
    }

    public int getColDimension(){
        return chnCol;
    }

    public double get(int i, int j){
        return chVals[i][j];
    }

    public void set(int i, int j, double aij){
        chVals[i][j] = aij;
    }

    /**
     * Écrit la matrice ligne par ligne en console.
     */
    public void write(){
        for (int x=0 ; x < chnRow ; x++){
            System.out.println(Arrays.toString(chVals[x]));
        }
    }

    /**
     * Convertit la matrice en String.
     *
     * @return String
     */
    public String toString(){
        String toReturn = "";
        for (int i = 0; i < chnRow; i++){
            toReturn = toReturn + "(";
            for (int j = 0; j < chnCol; j++){
                toReturn = toReturn + " " + chVals[i][j] + " ";
            }
            toReturn = toReturn + ")\n";
        }
        return toReturn;
    }

    /**
     * Renvoie une Matrice contenant la somme de this et d'une matrice donnée.
     *
     * @param parB La matrice donnée.
     * @return La matrice somme.
     * @throws TailleMatriceException Si le nombre de colonnes/de lignes n'est pas égal entre les deux matrices.
     */
    public DenseMatrix sum(DenseMatrix parB) throws TailleMatriceException{
        if (chnCol != parB.chnCol){
            throw new TailleMatriceException("Nombre de colonnes inégal.");
        }
        if (chnRow != parB.chnRow){
            throw new TailleMatriceException("Nombre de lignes inégal.");
        }
        DenseMatrix matriceSomme = new DenseMatrix(chnRow, chnCol);
        for (int i = 0 ; i < chnRow ; i++){
            for (int j = 0 ; j < chnCol ; j++){
                matriceSomme.set(i, j, chVals[i][j] + parB.chVals[i][j]);
            }
        }
        return matriceSomme;
    }

    /**
     * Renvoie une Matrice contenant la soustraction de this et d'une matrice donnée.
     *
     * @param parB La matrice donnée.
     * @return La matrice soustraction.
     * @throws TailleMatriceException Si le nombre de colonnes/de lignes n'est pas égal entre les deux matrices.
     */
    public DenseMatrix minus(DenseMatrix parB) throws TailleMatriceException{
        if (chnCol != parB.chnCol){
            throw new TailleMatriceException("Nombre de colonnes inégal.");
        }
        if (chnRow != parB.chnRow){
            throw new TailleMatriceException("Nombre de lignes inégal.");
        }
        DenseMatrix matriceSoustraction = new DenseMatrix(chnRow, chnCol);
        for (int i = 0 ; i < chnRow ; i++){
            for (int j = 0 ; j < chnCol ; j++) {
                matriceSoustraction.set(i, j, chVals[i][j] - parB.chVals[i][j]);
            }
        }
        return matriceSoustraction;
    }

    /**
     * Renvoie une Matrice contenant le produit de this avec un scalaire.
     *
     * @param s Le scalaire avec lequel multiplier la Matrice.
     * @return La matrice produit.
     */
    public DenseMatrix mult( double s ){
        DenseMatrix matriceProduitScalaire = new DenseMatrix(chnRow, chnCol);
        for (int i = 0 ; i < chnRow ; i++){
            for (int j = 0 ; j < chnCol ; j++) {
                matriceProduitScalaire.set(i, j, chVals[i][j] * s);
            }
        }
        return matriceProduitScalaire;
    }
}
