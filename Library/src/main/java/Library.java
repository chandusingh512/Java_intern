
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;


public class Library
   {
    LinkedList<BookDetails> rack=new LinkedList();
    
    public static void main(String[] args) 
    { 
        LinkedList r1=new LinkedList();
    
    Details db=new Details();
    int want = Integer.parseInt(JOptionPane.showInputDialog("What do you want to do \n "
            + "1 for create racks \n"
            + "2 for operations\n "
            + "3 for exit "));
          
if(want==1)
{    
       while(true)
       {
           
          int choice = Integer.parseInt(JOptionPane.showInputDialog("How many racks do you want to create: "));
           switch(choice)
           {  
               
               case 1:
                   
                   db.setBookId(JOptionPane.showInputDialog("Enter the book id: "));
                   db.setBookName(JOptionPane.showInputDialog("Enter the book name: "));
                   db.setBookType(JOptionPane.showInputDialog("Enter the book type "));
                   r1.add(db);
                   
                   break;
               case 2:
                   LinkedList r2=new LinkedList();
                   Details db1=new Details();
                   db1.setBookId(JOptionPane.showInputDialog("Enter the book id : "));
                   db1.setBookName(JOptionPane.showInputDialog("Enter the book name: "));
                   db1.setBookType(JOptionPane.showInputDialog("Enter the book type "));
                   r2.add(db1);
                   
                   LinkedList r3=new LinkedList();
                   Details db2=new Details();
                   
                   db2.setBookId(JOptionPane.showInputDialog("Enter the book id: "));
                   db2.setBookName(JOptionPane.showInputDialog("Enter the book name: "));
                   db2.setBookType(JOptionPane.showInputDialog("Enter the book type "));
                   r2.add(db2);
                   
                   break;
               case 3:
                   LinkedList r4=new LinkedList();
                   Details db3=new Details();
                   db3.setBookId(JOptionPane.showInputDialog("Enter the book id: "));
                   db3.setBookName(JOptionPane.showInputDialog("Enter the book name: "));
                   db3.setBookType(JOptionPane.showInputDialog("Enter the book type "));
                   r4.add(db3);
                   LinkedList r5=new LinkedList();
                   Details db4=new Details();
                   db4.setBookId(JOptionPane.showInputDialog("Enter the book id: "));
                   db4.setBookName(JOptionPane.showInputDialog("Enter the book name: "));
                   db4.setBookType(JOptionPane.showInputDialog("Enter the book type "));
                   r5.add(db4);
                   
                   LinkedList r6=new LinkedList();
                   Details db5=new Details();
                   db5.setBookId(JOptionPane.showInputDialog("Enter the book id: "));
                   db5.setBookName(JOptionPane.showInputDialog("Enter the book name: "));
                   db5.setBookType(JOptionPane.showInputDialog("Enter the book type "));
                   r6.add(db5);
                
                   break;
               case 5:
                  default: System.out.println("Please enter correct number: ");
                   break;
           }
       }
       
         
       
}
else if(want==2)
{
  transaction t=new transaction();
       t.Operations();  
}
else if(want==3)
{
    System.exit(0);
}
 
 }
    public void display()
    {
        
        int var=JOptionPane.showInputDialog("Enter the rack number: ");
             if (var==1)
     {
          Iterator<String> iterator2=r1.iterator();
          while(iterator2.hasNext()){
          System.out.print(iterator2.next()+" ");
      } 
     }
}
 
}