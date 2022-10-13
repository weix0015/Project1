// Isaac, Wei og Oliver

package HarryFrisoer;

public class Kunde {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;


    // getter for kunde.

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmailAddress(){
        return emailAddress;
    }


    // setter for kunde
    public void setFirstName(String newfname){
        this.firstName =newfname;
    }
    public void setLastName(String newlname){
        this.lastName =newlname;
    }
    public void setPhoneNumber(String newphonenumber){
        this.phoneNumber=phoneNumber;
    }
    public void setEmailAddress(String newemailaddress){
        this.emailAddress=newemailaddress;
    }

    // constructor
    public Kunde(String firstName,String lastName,String phoneNumber,String emailAddress
    ){
        this.firstName =firstName;
        this.lastName =lastName;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;


    }

    @Override
    public String toString() {
        return "Kunde{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
