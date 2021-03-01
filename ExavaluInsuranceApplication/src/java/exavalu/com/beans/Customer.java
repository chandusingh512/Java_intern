package exavalu.com.beans;

/**
 *
 * @author PC
 */
public class Customer 
{
    private int customerId;
    private String customerName;
    private Address address;
    private Contact contact;
    private String occupation;
    private int age;
    private String gender;
    private double annualIncome;
    private Policy policyAttribute;

    /**
     *
     * @return
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     *
     * @param customerId
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     *
     * @return
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     *
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public Contact getContact() {
        return contact;
    }

    /**
     *
     * @param contact
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     *
     * @return
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     *
     * @param occupation
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public double getAnnualIncome() {
        return annualIncome;
    }

    /**
     *
     * @param annualIncome
     */
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     *
     * @return
     */
    public Policy getPolicyAttribute() {
        return policyAttribute;
    }

    /**
     *
     * @param policyAttribute
     */
    public void setPolicyAttribute(Policy policyAttribute) {
        this.policyAttribute = policyAttribute;
    }

    /**
     * @return the customerId
     */
    
}
