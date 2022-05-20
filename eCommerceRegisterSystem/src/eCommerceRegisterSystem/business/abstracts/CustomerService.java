package eCommerceRegisterSystem.business.abstracts;

import eCommerceRegisterSystem.entities.concretes.Customer;

public interface CustomerService {

	public void signUp(Customer customer);
	public void logIn(Customer customer);
}
