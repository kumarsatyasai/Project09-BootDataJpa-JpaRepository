package com.nt.service;

import java.util.List;      

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;
 
@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	
	@Autowired
	private ICustomerRepository custRepo;

	@Override
	public String deleteCustomersByIdsInBatch(List<Integer> ids) {

		custRepo.deleteAllByIdInBatch(ids);//1........................................................
		return ids.toString()+" Customer Records Are Deleted.";
	}

	@Override
	public List<Customer> showCustomersByExamplesData(Customer cust, boolean flag, String ...properties) {

		Example<Customer> example = Example.of(cust);
		Sort sort = Sort.by(flag?Direction.ASC:Direction.DESC, properties);
		List<Customer> list = custRepo.findAll(example, sort);//2..........................................
		return list;
	}

	@Override
	public Customer showCustomerById(int cno) {

		Customer cust = custRepo.getReferenceById(cno);//3............................................. 
		return cust;
	}

	
	
}
