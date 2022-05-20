package eCommerceRegisterSystem.business.abstracts;

import eCommerceRegisterSystem.entities.concretes.Customer;

public interface VerifyService {
	
	void eMailVerification(Customer customer);
	boolean isVerified(Customer customer);
}
