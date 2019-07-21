package pl.bciborowski.emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String company;
    private int mailboxCapacity;
    private int defaultPasswordLength = 8;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("DEPARTMENT: " + this.department);
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("PASSWORD: " + this.password);
    }

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    //Generate a random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);

    }

    //Create set methods to change password, set the mailbox capacity and define an alternate email

    // Have get methods to display the name, email and mailbox capacity
}
