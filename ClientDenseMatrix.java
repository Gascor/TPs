public class ClientDenseMatrix {

    public static void main(String [] args) throws TailleMatriceException {
        System.out.println("Test constructeur sans elt");
        DenseMatrix matriceNull = new DenseMatrix();
        System.out.println(matriceNull);

        System.out.println(" --- Test constructeur deux int en entree");
        System.out.println("Matrice A :");
        DenseMatrix matriceA = new DenseMatrix(3, 3);
        matriceA.set(0, 0, 4);
        matriceA.set(0, 1, 1);
        matriceA.set(0, 2, -2);

        matriceA.set(1, 0, 0);
        matriceA.set(1, 1, 1);
        matriceA.set(1, 2, 1);

        matriceA.set(2, 0, 1);
        matriceA.set(2, 1, -2);
        matriceA.set(2, 2, 0);
        System.out.println(matriceA);

        System.out.println("\n\n\n --- Test constructeur tableau en entree");
        System.out.println("Matrice B :");
        double [][] tabB = {{2, -1, 1}, {0, 1, 0}};
        DenseMatrix matriceB = new DenseMatrix(tabB);
        System.out.println(matriceB);

        System.out.println("\nMatrice C :");
        double [][] tabC = {{3, -1}, {1, 0}, {0, 2}};
        DenseMatrix matriceC = new DenseMatrix(tabC);
        System.out.println(matriceC);
        System.out.println("\n");
        System.out.println(matriceC);

        System.out.println("\n\n\nMatrice geaulie :-)))");
        double [][] tabD = {{0,1,2,3,4},{1,2,3,4,5},{3,4,5,6,7},{4,5,6,7,8},{5,6,7,8,9}};
        DenseMatrix matriceD = new DenseMatrix(tabD);
        System.out.println(matriceD);

        System.out.println("\n\n\n --- Test des calculs sur martices");

        System.out.println("\n - Addition - \n");

        double [][] tab1 = {{1, 1, 1}, {2, 2, 2}};
        double [][] tab2 = {{5, 5, 5}, {7, 7, 7}};
        DenseMatrix mat1 = new DenseMatrix(tab1);
        DenseMatrix mat2 = new DenseMatrix(tab2);
        DenseMatrix matSum = mat1.sum(mat2);
        System.out.println(mat1);
        System.out.println("+");
        System.out.println(mat2);
        System.out.println("=");
        System.out.println(matSum);

        System.out.println("\n - Soustraction - \n");
        DenseMatrix matMinus = mat1.minus(mat2);
        System.out.println(mat1);
        System.out.println("-");
        System.out.println(mat2);
        System.out.println("=");
        System.out.println(matMinus);

        System.out.println("\n - Multiplication par un entier - \n");
        DenseMatrix matMult1 = mat1.mult(5);
        System.out.println(mat1);
        System.out.println("*");
        System.out.println(5);
        System.out.println("=");
        System.out.println(matMult1);
        /*
        System.out.println("\n - Multiplication par une matrice - \n");
        DenseMatrix matMult2 = matriceC.mult(matriceD);
        System.out.println(matriceC);
        System.out.println("*");
        System.out.println(matriceD);
        System.out.println("=");
        System.out.println(matMult2);

        System.out.println("\n - Transposition - \n");
        DenseMatrix matTrans = mat1.transpose();
        System.out.println("Matrice  transposer:");
        System.out.println(mat1);
        System.out.println("Matrice transposee");
        System.out.println(matTrans);

        System.out.println("\n\n --- Tests des méthodes usuelles");

        System.out.println("\n - methode copy - \n");
        System.out.println("a copier :");
        System.out.println(mat1);
        DenseMatrix matCopy = mat1.copy();
        System.out.println("la copie :");
        System.out.println(matCopy);

        System.out.println("\n - ");*/
    }
}
