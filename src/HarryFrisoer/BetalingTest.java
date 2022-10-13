// Isaac, Wei og Oliver

package HarryFrisoer;

import java.util.Scanner;

public class BetalingTest {
    private int kort;
    private int kontant;
    private int kredit;
    private boolean kreditlån;




    Scanner sc=new Scanner(System.in);

    public int betalingMulighed() {
        System.out.println("*** Betalings metode ***:\n" +
                " 1 - Kontant            \n" +
                " 2 - Kort                \n" +
                " 3 - Kredit                 ");
        int resualt = sc.nextInt();
        switch (resualt) {
            case 1:
                System.out.println("Du har valgt Kontant");
                return resualt;

            case 2:
                System.out.println("Du har valgt kort");
                return resualt;
            case 3:
                System.out.println("Du har valgt kredit");
                return resualt;

        }


        return 1;


    }
    public int beløb(){
        System.out.println("Beløb: ");
        int beløb= sc.nextInt();
        System.out.println(beløb+" kr.");

        return beløb;

    }

    public void kvittering(){
        System.out.println("*** Betalings metode ***:\n" +
                " 1 - Kontant            \n" +
                " 2 - Kort                \n" +
                " 3 - Kredit                 ");
        int betalingstype = sc.nextInt();
        String betaling;
        if (betalingstype == 1){
            System.out.println("Du har valgt og betale med kontant");
            betaling = "Kontant";
        } else if (betalingstype == 2) {
            System.out.println("Du har valgt at betale med kort");
            betaling = "Kort";
        } else {
            System.out.println("Du har valgt kredit som betalingsmetode");
            betaling = "Kredit";
        }

        int beløb;
        System.out.println("Beløb:");
        beløb = sc.nextInt();
        System.out.println("Kvittering *** \n" +
                "Betalingstype: " + betaling + "\n" +
                "Beløb betalt: " + beløb);
    }


}