package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserDao {
	void addNewUser(User user);
	User get(String email, String password);
	List<User> getAll();
}
