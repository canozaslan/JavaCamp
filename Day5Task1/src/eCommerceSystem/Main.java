package eCommerceSystem;

import eCommerceSystem.business.concretes.RegisterManager;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.core.concretes.EmailManager;
import eCommerceSystem.core.concretes.GoogleRegisterManagerAdapter;
import eCommerceSystem.core.concretes.UserCheckManager;
import eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleRegister.GoogleRegisterManager;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new RegisterManager(new UserCheckManager(), new EmailManager()));

		UserManager googleUserManager = new UserManager(new HibernateUserDao(), new GoogleRegisterManagerAdapter(new GoogleRegisterManager()));
		
		User user = new User(1, "Ahmet Can", "Özaslan", "ahmetcanozaslan@gmail.com", "123456");
		
		userManager.register(user);
		
		
		System.out.println("*********************************");
		
		userManager.login(user.getEmail(), user.getPassword());
		
		System.out.println("*********************************");
		
		User user2 = new User(2, "Eda", "Ölçer", "ahmetcanozaslan@gmail.com", "123123");
		
		userManager.register(user2);
		
		System.out.println("*********************************");
		
		googleUserManager.register(user);
		
	}

}
