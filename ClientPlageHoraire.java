public class ClientPlageHoraire {

    public static void main(String [] args) {
        try {
            PlageHoraire testPlage1 = new PlageHoraire(new Horaire(11, 30),
                    new Horaire(16, 15));
            PlageHoraire testPlage2 = new PlageHoraire(new Horaire(8, 30),
                    new Horaire(11, 15));
            PlageHoraire testPlage3 = new PlageHoraire(new Horaire(16, 30),
                    new Horaire(23, 45));
            PlageHoraire testPlage4 = new PlageHoraire(new Horaire(12, 0),
                    new Horaire(15, 45));
            System.out.println(testPlage1.compareTo(testPlage2));
            System.out.println(testPlage1.compareTo(testPlage3));
            System.out.println(testPlage1.compareTo(testPlage4));
        }
        catch (PlageHoraireException parExc) {
            System.err.print(parExc);
            System.err.print(" - ");
            System.err.println(parExc.getCodeErreur());
            System.exit(-1);
        }
    }
}
