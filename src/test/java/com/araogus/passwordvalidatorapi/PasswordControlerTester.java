package com.araogus.passwordvalidatorapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordControlerTester {
    PasswordValidationController passwordValidationController = new PasswordValidationController();

    @Test
    public void shouldValidatePassword() {

        String invalidPassword = "LUCAS";

        PasswordValidationResponse result = passwordValidationController.validate(invalidPassword);

        assertFalse(result.isValid());

    }

    @Test
    public void shouldValidateValidPassword() {

        String invalidPassword = "Ar@o1234567";

        PasswordValidationResponse result = passwordValidationController.validate(invalidPassword);

        assertTrue(result.isValid());
    }
    @Test
    public void shouldValidatePassword2() {

        String invalidpassword = "Abraao";

        PasswordValidationResponse result = passwordValidationController.validate(invalidpassword);

        assertFalse(result.isValid());
    }
    @Test
    public void ShouldValidatePassword3() {
        String invalidpassword = "A@roiu";

        PasswordValidationResponse result = passwordValidationController.validate(invalidpassword);

        assertFalse(result.isValid());
    }
}
