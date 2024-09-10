import java.util.Scanner;

class Email{
    String firstName;
    String lastname;
    String password;
    String department;
    int mailboxCapacity;
    String alternateEmail;
     int defaultPasswordLength = 10;
     String email;
     String companySuffix = "company.io";



    //Constructor to receive the firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastname = lastName;
        System.out.println("Email CREATED: " + this.firstName + " " + this.lastname);


        //call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);


        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);


        //combine element to generate email
        email = firstName.toLowerCase() + " , " + lastName.toLowerCase()  + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);


    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
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

    //Set the alternate email
}

