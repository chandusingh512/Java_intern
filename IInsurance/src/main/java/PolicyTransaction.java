
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class PolicyTransaction 
{
    Company company = new Company();
     Customer cs=new Customer();


void createCompany()
 {      
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
    
        void createCustomer()
    {
       
     cs.setCustomerName(JOptionPane.showInputDialog("Enter customer name:"));
     cs.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter customer age:")));
     cs.setCustomerId(Integer.parseInt(JOptionPane.showInputDialog("Enter customer id:")));
    
   /*  cs.address.setAddressline1(JOptionPane.showInputDialog("Enter customer address1:"));
     cs.address.setAddressline2(JOptionPane.showInputDialog("Enter customer address2:"));
     cs.address.setCity(JOptionPane.showInputDialog("Enter customer city:"));
     cs.address.setCountry(JOptionPane.showInputDialog("Enter customer country:"));
     cs.address.setPincode(JOptionPane.showInputDialog("Enter customer pincode:"));
     cs.address.setState(JOptionPane.showInputDialog("Enter customer state:"));
     cs.setGender(JOptionPane.showInputDialog("Enter customer gender:"));
     cs.setOccupation(JOptionPane.showInputDialog("Enter customer gender:"));
     cs.setAnualincome(Integer.parseInt(JOptionPane.showInputDialog("Enter customer anual income:")));
     cs.contactDetails.setPhoneNumber(JOptionPane.showInputDialog("Enter customer phone number:"));
     cs.contactDetails.setEmailAddress(JOptionPane.showInputDialog("Enter customer email address :"));
    */ 
     com.customer.add(cs);
     
    
    }    
        
    void createPolicy()
   {  Policy pol=new Policy();

       pol.setCoverageAmount(Integer.parseInt(JOptionPane.showInputDialog("Enter policy coverage amount:")));
       pol.setExpiryDate(JOptionPane.showInputDialog("Enter policy expiry date:"));
       pol.setLaunchDate(JOptionPane.showInputDialog("Enter policy launch date:"));
       pol.setMinAgeOfOffering(Integer.parseInt(JOptionPane.showInputDialog("Enter policy minimum age offering:")));
       pol.setMaxAgeOfOffering(Integer.parseInt(JOptionPane.showInputDialog("Enter policy maximum age offering:")));
       pol.setPolicyName(JOptionPane.showInputDialog("Enter policy name:"));
       pol.setPolicyid(Integer.parseInt(JOptionPane.showInputDialog("Enter policy id:")));
       pol.setPremiumAmount(Integer.parseInt(JOptionPane.showInputDialog("Enter policy premium :")));
        
       com.policiesinForce.add(pol);
   }      
   public void showCustomer()
   {
           Customer cs=new Customer();
           ArrayList<Customer> cv=com.customer;
           cv.forEach(cvv ->
                   {
                     System.out.println("Customer address: "+cs.getAddress());  
                   }  
           );
           
     
             
   }
   public void  showPolicy()
   {       
       Policy pol=new Policy();
   
       ArrayList<Policy> var =com.policiesinForce;
      
      var.forEach(poly ->{
      System.out.println("policy id:"+pol.getPolicyid());
      System.out.println("policy name:"+pol.getPolicyName());
      System.out.println("policy launchdate:"+pol.getLaunchDate());
      System.out.println("policy expirydate:"+pol.getExpiryDate());
      System.out.println("policy premiumAccount:"+pol.getPremiumAmount());
      System.out.println("policy coverage:"+pol.getCoverageAmount());
      System.out.println("policy minage:"+pol.getMinAgeOfOffering());
      System.out.println("policy maxage:"+pol.getMaxAgeOfOffering());
     
      }
      );
              }
  
      
/* 
  void assignPolicy()
{
   
}
void deltePolicy()
{
    
}    
void showCustomerPolicy()
{
    
}*/
}