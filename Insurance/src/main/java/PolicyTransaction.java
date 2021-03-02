import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PolicyTransaction 
{
    
    Company company = new Company();
    
    public  void createCompany()
    {
        Address address = new Address();
        Contact contact = new Contact();
        
        
        company.setCompanyName(JOptionPane.showInputDialog("Please enter the name of the company: "));
        address.setAddressLine1(JOptionPane.showInputDialog("Please enter the address Line1: "));
        address.setAddressLine2(JOptionPane.showInputDialog("Address Line 2: "));
        address.setCity(JOptionPane.showInputDialog("Please enter City Name: "));
        address.setCountry(JOptionPane.showInputDialog("Please enter Country Name:  "));
        address.setPinCode(JOptionPane.showInputDialog("Please enter the pincode: "));
        contact.setPhoneNumber(JOptionPane.showInputDialog("Please enter the phone number: "));
        contact.setEmailAddress(JOptionPane.showInputDialog("Please enter the email address: "));
        
        company.setCompanyAddress(address);
        company.setCompanyDetails(contact);
        
    }


    public void createPolicy()
    {
        //ArrayList policy = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        Policy pol = new Policy();
        
        System.out.println("Enter the Following Details: ");
        
        System.out.println("Enter Policy Name: ");
        pol.setPolicyName(sc.nextLine());
        
        System.out.println("Enter Policy ID:");
        pol.setPolicyId(sc.nextInt());
        
        sc.nextLine();
        
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
        Address address = new Address();
        Contact contact = new Contact();
        System.out.println("Enter the following Customer Details: ");
        System.out.println("Enter Customer ID: ");
        cust.setCustomerId(sc.nextInt());
        
        sc.nextLine();
        
        System.out.println("Enter Customer Name: ");
        cust.setCustomerName(sc.nextLine());
        
        System.out.println("Enter Address Line1: ");
        address.setAddressLine1(sc.nextLine());
        
        System.out.println("Enter Address Line 2: ");
        address.setAddressLine2(sc.nextLine());
        
        System.out.println("Enter City: ");
        address.setCity(sc.nextLine());
        
        System.out.println("Enter Country: ");
        address.setCountry(sc.nextLine());
        
        System.out.println("Enter Pincode: ");
        address.setPinCode(sc.nextLine());
        
        System.out.println("Enter Email: ");
        contact.setEmailAddress(sc.nextLine());
        
        System.out.println("Enter Phone Number: ");
        contact.setPhoneNumber(sc.nextLine());
        
        System.out.println("Enter Occupation: ");
        cust.setOccupation(sc.nextLine());
        
        System.out.println("Enter Age: ");
        cust.setAge(sc.nextInt());
        
        sc.nextLine();
        
        System.out.println("Enter Gender: ");
        cust.setGender(sc.nextLine());
                
        System.out.println("Enter Annual Income: ");
        cust.setAnnualIncome(sc.nextDouble());
                
        cust.setAddress(address);
        cust.setContact(contact);
        
        company.customers.add(cust);
        
    }
   public void showPolicy()
    {
        //Policy pol = new Policy();
        System.out.println("List Of All Policies: ");
        for(Policy pol : company.policiesInForce)
        {
            System.out.println("Policy ID: "+pol.getPolicyId());
            System.out.println("Policy Name: "+pol.getPolicyName());
            System.out.println("Policy Premium: "+pol.getPolicyPremium());
            System.out.println("Policy Coverage: "+pol.getCoverage());
            System.out.println("Policy LaunchDate: "+pol.getLaunchDate());
            System.out.println("Policy Expiry Date: "+pol.getExpiryDate());
            System.out.println("Minimum Age of Offering: "+pol.getMinAgeOfOffering());
            System.out.println("Maximu Age of Offering: "+pol.getMaxAgeOfOffering());  
            System.out.println("\n\n");
        }
       /* Iterator<Policy>  it = company.policiesInForce.iterator();
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
        }*/
        
    }
   public void showCustomers()//Method to retrieve Customer Data for Policy assignement
    {
       for(Customer cust: company.customers)
       {
            System.out.println("Customer ID: "+cust.getCustomerId());
            System.out.println("Customer Name: "+cust.getCustomerName());
            System.out.println("Address : "+cust.getAddress().getAddressLine1());
            System.out.println("\t"+cust.getAddress().getAddressLine2());
            System.out.println("\t"+cust.getAddress().getCity());
            System.out.println("\t"+cust.getAddress().getCountry());
            System.out.println("\t"+cust.getAddress().getPinCode());
            System.out.println("Occupation: "+cust.getOccupation());
            System.out.println("Age: "+cust.getAge());
            System.out.println("Gender: "+cust.getGender());
            System.out.println("Annual Income: "+cust.getAnnualIncome());
            System.out.println("\n\n");
       }
        /*Iterator<Customer>  it = company.customers.iterator();
        while(it.hasNext())
        {
            
            System.out.println("Customer ID: "+(Integer)it.next().getCustomerId());
            System.out.println("Customer Name: "+(String)it.next().getCustomerName());
        }*/
      
    }
   public boolean assignPolicy()
    {
        //Customer cust = new Customer();
        int policyId,customerId;//Integer id for retrieving Customer Data
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the preffered Insurance ID from the List below with the number provided: ");
        showPolicy();
        policyId = sc.nextInt();
        System.out.println("PLease enter the Customer ID: ");
        showCustomers();
        customerId = sc.nextInt();
        //Iterator<Customer> it = company.customerPolicy.iterator();
        //Iterator<Policy> itr = company.getPoliciesInForce().iterator();
        //Iterator<Customer>iterator = company.getCustomers().iterator();
        Customer custCopy = new Customer();
        Policy polCopy = new Policy();
        for(Customer cust : company.customers)
        {
            if(cust.getCustomerId() == customerId)
            {
                custCopy = cust;
            }
        }
        for(Policy pol : company.policiesInForce)
        {
            if(pol.getPolicyId() == policyId)
            {
                polCopy = pol;
            }
        }
        custCopy.setPolicyAttribute(polCopy);
        company.customerPolicy.add(custCopy);
        
        return true;
    }
   public void deletePolicy()
    {
        System.out.println("Policy Deletion");
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the Customer ID: ");
        int customerId = sc.nextInt();
        
        Iterator<Customer> it = company.customerPolicy.iterator();
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
       // Iterator<Customer> it = company.customerPolicy.iterator();
        //while(it.hasNext())
        for( Customer cust : company.customerPolicy)
        {
            System.out.println("Customer ID: "+cust.getCustomerId());
            System.out.println("Customer Name: "+cust.getCustomerName());
            System.out.println("Policy ID: "+cust.getPolicyAttribute().getPolicyId());
            System.out.println("Policy Name: "+cust.getPolicyAttribute().getPolicyName());
        }
        
    }
    
}
