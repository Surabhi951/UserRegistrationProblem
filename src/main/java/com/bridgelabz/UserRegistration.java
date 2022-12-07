package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Validator firstName = (firstName) -> {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("first Name should start with a Cap and should have minimum 3 characters");
        } else {
            return true;
        }
    };

    Validator lastName = (lastName) -> {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("Last Name should start with a Cap and should have minimum 3 chars");
        }
        else {
            return true;
        }
    };

    Validator email = (email) -> {

        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("Enter a valid email address");
        }
        else {
            return true;
        }
    };

    Validator mobileNumber = (mobileNumber) -> {
        String regex = "^[\\d]{2}\\s[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("Enter the Valid Mobile number with county code");
        }
        else {
            return true;
        }
    };

    Validator passwordRule1 = (passwordRule1) -> {
        String regex = "^[A-Za-z0-9@._-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule1);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("Password must have 8 character");
        }
        else {
            return true;
        }
    };

    Validator passwordRule2 = (passwordRule2) -> {
        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("Password must have atleast one uppercase letter");
        }
        else {
            return true;
        }
    };

    Validator passwordRule3 = (passwordRule3) -> {
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("Password must have atleast one numeric number");
        }
        else {
            return true;
        }
    };

    Validator passwordRule4 = (passwordRule4) -> {
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule4);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new InvalidUserDetailsException("Password must has exactly one special character");
        }
        else {
            return true;
        }
    };
}
