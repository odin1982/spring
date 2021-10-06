package spring.pag078.componentscan.filter.component.include.services;

import org.springframework.beans.factory.annotation.Autowired;

import spring.pag078.componentscan.filter.component.include.dao.CustomerDAO;

public class CustomerService {
	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
	
}
