package com.ssh.service.cust;

import com.ssh.model.Customer;
import com.ssh.util.PageBean;

public interface CustService {
    PageBean<Customer> findByPage(Integer currPage);

    void save(Customer customer);

    Customer findById(int custId);

    void update(Customer customer);

    void delete(Customer customer);
}
