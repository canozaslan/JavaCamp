package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> userList = new ArrayList<User>();
	
	@Override
	public void addNewUser(User user) {
		userList.add(user);
		System.out.println("Hibernate ile kaydedildi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public User get(String email, String password) {
		for(User user : userList) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Ýlgili kullanýcý veritabanýnda bulundu.");
				return user;
			}
		}
		System.out.println("Böyle bir kullanýcý bulunamadý.");
		return null;
	}

	@Override
	public List<User> getAll() {
		return userList;
	}

}
