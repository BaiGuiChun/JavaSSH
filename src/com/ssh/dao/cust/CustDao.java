package com.ssh.dao.cust;

import com.ssh.model.Customer;

import java.util.List;

public interface CustDao {
    int findCount();

    List<Customer> findByPage(int begin, int pageSize);

    void save(Customer customer);

    Customer findById(int custId);

    void update(Customer customer);

    void delete(Customer customer);
}
