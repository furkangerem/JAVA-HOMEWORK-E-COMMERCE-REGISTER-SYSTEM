package eCommerceRegisterSystem.business.concretes;

import eCommerceRegisterSystem.business.abstracts.VerifyService;
import eCommerceRegisterSystem.entities.concretes.Customer;

public class VerifyManager implements VerifyService {

	@Override
	public void eMailVerification(Customer customer) {
		
		System.out.println("Verification e-mail is sent to: " + customer.geteMail());
	}

	@Override
	public boolean isVerified(Customer customer) {
		
		System.out.println("E-mail is verified.");
		return true;
	}

}
