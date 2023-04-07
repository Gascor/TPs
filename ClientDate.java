public class ClientDate {

    public static void main(String [] args) {
        Date testdate1 = new Date(12,3,2022);
        Date testdate2 = new Date(1,3,2004);
        Date testdate3 = new Date(2023);
        System.out.println(testdate1);
        System.out.println(testdate1.dateDeLaVeille());
        System.out.println(testdate2);
        System.out.println(testdate2.dateDeLaVeille());
        System.out.println(testdate3);
        System.out.println(testdate3.dateDeLaVeille());
    }
}
