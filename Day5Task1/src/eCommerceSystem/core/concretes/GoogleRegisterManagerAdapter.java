package eCommerceSystem.core.concretes;

import java.util.List;

import eCommerceSystem.business.abstracts.RegisterService;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegisterService {

	private GoogleRegisterManager googleRegisterManager;
	
	public GoogleRegisterManagerAdapter(GoogleRegisterManager googleRegisterManager) {
		super();
		this.googleRegisterManager = googleRegisterManager;
	}

	@Override
	public boolean Register(User user, List<User> userList) {
		
		return this.googleRegisterManager.registerWithGoogle();
		
	}

}
