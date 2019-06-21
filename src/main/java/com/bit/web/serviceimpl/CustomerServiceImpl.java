package com.bit.web.serviceimpl;

import java.util.List;

import com.bit.web.domain.CustomerDTO;

import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {


    @Override
    public void insertCustomer(CustomerDTO customer) {
        
    }

    @Override
    public List<CustomerDTO> findCustomers() {
        
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerBycustomerId(String customerId) {
        return null;
    }

    @Override
    public int updateCustomer(CustomerDTO customer) {
        int res = 1;
        
       
        return res;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
       
        
      
       
    }

    @Override
    public int countAll() {
        return 1;
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 ID :" + customer.getCustomerId());  //확인만하면 보안을위해 지움
        System.out.println("컨트롤러에서 넘어온 pwd :" + customer.getPassword());
        //CustomerDTO temp = customerMapper.login(customer);       
       // return temp;
       return null;
    }

 

    
}