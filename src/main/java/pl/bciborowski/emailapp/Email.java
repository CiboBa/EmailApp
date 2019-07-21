package pl.bciborowski.emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String company = "CarlosBros";
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + company.toLowerCase() + ".com";
    }

    private String setDepartment() {
        System.out.println("WHAT IS YOUR DEPARTMENT CODE?:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
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

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);

    }

    void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    void changePassword(String password) {
        this.password = password;
    }

    String getEmail() {
        return email;
    }

    int getMailboxCapacity() {
        return mailboxCapacity;
    }

    String getAlternateEmail() {
        return alternateEmail;
    }

    String getPassword() {
        return password;
    }

    String showInfo() {
        return "\nINFO:" +
                "\nNAME: " + firstName + lastName +
                "\nEMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity +
                "\nPASSWORD: " + password;
    }
}
