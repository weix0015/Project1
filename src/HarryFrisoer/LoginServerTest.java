// Isaac, Wei og Oliver

package HarryFrisoer;

import java.util.Scanner;

public class LoginServerTest {

    Scanner input = new Scanner(System.in);

    public boolean login(String user, String password) {
        if (user.equals("Harry") && password.equals("hairyharry")) {

            return true;
        }
        return false;


    }


}