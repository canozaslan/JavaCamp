package eCommerceSystem.business.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface RegisterService {
	boolean Register(User user, List<User> userList);
}
