import java.util.Arrays;

public class ClientReservation {

    public static void main(String [] args) {
        try{
        Reservation test1 = new Reservation(new Date(-1, 3, 2023),
                new PlageHoraire(new Horaire(8, 30),
                        new Horaire(11, 15)),
                "Hôtel Ibis");
        Reservation test2 = new Reservation(new Date(-29, -3, 2018),
                new PlageHoraire(new Horaire(5, 15),
                        new Horaire(7, 30)),
                "Dire bonjour");
        Reservation test3 = new Reservation(new Date(8, 6, 2019),
                new PlageHoraire(new Horaire(14, 30),
                        new Horaire(22, 45)),
                "Switch crisss");
        Reservation test4 = new Reservation(new Date(10, 9, 2022),
                new PlageHoraire(new Horaire(21, 15),
                        new Horaire(23, 30)),
                "One Piece Red nul");
        Reservation[] tableauReservation = {test1, test2, test3, test4};
        System.out.println(Arrays.toString(tableauReservation));
        Arrays.sort(tableauReservation);
        System.out.println(Arrays.toString(tableauReservation));
        }
        catch (PlageHoraireException parExc) {
            System.err.print(parExc);
            System.err.print(" - ");
            System.err.println(parExc.getCodeErreur());
            System.exit(-1);
        }
        catch (ReservationException parExc) {
            System.err.print(parExc);
            System.err.print(" - ");
            System.err.print(parExc.getCodeErreur());
            System.exit(-1);
        }
    }
}
// MAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA NICOLEEEETAAAAAAAAA