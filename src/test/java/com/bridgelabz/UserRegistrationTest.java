package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

     UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.firstName.validate("Surabhi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.firstName.validate("surabhi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.lastName.validate("Bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.lastName.validate("bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.email.validate("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.email.validate("sur12@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.mobileNumber.validate("91 8957412368");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.mobileNumber.validate("8759641236");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule1.validate("Su@ra-bhi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule1.validate("surabhi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule2.validate("Su@ra-bhi_Bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule2.validate("bha-gat.sur");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule3.validate("Sur@bhi12");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule3.validate("Sur@b.hi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule4.validate("Surabhi@12bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
        boolean result = userRegistration.passwordRule4.validate("Sur1abhi2bhagat");;
        Assertions.assertTrue(result);
    }
}
