package uk.reading.ac.uk.spink.Email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    //Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created "+this.firstName + " " + this.lastName);

        //Call a method asking for department
        this.department = setDepartment();
        System.out.println("Department is "+this.department);
    }

    //Ask for department
    private String setDepartment(){
        System.out.println("Enter the department:\n 1) Sales\n2) Development\n3) Accounting\n0)Nothing\nEnter code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2){
            return "Dev";
        }else if(depChoice == 3){
            return  "Accounting";
        }else{
            return "";
        }
    }
    //Create random password

    //Set mailbox capacity

    //Set alternate email

    //Change password

}
