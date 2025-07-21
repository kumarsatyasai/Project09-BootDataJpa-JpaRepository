package com.nt.service;

import java.util.List; 

import com.nt.entity.Customer;

public interface ICustomerMgmtService {
	
	public String deleteCustomersByIdsInBatch(List<Integer> ids);
	
	public List<Customer> showCustomersByExamplesData(Customer cust, boolean flag, String ...properties);
	
	public Customer showCustomerById(int cno);
	

}
