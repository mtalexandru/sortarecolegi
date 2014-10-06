/**
 * 
 */
package spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Customer;

/**
 * @author mariusa
 *
 */
public interface CustomerDAO {
 

    public SessionFactory getSessionFactory();

    public void setSessionFactory(SessionFactory sessionFactory);

    public void addCustomer(Customer customer);

    public void deleteCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public Customer getCustomerById(int id);

    public List<Customer> getCustomers();
 
}
