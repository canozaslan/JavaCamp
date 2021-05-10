package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface UserService {
	void register(User user);
	boolean login(String email, String password);
}
