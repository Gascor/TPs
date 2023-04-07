import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ClientPlanning {

    public static void main(String [] args){
        Planning test = new Planning();
        DateCalendrier testDate = new DateCalendrier(8,6,2019);
        try{
            test.ajout(new Reservation(new DateCalendrier(5,12,2023),
                    new PlageHoraire(new Horaire(5,30),
                            new Horaire(7,15)),
                    "Film Mario"));
            Scanner scanner = new Scanner(new File("data" + File.separator + "Planning.txt" )).useDelimiter(",");
            while(scanner.hasNext()){
                String intitule = scanner.next();
                int Jour = Integer.parseInt(scanner.next());
                int Mois = Integer.parseInt(scanner.next());
                int Annee = Integer.parseInt(scanner.next());
                int horraire1 = Integer.parseInt(scanner.next());
                int quartheure1 = Integer.parseInt(scanner.next());
                int horraire2 = Integer.parseInt(scanner.next());
                int quartheure2 = Integer.parseInt(scanner.next());

                new Reservation(new DateCalendrier(Jour,Mois,Annee),new PlageHoraire(new Horaire(horraire1,quartheure1),new Horaire(horraire2,quartheure2)),intitule);
            }
        }
        catch (PlanningException parExc){
            System.err.print(parExc);
            System.err.print(" - ");
            System.err.println(parExc.getCodeErreur());
            System.exit(-1);
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
        catch (FileNotFoundException parExc) {
            System.err.print(parExc);
            System.err.print("FileNoteFoundExeption");
            System.exit(-1);
        }
    }
}
