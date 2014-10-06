/**
 * 
 */
package managedController;

/**
 * @author mariusa
 *
 */

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.apache.log4j.Logger;
/*
import com.mtalexandru.model.Customer;
import com.mtalexandru.dao.CustomerDAO;
import com.mtalexandru.service.ICustomerService;
 
*/
@ManagedBean
public class OrderListView {
	/*
	
	static Logger log = Logger.getLogger(
            CustomerDAO.class.getName());
	
	
	@ManagedProperty(value="#{CustomerService}")
	ICustomerService personService;
     
    private List<String> cities;
    private List<Customer> persons;
     
    @PostConstruct
    public void init() {
    	
        //Cities
        cities = new ArrayList<String>();
        cities.add("San Francisco");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
              
        //Themes
        persons = new ArrayList<Customer>();
        persons.addAll(personService.getCustomers());
        log.info("Am initializat lista de Utilizatori: " + persons.size());
    }
 
   
 
    public ICustomerService getCustomerService() {
		return personService;
	}



	public void setCustomerService(ICustomerService personService) {
		this.personService = personService;
	}



	public List<String> getCities() {
        return cities;
    }
 
    public void setCities(List<String> cities) {
        this.cities = cities;
    }
 
    public List<Customer> getCustomers() {
        return persons;
    }
 
    public void setThemes(List<Customer> persons) {
        this.persons = persons;
    }    */
}
