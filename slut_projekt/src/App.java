import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String[] namn = new String[20];
        long[] personnummer = new long[20];
        int val = 0;
      

        while (val != 4) {
            Scanner in = new Scanner(System.in);
            System.out.println("Du kan ange 4 val: ");
            System.out.println("1. Lägga till en passagerare - boka en obokad plats");
            System.out.println("2. Skriv ut lediga platser det finns");
            System.out.println("3. Beräkna vinsten av antalet sålda biljetter (299.90 kr/st).");
            System.out.println("4. Avsluta programmet");
            val = in.nextInt();
            if (val == 1) {
                int i = 0;
//                Scanner in = new Scanner(System.in);
                System.out.println("Ange personnr (10-siffor endast tecken): ");
                long personnr = in.nextLong();
                System.out.println("Ange namnet på personen som skall ha bokningen ");
                String personnamn = in.next();
                for (i = 0; i < personnummer.length; i++) {
                    if (personnummer[i] == 0) {
                        personnummer[i] = personnr;
                        namn[i] = personnamn;
                        System.out.println("Booking inlagd");
                        System.out.println();
                        break;
                    }
                }
                if (i == personnummer.length) {
                    System.out.println("Det är fullbokat tyvärr");
                }
            } else if (val == 2) {
                int antalled= 0;
              for(int i = 0; i < personnummer.length; i++){
                if (personnummer[i] == 0 ) {
                    antalled++;
                }
              }
              System.out.println("antal lediga platser är " + antalled);
            }
             else if (val == 3) {
                double vinst = 0;
                for(int i = 0; i < personnummer.length; i++){
                    if (personnummer[i] != 0) {
                      vinst =+ 299.99;  
                    }
                }
              System.out.println("vinst som gjorts är " + vinst);
            }
           
        }
    }
}
