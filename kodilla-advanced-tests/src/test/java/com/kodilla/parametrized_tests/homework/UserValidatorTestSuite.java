package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource({
            "user123, true",
            "ab, false",             // too short
            "john_doe, true",
            "user.name, true",
            "user-name, true",
            "user@name, false",      // invalid character
            "123, true",
            "a_b, true",
            "a b, false"             // space not allowed
    })
    void testValidateUsername(String username, boolean expectedResult) {
        assertEquals(expectedResult, validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource({
            "test@example.com, true",
            "user.name@domain.co, true",
            "user-name@domain.com, true",
            "user_name@domain.org, true",
            "username@sub.domain.net, true",
            "user@domain, false",           // missing TLD
            "user@domain.toolongtld, false", // TLD > 6
            "user@.com, false",             // invalid domain
            "@domain.com, false",           // missing local part
            "null, false"                    // null input
    })
    void testValidateEmail(String email, boolean expectedResult) {
        if ("null".equals(email)) {
            email = null;
        }
        assertEquals(expectedResult, validator.validateEmail(email));
    }
}
