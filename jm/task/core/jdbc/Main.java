package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();


        userService.saveUser("Dan", "Fox", (byte) 35);
        System.out.println("User Dan created");

        userService.saveUser("Fedor", "Vin", (byte) 26);
        System.out.println("User Fedor created");

        userService.saveUser("Sally", "Geo", (byte) 29);
        System.out.println("User Sally created");

        userService.saveUser("Vivian", "Finch", (byte) 61);
        System.out.println("User Vivian created");


        userService.cleanUsersTable();
        System.out.println("Cleaned all users");

        userService.dropUsersTable();
        System.out.println("Dropped all users");

        }
    }


