
import java.util.ArrayList;
import java.util.Collection;

public class ArrayDay2 
{

    public static void main(String[] args) 
    {
    ArrayList accountList=new ArrayList();
    accountList.add(0,4);
    
     accountList.add(5);
    
    accountList.addAll(accountList);
    accountList.addAll(0, accountList);
    
    
    accountList.clear();
    accountList.ensureCapacity(10);
    accountList.get(0);
    accountList.isEmpty();
    accountList.lastIndexOf(args);
    accountList.contains(args);
    
    
    
    
    
    accountList.indexOf(5);
    accountList.remove(0);
    accountList.remove(5); 
   accountList.removeAll(accountList);
   accountList.removeAll(accountList);
   accountList.subList(0, 0); //remove from given range;
    
    
    
    
    }
    
}
