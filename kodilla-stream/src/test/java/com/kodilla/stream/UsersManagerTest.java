package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void usersChemistGroupTest() {
        List<User> usersData = UsersRepository.getUsersList();
        List<String> namesOfUsers=  usersData.stream().map(User::getUsername).collect(Collectors.toList());

        List<String> expected = List.of("Walter White", "Gale Boetticher");

        List<String> actual = UsersManager.filterChemistGroupUsernames();
        assertEquals(expected, actual);
    }

    @Test
    public void usersOlderThanTest() {
        List<String> expected = List.of("Mike Ehrmantraut");

        List<String> actual = UsersManager.filterUsersOlderThan(50);

        assertEquals(expected, actual);
    }
}
