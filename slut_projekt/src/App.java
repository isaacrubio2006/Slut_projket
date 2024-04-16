import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" gokväll du vill boka buss");
      String[] bokning = new String[20];
      int[] personnmr = new int[20];
      int val = 0;
        double Apris= 249.99;
        double bpris= 149.99;
        while (val != 4) {
            Scanner tangentbord = new Scanner(System.in);
            System.out.println(" 1. lägg till bokning \n 2. Visa innehåll\n 3. Beräkna vinst sålda biljetter \n 4. avsluta \n ");
             val =tangentbord.nextInt();

             if (val==1) {
                System.out.println("skriv namn och personnummer: ");
                String boka = tangentbord.nextLine();
                if (bokning.length == 20) {
                    System.out.println("Det finns bara 20 platser det är upptaget");
                }
                else {
                        
                }
             }
        }
    }
}
