
import javax.swing.JOptionPane;


public class Test
{   
    public static int findNumber(int arr[], int size)
    {
      int missing_no= size;
      for(int i=0;i<size;i++)
      {
         missing_no^= i^arr[i];
      }
      return missing_no;
   }
    public static void main(String[] args)
    {
    
        {
      int arr[]=new arr[5];
              
      int n = arr.length;
      int a=findNumber(arr, n);
      System.out.println(a);
   }
}
    
    
    
}
