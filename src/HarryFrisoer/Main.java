// Isaac, Wei og Oliver

package HarryFrisoer;

public class Main {
    public static void main(String[] args) {
        LoginServerTest loginServerTest=new LoginServerTest();
        System.out.println("******** Welcome to Harry Frisør webiste ******");
        System.out.println("-----------------------------------------------");
        System.out.print("Enter your Username:");
        String user = loginServerTest.input.nextLine();
        System.out.print("Enter your password: ");
        String password= loginServerTest.input.nextLine();
        boolean succelogin=loginServerTest.login(user,password);
        if(succelogin){
            System.out.println("Welcome");
        }
        else{
            System.out.println("You enter the wrong password.This accident will be report to the Police.");
            return;
        }

        KundeTest kundeTest=new KundeTest();
        kundeTest.lavKunde();
        KalenderTest kalenderTest = new KalenderTest();
        int uge = kalenderTest.kalendervisning();
        String dag = kalenderTest.kalndervisning2();
        String klokke = kalenderTest.kalenderVisning3();

        System.out.println("Du har valgt uge " + uge + ", dag " + dag + ", kl. " + klokke);
        BetalingTest betalingTest=new BetalingTest();
        betalingTest.kvittering();
        System.out.println("Kunde oplysninger: " + kundeTest.kundeListe);
        kundeTest.lavKunde();
        BetalingTest betalingTest1=new BetalingTest();
        betalingTest1.kvittering();
        System.out.println("Kunde oplysninger: " + kundeTest.kundeListe);
    }
}