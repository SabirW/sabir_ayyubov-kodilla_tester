package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestData {

    public static Stream<Arguments> provideBMIData() {
        return Stream.of(
                Arguments.of(1.70, 50, "Underweight"),                   // BMI = 17.3
                Arguments.of(1.70, 65, "Normal (healthy weight)"),       // BMI = 22.5
                Arguments.of(1.70, 75, "Overweight"),                    // BMI = 25.95
                Arguments.of(1.7, 85, "Overweight"),
                Arguments.of(1.70, 95, "Obese Class I (Moderately obese)"), // BMI = 32.87
                Arguments.of(1.70, 110, "Obese Class II (Severely obese)"), // BMI = 38.06
                Arguments.of(1.70, 125, "Obese Class III (Very severely obese)"), // BMI = 43.28
                Arguments.of(1.70, 140, "Obese Class IV (Morbidly Obese)"), // BMI = 48.43
                Arguments.of(1.70, 155, "Obese Class V (Super Obese)"),    // BMI = 53.63
                Arguments.of(1.60, 80, "Obese Class I (Moderately obese)"), // BMI = 31.25
                Arguments.of(1.60, 155, "Obese Class VI (Hyper Obese)")    // BMI = 60.55
        );
    }
}
