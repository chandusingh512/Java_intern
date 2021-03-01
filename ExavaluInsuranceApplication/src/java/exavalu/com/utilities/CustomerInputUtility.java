package exavalu.com.utilities;

import exavalu.com.beans.Address;
import exavalu.com.beans.Customer;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class CustomerInputUtility {

    /**
     *
     * @return
     */
    public static Customer getCustomerInput() {
        Customer customer = new Customer();
        Address address = new Address();
        //data taken from user input
        customer.setCustomerName(JOptionPane.showInputDialog("Enter the name of the customer: "));
        customer.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter the age of the customer: ")));
        customer.setOccupation(JOptionPane.showInputDialog("Enter the occupation of the customer: "));
        customer.setGender(JOptionPane.showInputDialog("Enter the gender of the customer: "));
        customer.setAnnualIncome(Integer.parseInt(JOptionPane.showInputDialog("Enter the anual income  of the customer: ")));
  //      address.setAddressLine1((JOptionPane.showInputDialog("Enter the addressline1 of the customer: ")));
    //    address.setAddressLine2((JOptionPane.showInputDialog("Enter the addressline2 of the customer: ")));
   //     address.setCity(JOptionPane.showInputDialog("Enter the City of the customer: "));
   //     address.setCountry(JOptionPane.showInputDialog("Enter the country of the customer: "));
   //     address.setPinCode(JOptionPane.showInputDialog("Enter the pincode of the customer: "));
        
     //   customer.setAddress(address);
        return customer;

    }
}
