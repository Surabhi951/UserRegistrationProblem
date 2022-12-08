package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) throws InvalidUserDetailsException {
        UserRegistration userRegistration = new UserRegistration();//create an object of user registration class
        Scanner scanner = new Scanner(System.in);//create an object of scanner class
        System.out.println("Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID\n4. Validate Mobile Number\n5. Validate Password Rule1\n6. Validate Password Rule2\n7. Validate Password Rule3\n8. Validate Password Rule4");//select option
        switch (scanner.nextInt()) {
            case 1:
                userRegistration.firstName.validate("Surabhi");
                break;
            case 2:
                userRegistration.lastName.validate("Bhagat");
                break;
            case 3:
                userRegistration.email.validate("abc.xyz@bl.co.in");
                break;
            case 4:
                userRegistration.mobileNumber.validate("91 8957412368");
                break;
            case 5:
                userRegistration.passwordRule1.validate("Su@ra-bhi");
                break;
            case 6:
                userRegistration.passwordRule2.validate("Su@ra-bhi_Bhagat");
                break;
            case 7:
                userRegistration.passwordRule3.validate("Sur@bhi12");
                break;
            case 8:
                userRegistration.passwordRule4.validate("Surabhi@12bhagat");
                break;
        }
    }
}