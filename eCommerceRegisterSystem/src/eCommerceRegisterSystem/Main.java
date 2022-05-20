package eCommerceRegisterSystem;

import eCommerceRegisterSystem.business.concretes.CustomerManager;
import eCommerceRegisterSystem.business.concretes.CheckCustomerManager;
import eCommerceRegisterSystem.business.concretes.VerifyManager;
import eCommerceRegisterSystem.dataAccess.concretes.HibernateDao;
import eCommerceRegisterSystem.entities.concretes.Customer;
import eCommerceRegisterSystem.google.GoogleManager;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer("Furkan", "GEREM", "furkangerem@hotmail.com", "strongPassword");
		CustomerManager customerManager = new CustomerManager(new HibernateDao(), new VerifyManager(),
				new CheckCustomerManager());
		GoogleManager googleManager = new GoogleManager();
		customerManager.signUp(customer);
		googleManager.signUp();
		customerManager.logIn(customer);
	}

}
