import java.util.Arrays;

public class ClientDateCalendrier {

    public static void main(String [] args) {
        DateCalendrier date1 = new DateCalendrier();
        System.out.println(date1);
        DateCalendrier date2 = new DateCalendrier(2,11,2021);
        System.out.println(date2);
        System.out.println(date2.dateDuLendemain());
        System.out.println(date2.dateDeLaVeille());
        DateCalendrier date3 = new DateCalendrier(5,12,2100);
        DateCalendrier [] tableaudate = {date2,date3,date1};
        Arrays.sort(tableaudate);
        System.out.println(Arrays.toString(tableaudate));
    }
}
