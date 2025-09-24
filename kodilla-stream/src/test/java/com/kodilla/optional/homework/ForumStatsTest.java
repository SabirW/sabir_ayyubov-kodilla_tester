package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    @Test
    public void testForumStats() {
        List<User> users = List.of(
                new User("Alice", 45, 10, "Board"),
                new User("Bob", 35, 5, "Security"),
                new User("Carol", 42, 7, "Chemists")
        );

        ForumStats forumStatsTest = new ForumStats();
        assertEquals(8.5, forumStatsTest.collectingUsersOver40(users));
        assertEquals(5, forumStatsTest.collectingUsersUnder40(users));
    }
}
