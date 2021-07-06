package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                return users[i];
            }
        }
            throw new UserNotFoundException("User with current login not found");
        }


    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("Valid is false");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Login must be at least three characters long");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr", true)
        };
        try {
            User user = findUser(users, "Peter");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch(UserInvalidException r) {
            r.printStackTrace();
        } catch(UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
