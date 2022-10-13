// Isaac, Wei og Oliver

package HarryFrisoer;

import java.util.ArrayList;
import java.util.Scanner;

public class KalenderTest {
    private int day;
    private int month;
    private int week;

    Scanner sc1 = new Scanner(System.in);
    ArrayList<Kalender>kalenderListe=new ArrayList<>();
    /*ArrayList<Kalender>kalenderliste2=new ArrayList<>();
    ArrayList<Kalender>kalenderListe3=new ArrayList<>();*/

    public int november() {
        System.out.println("*** valg uge - November ***:\n" + " 1 - Uge 43\n" + " 2- Uge 44\n" + " 3 - Uge 45\n");
        int ugeValg = 0;
        int resultat1 = sc1.nextInt();
        switch (resultat1) {
            case 1:
                System.out.println("Uge 43");
                ugeValg = 43;
                return resultat1;

            case 2:
                System.out.println("Uge 44");
                ugeValg = 44;
                return resultat1;

            case 3:
                System.out.println("Uge 45");
                ugeValg = 45;
                return resultat1;
        }
        return ugeValg;
    }

    public int valgDag() {
        System.out.println("*** Valg af Dag ***:\n" + " 1 - Mandag\n" + " 2 - Tirsdag\n" + " 3 - Onsdag\n"
        + " 4 - Torsdag\n" + " 5 - Fredag");
        int resultat2 = sc1.nextInt();
        switch(resultat2) {
            case 1:
                System.out.println("Mandag");
                return resultat2;

            case 2:
                System.out.println("Tirsdag");
                return resultat2;

            case 3:
                System.out.println("Onsdag");
                return resultat2;

            case 4:
                System.out.println("Torsdag");
                return resultat2;

            case 5:
                System.out.println("Fredag");
                return resultat2;
        }
        return 2;
    }
    public int valgTid() {
        System.out.println("*** Valg af Tid ***:\n" + " 1 - kl. 9 til 10\n" + " 2 - kl. 10 til 11\n"
        + " 3 - kl. 11 til kl. 12\n" + " 4 - kl. 13 til 14\n" + " 5 - kl. 14 til 15\n" + " 6 - kl. 15 til 16");
        int resultat3 = sc1.nextInt();
        switch (resultat3) {
            case 1:
                System.out.println("kl. 9 til 10");
                return resultat3;

            case 2:
                System.out.println("kl. 10 til 11");
                return resultat3;

            case 3:
                System.out.println("kl. 11 til 12");
                return resultat3;

            case 4:
                System.out.println("kl. 13 - 14");
                return resultat3;

            case 5:
                System.out.println("kl. 14 - 15");
                return resultat3;

            case 6:
                System.out.println("kl. 15 - 16");
                return resultat3;
        }
        return 3;
    }
    public int kalendervisning(){
        System.out.println("*** Dato måned***:\n" +
                " 1 - uge 43 \n" +
                " 2 - uge 44 \n" +
                " 3 - uge 45 ");
        int månedvalg = sc1.nextInt();
        int ugeValg = 0;
        if (månedvalg == 1){
            System.out.println("Du har valgt uge 43");
            ugeValg = 43;
        } else if (månedvalg == 2) {
            System.out.println("Du har valgt uge 44");
            ugeValg = 44;
        } else {
            System.out.println("Du har valgt uge 45");
            ugeValg = 45;
        }
        return ugeValg;
    }
    public String kalndervisning2(){
        System.out.println("ugedage:\n" +
                "1 - Mandag             \n" +
                "2 - Tirsdag\n" +
                "3 - Onsdag \n" +
                "4 - Torsdag\n" +
                "5 - Fredag\n" );
        int vælgDag = sc1.nextInt();
        String vælgDag1;
        if(vælgDag==1){
            System.out.println("Du har valgt Mandag");
            vælgDag1="Mandag";
        } else if (vælgDag==2){
            System.out.println("Du har valgt Tirsdag");
            vælgDag1="Tirsdag";
        } else if (vælgDag==3) {
            System.out.println("Du har valgt Onsdag");
            vælgDag1="Onsdag";
        } else if (vælgDag==4) {
            System.out.println("Du har valgt Torsdag");
            vælgDag1="Torsdag";
        } else {
            System.out.println("Du har valgt Fredag");
            vælgDag1="Fredag";
        }
        return vælgDag1;
    }
    public String kalenderVisning3(){
        System.out.println("Tidspunkt:\n" +
                "1 - kl. 9 til 10 \n" +
                "2 - kl. 10 til 11 \n" +
                "3 - kl. 11 til 12 \n" +
                "4 - kl. 13 til 14\n" +
                "5 - kl. 14 til 15\n"+
                "6 - kl. 15 til 16");
        int vælgTid= sc1.nextInt();
        String vælgTid2;
        if (vælgTid==1){
            System.out.println("Du har valgt kl. 9-10");
            vælgTid2="kl. 9 til 10";
        } else if (vælgTid==2) {
            System.out.println("Du har valgt kl. 10-11");
            vælgTid2="kl. 10 til 11";

        } else if (vælgTid==3) {
            System.out.println("Du har valgt kl. 11 til 12");
            vælgTid2="kl. 11 til 12";


        } else if (vælgTid==4) {
            System.out.println("Du har valgt kl. 13 til 14");
            vælgTid2="kl. 13 til 14";

        } else if (vælgTid==5) {
            System.out.println("Du har valgt kl. 14 til 15");
            vælgTid2="kl. 14 til 15";
        }
        else {
            System.out.println("du har valgt kl. 15 til 16");
            vælgTid2="kl. 15 til 16";
        }
        return vælgTid2;
    }




    @Override
    public String toString() {
        return "KalenderTest{" +
                "day=" + day +
                ", month=" + month +
                ", week=" + week +
                ", sc1=" + sc1 +
                '}';
    }
}
