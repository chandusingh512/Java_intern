
import java.util.List;

public class remove 
{  Listedlist st=new List();

    
    public static void main(String[] args) 
    {
        String str="12345678";
        System.out.println("Printing the str value before removing nth character :\n" +str);
        System.out.println("After removing the character: " + remove(str,7));    
}
   public static String  remove(String str, int n)
    {
     return str.substring(0, n-1) + str.substring(n);
      
    }
}


