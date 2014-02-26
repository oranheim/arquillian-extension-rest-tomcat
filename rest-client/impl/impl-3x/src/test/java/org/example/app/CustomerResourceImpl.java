package org.example.app;

import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ora on 26.02.14.
 */
public class CustomerResourceImpl implements CustomerResource {

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<Customer>();
    }

    @Override
    public Customer getByName(@PathParam("name")String name) {
        return new Customer(name);
    }

    @Override
    public Customer getById(@PathParam("id") String id) {
        return new Customer("Bill");
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return new Customer("foo");
    }
}
