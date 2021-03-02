
import java.util.ArrayList;
import java.util.Iterator;

public class JavaTestCollection1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList list=new ArrayList();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        //traversing list through iterator
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


// TODO code application logic here
    }
    
}
