/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.utilities;

import exavalu.com.beans.Address;
import exavalu.com.beans.Company;
import exavalu.com.beans.Contact;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class CompanyInpputUtility {

    /**
     *
     * @return
     */
    public static Company getCompanyInput() {
        Company company = new Company();
        Address address = new Address();
        Contact contact = new Contact();
        company.setCompanyName(JOptionPane.showInputDialog("Enter the name of the company"));
        address.setAddressLine1((JOptionPane.showInputDialog("Enter the addressline1 of the company: ")));
        address.setAddressLine2((JOptionPane.showInputDialog("Enter the addressline2 of the company: ")));
        address.setCity(JOptionPane.showInputDialog("Enter the City of the company: "));
        address.setCountry(JOptionPane.showInputDialog("Enter the country of the company: "));
        address.setPinCode(JOptionPane.showInputDialog("Enter the pincode of the company: "));
        contact.setPhoneNumber(JOptionPane.showInputDialog("Enter the phone number of the company: "));
        contact.setEmailAddress(JOptionPane.showInputDialog("Enter the email of the company: "));
        company.setCompanyAddress(address);
        company.setCompanyDetails(contact);

        return company;

    }

}
