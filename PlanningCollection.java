import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PlanningCollection {
    private ArrayList<Reservation> chReservList;
    private TreeSet<Reservation> chReservSet;

    public PlanningCollection(){
        chReservList = new ArrayList<Reservation>();
        chReservSet = new TreeSet<Reservation>();
    }
    public String toString(){
        return chReservList.toString()+"["+chReservList.size()+"]"+"\n"+chReservSet.toString()+"["+chReservSet.size()+"]";
    }
    public void ajout(Reservation parReserv){
        chReservList.add(parReserv);
        chReservSet.add(parReserv);
    }
    public TreeSet<Reservation> getChReservSet(DateCalendrier parDate){
        TreeSet<Reservation> nouveau = new TreeSet<Reservation>();
        Iterator<Reservation> it = chReservSet.iterator();
        while (it.hasNext()){
            Reservation r = it.next();
            if (parDate.compareTo(r.getDate())==0){
                nouveau.add(r);
            }
        }
        return nouveau;
    }
    public TreeMap<Reservation> 

    }
}
