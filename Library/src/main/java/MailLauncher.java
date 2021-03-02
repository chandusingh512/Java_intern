
import javax.swing.JOptionPane;

public class MailLauncher 
{ 
    
    public static void main(String[] args)
    { 
        transaction t=new transaction();

    
    while(true)
       {
           
          int want = Integer.parseInt(JOptionPane.showInputDialog(""
                  + "1. for create racks \n"
                  + "2. for add book \n"
                  + "3. for find book \n" 
                  + "4. for display library \n"
                  + "5. for delete books \n"
                  + "6. for exit\n "));
           switch(want)
           {  
               
               case 1:
                   t.createRacks();
                   break;
               case 2:
                   t.addBook();
                   break;
               case 3:
                   t.findBook();
                   break;
               case 4:
                   t.displayAll();
                   break;
               case 5:
                   t.deleteBook();
                   break;
               case 6:
                   System.exit(0);
                default: System.out.println("Please enter correct number: ");
                   break;
                   
           }
       }    
    
    }
    
}
