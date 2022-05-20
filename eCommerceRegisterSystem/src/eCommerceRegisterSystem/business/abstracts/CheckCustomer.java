package eCommerceRegisterSystem.business.abstracts;

import eCommerceRegisterSystem.entities.concretes.Customer;

public interface CheckCustomer {

	boolean firstNameCheck(Customer customer);
	boolean lastNameCheck(Customer customer);
	boolean eMailCheck(Customer customer);
	boolean passwordCheck(Customer customer);
	boolean isUsedEMail(Customer customer);
	boolean trueEMailPassword(Customer customer);
}
