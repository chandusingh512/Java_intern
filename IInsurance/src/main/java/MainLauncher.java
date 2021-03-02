import java.util.Scanner;
public class MainLauncher extends PolicyTransaction 
{
    
    public static void main(String[] args) 
    {
        PolicyTransaction obj = new PolicyTransaction();
        Scanner sc = new Scanner(System.in);
        int choice;
       while(true)
       {
           System.out.println("PLease Enter Numeric Value From The Menu");
           System.out.println("1.Create Company:");
           System.out.println("2.Create Policy:");
           System.out.println("3.New Customer:");
           System.out.println("4.Show Policies:");
           System.out.println("5.Assign Policy:");
           System.out.println("6.Deassign Policy:");
           System.out.println("7.List of Policy assigned Customers:");
           System.out.println("8.List of Customers:");
           System.out.println("9.List of Policies:");
           choice = sc.nextInt();
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
