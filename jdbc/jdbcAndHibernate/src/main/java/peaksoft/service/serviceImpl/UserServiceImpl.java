package peaksoft.service.serviceImpl;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDaoJdbc = new UserDaoJdbcImpl();
    UserDao userDaoHibernate = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        userDaoJdbc.createUsersTable();
//        userDaoHibernate.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        userDaoJdbc.dropUsersTable();
//        userDaoHibernate.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDaoJdbc.saveUser(name, lastName, age);
//        userDaoHibernate.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        userDaoJdbc.removeUserById(id);
//        userDaoHibernate.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoJdbc.getAllUsers();
//        return userDaoHibernate.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDaoJdbc.cleanUsersTable();
//        userDaoHibernate.cleanUsersTable();
    }
}
