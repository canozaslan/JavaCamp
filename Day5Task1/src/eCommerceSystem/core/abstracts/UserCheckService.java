package eCommerceSystem.core.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserCheckService {
	boolean checkPassword(String password);
	boolean checkEmailAddress(String email, List<User> userList);
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
}
