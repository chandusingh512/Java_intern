package exavalu.com.beans;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Company {

    private String companyName;
    private Address companyAddress;
    private Contact companyDetails;

    /*    ArrayList<Customer> customers = new ArrayList();
    ArrayList<Policy> policiesInForce = new ArrayList();
   ArrayList<Customer> customerPolicy = new ArrayList();
     */
    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the companyAddress
     */
    public Address getCompanyAddress() {

        return companyAddress;
    }

    /**
     * @param companyAddress the companyAddress to set
     */
    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * @return the companyDetails
     */
    public Contact getCompanyDetails() {
        return companyDetails;
    }

    /**
     * @param companyDetails the companyDetails to set
     */
    public void setCompanyDetails(Contact companyDetails) {
        this.companyDetails = companyDetails;
    }
}
