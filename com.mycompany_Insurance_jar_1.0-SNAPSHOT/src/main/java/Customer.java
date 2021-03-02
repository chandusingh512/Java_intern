


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
     * @return the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the annualIncome
     */
    public double getAnnualIncome() {
        return annualIncome;
    }

    /**
     * @param annualIncome the annualIncome to set
     */
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     * @return the policyAttribute
     */
    public Policy getPolicyAttribute() {
        return policyAttribute;
    }

    /**
     * @param policyAttribute the policyAttribute to set
     */
    public void setPolicyAttribute(Policy policyAttribute) {
        this.policyAttribute = policyAttribute;
    }
}
