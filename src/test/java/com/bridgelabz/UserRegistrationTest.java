package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

     UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validFirstName("Surabhi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validFirstName("surabhi");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validLastName("Bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validLastName("bhagat");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validEmail("sur12@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validMobileNumber("91 8957412368");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validMobileNumber("8759641236");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule1("Su@ra-bhi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule1("surabhi");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule2("Su@ra-bhi_Bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule2("bha-gat.sur");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule3("Sur@bhi12");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule3("Sur@b.hi");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule4("Surabhi@12bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule4("Sur1abhi2bhagat");
        Assertions.assertFalse(result);
    }
}
