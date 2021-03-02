import java.util.Scanner;
import javax.swing.JOptionPane;
public class MainLauncher  
{
    
    public static void main(String[] args) 
    {
        PolicyTransaction obj = new PolicyTransaction();
        int choice;
       while(true)
       {
        choice=Integer.parseInt(JOptionPane.showInputDialog("PLease Enter Numeric Value From The Menu \n "
                + "1.Create Company: \n "
                + "2.Create Policy: \n"
                + "3.New Customer: \n"
                + "4.Show Policies: \n"
                + "5.Assign Policy:\n "
                + "6.Deassign Policy:\n "
                + "7.List of Policy assigned Customers: \n"
                + "8.List of Customers:\n "
                + "9.List of Policies:\n"
        ));
           switch(choice)
           {
               
               case 1:
                   obj.createCompany();
                   break;
               case 2:
                   obj.createPolicy();
                   break;
               case 3:
                   obj.newCustomer();
                   break;
               case 4:
                   obj.showPolicy();
                   break;
               case 5:
                   obj.assignPolicy();
                   break;
               case 6: 
                   obj.deletePolicy();
                   break;
               case 7:
                   obj.showCustomerPolicy();
                   break;
               case 8:
                   obj.showCustomers();
                   break;
               case 9:
                   obj.showPolicy();
                   break;
           }
       }
    }
    
    
}
