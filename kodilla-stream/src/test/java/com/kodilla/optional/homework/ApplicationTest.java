package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void testStudentTeacherPairs() {
        List<String> expected = List.of(
                "Student: Jack, Teacher: Mr.Smith",
                "Student: Michael, Teacher: <undefined>",
                "Student: Frank, Teacher: Mr.John"
        );

        List<String> actual = Application.getStudentTeacherPairs();
        assertEquals(expected, actual);
    }
}
