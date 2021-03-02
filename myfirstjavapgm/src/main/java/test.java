
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
            {  
            int a[]=new int[5];  
            a[5]=4;  
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }  
     
    }
    
}
