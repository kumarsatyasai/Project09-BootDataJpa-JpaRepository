package com.nt.runners;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class JpaRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private ICustomerMgmtService custService;

	@Override
	public void run(String... args) throws Exception {

		try 
		{
			
			//String message = custService.deleteCustomersByIdsInBatch(List.of(2, 5, 9));
			//System.out.println(message);
			Customer cust = new Customer();
			cust.setName("Ram");
			cust.setCadd("Ayodhya");
			List<Customer> list = custService.showCustomersByExamplesData(cust, true, "billAmt");
			list.forEach(System.out::println);
			Customer customer = custService.showCustomerById(6);
			System.out.println(customer);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
