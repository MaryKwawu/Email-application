import java.util.Scanner;

class Email{
    String firstName;
    String lastname;
    String password;
    String department;
    int mailboxCapacity = 500;
    String alternateEmail;
     int defaultPasswordLength = 10;
     String email;
     String companySuffix = "company.io";



    //Constructor to receive the firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastname = lastName;
//        System.out.println("Email CREATED: " + this.firstName + " " + this.lastname);


        //call a method asking for the department - return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);


        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
//        System.out.println("Your password is: " + this.password);


        //combine element to generate email
        email = firstName.toLowerCase() + " , " + lastName.toLowerCase()  + "@" + department + "." + companySuffix;
//        System.out.println("Your email is: " + email);


    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("New worker: " + firstName + " . Enter the  DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "Sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "act";
            
        }
        else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
           int rand =  (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }


    //change password
    public void changePassword(String password){
        this.password = password;

    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "\nDisplay Name: " + firstName + " " + lastname + "" + "\nCompany Email: " + email + "\nMail Box Capacity: " + mailboxCapacity + "mb";
    }
}

