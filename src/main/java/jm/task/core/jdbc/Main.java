package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Petrov", (byte) 23);
        userService.saveUser("Arnold", "Raymond", (byte) 31);
        userService.saveUser("Sergei", "Shiman", (byte) 28);
        userService.saveUser("Alisa", "Ruduk", (byte) 21);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
