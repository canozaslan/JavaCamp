package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.RegisterService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private RegisterService registerService;
	
	public UserManager(UserDao userDao, RegisterService registerService) {
		this.userDao = userDao;
		this.registerService = registerService;
	}

	@Override
	public void register(User user) {
		
		if(registerService.Register(user, userDao.getAll())) {
			this.userDao.addNewUser(user);
			
			System.out.println("Kayd�n�z ba�ar�yla ger�ekle�tirildi. Kullan�c� Bilgisi : " + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Kay�t i�lemi ba�ar�s�z oldu.");
		}
		
	}

	@Override
	public boolean login(String email, String password) {
		if(this.userDao.get(email, password) != null) {
			System.out.println("Giri� Ba�ar�l�. Ho�geldiniz.");
			return true;
		}
		else {
			System.out.println("Hatal� giri�. Tekrar deneyiniz.");
			return false;
		}
	}

}
