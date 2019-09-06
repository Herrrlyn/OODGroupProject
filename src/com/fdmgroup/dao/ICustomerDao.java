package com.fdmgroup.dao;

import com.fdmgroup.model.Customer;

public interface ICustomerDao extends IStorage<Customer>, IEditable<Customer>, IRemovable<Customer> {
	public Customer findCustomerById(int userId);
}
