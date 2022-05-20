package eCommerceRegisterSystem.business.concretes;

import eCommerceRegisterSystem.business.abstracts.CheckCustomer;
import eCommerceRegisterSystem.business.abstracts.CustomerService;
import eCommerceRegisterSystem.business.abstracts.VerifyService;
import eCommerceRegisterSystem.dataAccess.abstracts.CustomerDao;
import eCommerceRegisterSystem.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	VerifyService verifyService;
	CheckCustomer checkCustomer;
	CustomerDao customerDao;

	public CustomerManager(CustomerDao customerDao, VerifyService verifyService, CheckCustomer checkCustomer) {

		this.customerDao = customerDao;
		this.verifyService = verifyService;
		this.checkCustomer = checkCustomer;
	}

	@Override
	public void signUp(Customer customer) {

		if (checkCustomer.firstNameCheck(customer) == true && checkCustomer.lastNameCheck(customer) == true
				&& checkCustomer.eMailCheck(customer) == true && checkCustomer.passwordCheck(customer) == true
				&& checkCustomer.isUsedEMail(customer) == false) {
			System.out.println("This user is valid.");
		} else {
			System.out.println("This user is invalid.");
		}
	}

	@Override
	public void logIn(Customer customer) {

		if (customer.geteMail() != null && customer.getPassword() != null) {
			if (checkCustomer.trueEMailPassword(customer) == true) {
				System.out.println("Login successfully.");
			} else {
				System.out.println("Login unsuccessfully. Wrong password or e-mail!");
			}
		}
	}

}
