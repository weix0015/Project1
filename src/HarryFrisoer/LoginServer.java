// Isaac, Wei og Oliver

package HarryFrisoer;

import java.util.Scanner;

public class LoginServer {
    private String user;
    private String passWord;

    // setter

    public String getUser(){
        return user;
    }
    public String getPassWord(){
        return passWord;
    }
    // getter.

    public void setUser( String newuser){
        this.user=newuser;
    }
    public void setPassWord(String newpassword){
        this.passWord=newpassword;
    }
    public LoginServer(String user,String passWord){
        this.user=user;
        this.passWord=passWord;
    }

    @Override
    public String toString() {
        return "LoginServer{" +
                "user='" + user + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}