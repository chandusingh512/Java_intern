import java.util.*;
import javax.swing.JOptionPane;
class Account
{   
    public static int account_number,amount;
    public static String  name;
    
private Account(String name,int account_number,int amount) 
{
    this.name=name;
    this.account_number=account_number;
    this.amount=0;

}
    public int deposit( )
    {   int m = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to deposit"));
        amount=amount+m;
        return amount;
        
    }
    
    public int withraw()
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to withraw"));
        amount=amount-n;
        return amount;
    }
    public void show()
    {
        System.out.println(name+" "+account_number+" "+amount );
    }
    public static void main(String[] args) 
    
    {

        Account ac=new Account("chandu",453578,1224);
        ac.show();
        ac.deposit();
        ac.show();
        ac.withraw();
        ac.show();
        
        
    }
    
    
}
