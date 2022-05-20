package eCommerceRegisterSystem.dataAccess.concretes;

import eCommerceRegisterSystem.dataAccess.abstracts.CustomerDao;
import eCommerceRegisterSystem.entities.concretes.Customer;

public class HibernateDao implements CustomerDao {

	@Override
	public void insert(Customer customer) {

		System.out.println(customer.getFirstName() + " is registered!");
	}

	@Override
	public void update(Customer customer) {

		System.out.println(customer.getFirstName() + " is updated!");
	}

	@Override
	public void delete(Customer customer) {

		System.out.println(customer.getFirstName() + " is deleted!");
	}

}
