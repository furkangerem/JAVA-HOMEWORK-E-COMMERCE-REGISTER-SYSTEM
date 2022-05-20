package eCommerceRegisterSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceRegisterSystem.business.abstracts.CheckCustomer;
import eCommerceRegisterSystem.entities.concretes.Customer;

public class CheckCustomerManager implements CheckCustomer {

	String regex = "^(.+)@(.+)$";

	@Override
	public boolean firstNameCheck(Customer customer) {

		if (customer.getFirstName().length() <= 1) {
			System.out.println("Name can't be a character.");
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(Customer customer) {

		if (customer.getLastName().length() <= 2) {
			System.out.println("Lastname can't be two characters.");
		}
		return true;
	}

	@Override
	public boolean eMailCheck(Customer customer) {

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(customer.geteMail());

		return matcher.matches();
	}

	@Override
	public boolean passwordCheck(Customer customer) {

		if (customer.getPassword().length() <= 6) {
			System.out.println("Password must be long than 6 characters.");
		}
		return true;
	}

	@Override
	public boolean isUsedEMail(Customer customer) {

		return false;
	}

	@Override
	public boolean trueEMailPassword(Customer customer) {

		return false;
	}

}
