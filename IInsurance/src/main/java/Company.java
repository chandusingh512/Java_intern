
import java.util.ArrayList;

public class Company
{
private String companyName;
 Address address;
 ContactDetails contactDetails;
ArrayList <Customer> customer=new ArrayList();
ArrayList <Policy> policiesinForce=new ArrayList();
ArrayList customerPolicy = new ArrayList();


    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }





}

