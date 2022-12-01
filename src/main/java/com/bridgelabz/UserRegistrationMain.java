package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            case 3:
                UserRegistration.validEmail();
                break;
        }
    }
}