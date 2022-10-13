// Isaac, Wei og Oliver

package HarryFrisoer;

import java.util.ArrayList;
import java.util.Scanner;

public class KundeTest {
    private String firstName;
    private String lastName;
    private String phoneNummber;
    private String emailAddress;


    Scanner scanner=new Scanner(System.in);
    int antalKlip;
    String input;

    ArrayList<Kunde>kundeListe=new ArrayList<>();



    public int antalKlip(String erro){
        System.out.println("Hvor mange antal klip?");
        int input = scanner.nextInt();

        extracted(erro);
        return extracted();

    }

    public Kunde lavKunde(){
        System.out.println("Indtast kundens navn");
        String navn = scanner.nextLine();
        System.out.println("Indtast kundens efternavn");
        String efterNavn = scanner.nextLine();
        System.out.println("Indtast kundens tlf nr");
        String tlfNr = scanner.nextLine();
        System.out.println("Indtast kundens mail");
        String mail = scanner.nextLine();
        Kunde nyKunde = new Kunde(navn, efterNavn, tlfNr, mail);
        int a = 0;
        kundeListe.add(a, nyKunde);
        a++;
        System.out.println("Ny kunde oprettet - " + nyKunde.toString());
        return nyKunde;
    }



    private int extracted() {
        int klipnum=scanner.nextInt();
        return klipnum;
    }

    private void extracted(String erro){
        while(!scanner.hasNextInt());
        System.out.println(erro);
        scanner.nextInt();
    }

    @Override
    public String toString() {
        return "KundeTest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNummber='" + phoneNummber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", scanner=" + scanner +
                ", antalKlip=" + antalKlip +
                ", input='" + input + '\'' +
                ", kundeListe=" + kundeListe +
                '}';
    }
}