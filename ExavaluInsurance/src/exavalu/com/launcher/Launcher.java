package exavalu.com.launcher;
import exavalu.com.utilities.CustomerInputUtility;
import exavalu.com.beans.Customer;
import exavalu.com.services.CustomerServices;

/**
 *
 * @author PC
 */
public class Launcher 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        
   Customer customer= CustomerInputUtility.getCustomerInput();
    boolean successofcustomer=CustomerServices.addCustomer(customer);// adding user to database
    if(successofcustomer==true)
    {
        System.out.println("success");
    }
    else
    {
        System.out.println("not success");
    }
    /*boolean successofdeletecustomer=CustomerServices.deleteCustomer();// adding user to database
    boolean successofmodifycustomer=CustomerServices.modifyCustomer();
    
    CustomerServices.displayCustomer();
    
    Policy policy=PolicyInputUtility.getPolicyInput();
    boolean successofpolicy=PolicyServies.addPolicy(policy);
    
    Company company=CompanyInpputUtility.getCompanyInput();
    boolean successofcompany=CompanyServices.addCompany(company);
    
    */
    
    }
    
}
