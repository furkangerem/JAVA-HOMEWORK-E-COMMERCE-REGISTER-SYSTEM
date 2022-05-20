package eCommerceRegisterSystem.dataAccess.abstracts;

import eCommerceRegisterSystem.entities.concretes.Customer;

public interface CustomerDao {

	public void insert(Customer customer);
	public void update(Customer customer);
	public void delete(Customer customer);
}
