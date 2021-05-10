package eCommerceSystem.business.concretes;

import java.util.List;

import eCommerceSystem.business.abstracts.RegisterService;
import eCommerceSystem.core.abstracts.EmailService;
import eCommerceSystem.core.abstracts.UserCheckService;
import eCommerceSystem.entities.concretes.User;

public class RegisterManager implements RegisterService {

	private UserCheckService userCheckService;
	private EmailService emailService;
	
	
	public RegisterManager(UserCheckService userCheckService, EmailService emailService) {
		super();
		this.userCheckService = userCheckService;
		this.emailService = emailService;
	}


	@Override
	public boolean Register(User user, List<User> userList) {
		if(userCheckService.checkFirstName(user.getFirstName()) && userCheckService.checkLastName(user.getLastName())
				&& userCheckService.checkPassword(user.getPassword()) && userCheckService.checkEmailAddress(user.getEmail(), userList)) {
			System.out.println("Bilgiler geçerli.");
			
			emailService.sendEmail();
			emailService.verifyUser();
			
			return true;
		}
		System.out.println("Bilgilerinizi tekrar giriniz.");
		return false;

	}

}
