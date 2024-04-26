package peaksoft;

import org.hibernate.Session;
import org.hibernate.Transaction;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceHibernateImpl;
import peaksoft.service.UserServiceJdbcImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
//          Session session = HibernateConfig.getSession().openSession();
//         Transaction transaction = session.beginTransaction();
//         transaction.commit();
//         session.close();

         UserService userServiceHibernate = new UserServiceHibernateImpl();
//         userServiceHibernate.saveUser("Ali", "Kaldarbekov", (byte) 21);
//         System.out.println(userServiceHibernate.getAllUsers());
//         userServiceHibernate.removeUserById(1L);
//         userServiceHibernate.dropUsersTable();
//        userServiceHibernate.cleanUsersTable();




            UserService userService = new UserServiceJdbcImpl();
//        System.out.println("Create table: ");
//        userService.createUsersTable();
//
//         userService.saveUser("Ali","Kaldarbekov", (byte) 21);
//        userService.saveUser("Suke","Tologonuulu", (byte) 20);

        // System.out.println(userServiceJbdc.getAllUsers());

        // userServiceJbdc.removeUserById(1L);

        // userServiceJbdc.dropUsersTable();

        // userServiceJbdc.cleanUsersTable();

    }
}
