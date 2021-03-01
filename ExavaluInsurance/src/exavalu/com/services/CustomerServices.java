package exavalu.com.services;

import exavalu.com.beans.Customer;
import exavalu.com.utilities.ConnectionProviderToDB;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author PC
 */

public class CustomerServices {

    Customer customer = new Customer();

    /**
     *
     * @param customer
     * @return
     */
    public static boolean addCustomer(Customer customer) 
    { //data putting into the database
        Connection connection = ConnectionProviderToDB.getConnectionObject().getConnection();
        PreparedStatement stmt;
//step3 create the statement object 
    try {
            stmt = connection.prepareStatement("INSERT INTO customers (customer_name,customer_age,customer_address,customerscontact,customersoccupation,customersgender,customersanualincome,customerpolicy) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, customer.getCustomerName());
            stmt.setInt(2, customer.getAge());
            stmt.setNull(3, 0);
            stmt.setNull(4, 0);
            stmt.setString(5, customer.getOccupation());
          stmt.setString(6, customer.getGender());
            stmt.setDouble(7, customer.getAnnualIncome());
     //       stmt.setInt(7, customer.getPolicyAttribute());
            stmt.setNull(8, 0);
            int i=stmt.executeUpdate();  
            System.out.println(i+" records inserted");  
            
        }catch (SQLException e)
        {
            System.err.println(e);
        }
        return true;

    }
    
    /**
     *
     * @return
     */
    public static boolean deleteCustomer() {
        return true;
    }

    /**
     *
     * @param id
     * @return
     */
    public static boolean modifyCustomer(int id) {
        return true;
    }

    /**
     *
     */
    public static void displayCustomer() {
    }

}
