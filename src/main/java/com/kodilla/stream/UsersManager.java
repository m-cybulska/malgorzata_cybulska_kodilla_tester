package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;


public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> usersAbove45 = filterUsersAge();
        System.out.println(usersAbove45);

        List<String> usersWithNumberOfPostAbove115 = filterNumberOfPost();
        System.out.println(usersWithNumberOfPostAbove115);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    private static List<String> filterUsersAge() {
        List<String> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 45)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return users;
    }

    private static List<String> filterNumberOfPost() {
        List<String> usersList = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 115)
                .map(UsersManager :: getUserName)
                .collect(Collectors.toList());

        return usersList;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

}