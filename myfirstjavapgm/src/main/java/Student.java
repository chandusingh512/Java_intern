public class Student
{
private int roll;
private String name;
public int getRoll()// accessor method
{
    return roll;
}
public void setRoll(int roll)// setter method;
{
    this.roll=roll;
    
}
public String getName()
{
    return name;
}
public void setName(String name)// setter method;
{
    this.name=name;
    
}
public void display()
{
    System.out.println("Roll no.:"+ roll);
    System.out.println("Student name: "+name);
}


public static void main(String[] args)
{
Student s1=new Student();
s1.setName("Chandu");
s1.setRoll(1112);
       s1.display();
}
}
    

