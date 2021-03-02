import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class PolicyTransaction 
{
    
    Company company = new Company();
    
    public  void createCompany()
    {
        Address address = new Address();
        Contact contact = new Contact();
        Scanner sc = new Scanner(System.in);
        
        Company company = new Company();
        System.out.println("PLease enter the name of the company: ");
        company.setCompanyName(sc.nextLine());
        
        System.out.println("PLease enter the address Line1: ");
        address.setAddressLine1(sc.nextLine());
        
        System.out.println("Address Line 2: ");
        address.setAddressLine2(sc.nextLine());
        
        System.out.println("Please enter City Name: ");
        address.setCity(sc.nextLine());
        
        System.out.println("Enter Country: ");
        address.setCountry(sc.nextLine());
        
        System.out.println("Enter Pincode:");
        address.setPinCode(sc.nextLine());
        
        System.out.println("PLease enter the email address: ");
        contact.setEmailAddress(sc.nextLine());
        
        System.out.println("Entet the Phone Number: ");
        contact.setPhoneNumber(sc.nextLine());
        
        company.setCompanyAddress(address);
        company.setCompanyDetails(contact);
        
    }


    public void createPolicy()
    {
        //ArrayList policy = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        Policy pol = new Policy();
        
        System.out.println("Enter the Following Details: ");
        
        System.out.println("Enter Policy ID:");
        pol.setPolicyId(sc.nextInt());
        
        System.out.println("Enter Policy Name: ");
        pol.setPolicyName(sc.nextLine());
        
        System.out.println("Enter Policy Launch Date: ");
        pol.setLaunchDate(sc.nextLine());
        
        System.out.println("Enter Policy Expiry Date: ");
        pol.setExpiryDate(sc.nextLine());
        
        System.out.println("Enter Policy Premium: ");
        pol.setPolicyPremium(sc.nextDouble());
        
        System.out.println("Enter Coverage: ");
        pol.setCoverage(sc.nextDouble());
        
        System.out.println("Enter Minimum Age of Offering: ");
        pol.setMinAgeOfOffering(sc.nextInt());
        
        System.out.println("Enter Maximum Age of Offering: ");
        pol.setMaxAgeOfOffering(sc.nextInt());
        company.policiesInForce.add(pol);
        //policy.add(pol);
        //return policy;
        
    }
    public void newCustomer()
    {
        Scanner sc = new Scanner(System.in);
        Customer cust = new Customer();
        
        System.out.println("Enter the following Customer Details: ");
        System.out.println("Enter Customer ID: ");
        cust.setCustomerId(sc.nextInt());
        
        System.out.println("Enter Customer Name: ");
        cust.setCustomerName(sc.nextLine());
        
        System.out.println("Enter Address Line1: ");
        cust.address.setAddressLine1(sc.nextLine());
        
        System.out.println("Enter Address Line 2: ");
        cust.address.setAddressLine2(sc.nextLine());
        
        System.out.println("Enter City: ");
        cust.address.setCity(sc.nextLine());
        
        System.out.println("Enter Country: ");
        cust.address.setCountry(sc.nextLine());
        
        System.out.println("Enter Pincode: ");
        cust.address.setPinCode(sc.nextLine());
        
        System.out.println("Enter Email: ");
        cust.getContact().setEmailAddress(sc.nextLine());
        
        System.out.println("Enter Phone Number: ");
        cust.getContact().setPhoneNumber(sc.nextLine());
        
        company.customers.add(cust);
        
    }
   public void showPolicy()
    {
        //Policy pol = new Policy();
        /*for(Policy pol : company.policiesInForce)
        {
            System.out.println("Policy ID: "+pol.getPolicyId());
            System.out.println("Policy Name: "+pol.getPolicyName());
            System.out.println("Policy Premium: "+pol.getPolicyPremium());
            System.out.println("Policy Coverage: "+pol.getCoverage());
            System.out.println("Policy LaunchDate: "+pol.getLaunchDate());
            System.out.println("Policy Expiry Date: "+pol.getExpiryDate());
            System.out.println("Minimum Age of Offering: "+pol.getMinAgeOfOffering());
            System.out.println("Maximu Age of Offering: "+pol.getMaxAgeOfOffering());      
        }*/
        Iterator<Policy>  it = company.getPoliciesInForce().iterator();
        while(it.hasNext())
        {
            
            System.out.println("Policy Name: "+(String)it.next().getPolicyName());
            System.out.println("Policy ID: "+(Integer)it.next().getPolicyId());
            System.out.println("Policy Premium: "+(Double)it.next().getPolicyPremium());
            System.out.println("Coverage: "+(Double)it.next().getCoverage());
            System.out.println("Launch Date: "+(String)it.next().getLaunchDate());
            System.out.println("Expiry Date: "+(String)it.next().getLaunchDate());
            System.out.println("Minimum Age of Offering: "+(Integer)it.next().getMinAgeOfOffering());
            System.out.println("Maximum Age of Offering: "+(Integer)it.next().getMaxAgeOfOffering());
        }
        
    }
   public void showCustomers()//Method to retrieve Customer Data for Policy assignement
    {
        Iterator<Customer>  it = company.getCustomers().iterator();
        while(it.hasNext())
        {
            
            System.out.println("Customer ID: "+(Integer)it.next().getCustomerId());
            System.out.println("Customer Name: "+(String)it.next().getCustomerName());
        }
      
    }
   public boolean assignPolicy()
    {
        //Customer cust = new Customer();
        int policyId,customerId,policyIndex,customerIndex;//Integer id for retrieving Customer Data
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the preffered Insurance ID from the List below with the number provided: ");
        showPolicy();
        policyId = sc.nextInt();
        System.out.println("PLease enter the Customer ID: ");
        showCustomers();
        customerId = sc.nextInt();
        
        Iterator<Customer> it = company.getCustomerPolicy().iterator();
        //Iterator<Policy> itr = company.getPoliciesInForce().iterator();
        //Iterator<Customer>iterator = company.getCustomers().iterator();
        
        customerIndex = company.getCustomers().indexOf(customerId);
        policyIndex = company.getPoliciesInForce().indexOf(policyId);
        while(it.hasNext())
        {
            if((Integer)it.next().getCustomerId() == customerId)
            {
                it.next().setPolicyAttribute((Policy)company.getPoliciesInForce().get(policyIndex));
            }
        }
        //company.customers.contains(customerId);
        
        return true;
    }
   public void deletePolicy()
    {
        System.out.println("Policy Deletion");
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the Customer ID: ");
        int customerId = sc.nextInt();
        
        Iterator<Customer> it = company.getCustomerPolicy().iterator();
        while(it.hasNext())
        {
            if((Integer) it.next().getCustomerId() == customerId)
            {
                it.remove();
            }
        }
    }
    public  void showCustomerPolicy()
    {
        Iterator<Customer> it = company.getCustomerPolicy().iterator();
        while(it.hasNext())
        {
            System.out.println("Customer ID: "+(Integer)it.next().getCustomerId());
            System.out.println("Customer Name: "+(String)it.next().getCustomerName());
            System.out.println("Policy ID: "+(Integer)it.next().getPolicyAttribute().getPolicyId());
            System.out.println("Policy Name: "+(String)it.next().getPolicyAttribute().getPolicyName());
        }
        
    }
    
}