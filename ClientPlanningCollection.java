

public class ClientPlanningCollection {

    public static void main(String[] args){
        try {
            PlanningCollection collection1 = new PlanningCollection();
            collection1.ajout(new Reservation(new DateCalendrier(01, 01, 2023), new PlageHoraire(new Horaire(8, 0), new Horaire(9, 30)), "1111"));
            collection1.ajout(new Reservation(new DateCalendrier(8, 02, 2023), new PlageHoraire(new Horaire(8, 0), new Horaire(9, 30)), "2222"));
            collection1.ajout(new Reservation(new DateCalendrier(25, 12, 2021), new PlageHoraire(new Horaire(8, 0), new Horaire(9, 30)), "3333"));
            System.out.println(collection1);
        }
        catch (PlageHoraireException parExc){
            System.out.println(parExc.getCodeErreur());
            System.exit(-1);
        }
        catch (ReservationException parExc){
            System.out.println(parExc.getCodeErreur());
            System.exit(-1);
        }
    }
}
