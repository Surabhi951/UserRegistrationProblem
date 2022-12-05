package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

     UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validFirstName("Surabhi"));
            System.out.println("First name is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validFirstName("surabhi"));
            System.out.println("First name is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validLastName("Bhagat"));
            System.out.println("Last name is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validLastName("bhagat"));
            System.out.println("Last name is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validEmail("abc.xyz@bl.co.in"));
            System.out.println("Email is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }



    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validEmail("sur12@gmail.com"));
            System.out.println("Email is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validMobileNumber("91 8957412368"));
            System.out.println("Mobile Number is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validMobileNumber("8759641236"));
            System.out.println("Mobile Number is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule1("Su@ra-bhi"));
            System.out.println("Password Rule1 is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule1("surabhi"));
            System.out.println("Password Rule1 is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule2("Su@ra-bhi_Bhagat"));
            System.out.println("Password Rule2 is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule2("bha-gat.sur"));
            System.out.println("Password Rule2 is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue()  {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule3("Sur@bhi12"));
            System.out.println("Password Rule3 is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule3("Sur@b.hi"));
            System.out.println("Password Rule3 is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule4("Surabhi@12bhagat"));
            System.out.println("Password Rule4 is valid");
        }catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule4("Sur1abhi2bhagat"));
            System.out.println("Password Rule4 is valid");
        } catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }
}
