package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.List;

public class ForumStats {

    public double collectingUsersOver40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public double collectingUsersUnder40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        List<User> users = com.kodilla.stream.UsersRepository.getUsersList();

        System.out.println("Average posts for users >= 40: " + forumStats.collectingUsersOver40(users));
        System.out.println("Average posts for users < 40: " + forumStats.collectingUsersUnder40(users));
    }
}
