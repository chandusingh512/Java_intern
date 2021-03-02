package exavalu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

public class Exavalu {

    PropertiesReader p = new PropertiesReader();

    public static void main(String[] args) {
        try {
            DbParamProvider db = PropertiesReader.readProperties();
//step1 load the driver class 
            //    Class.forName("com.mysql.cj.jdbc.Driver");//hard coding 
            System.out.println("Driver name=" + db.getDriver());
            Class.forName(db.getDriver());

//step2 create  the connection object 
//    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exavalu","root","root"); 
//Connection con=DriverManager.getConnection("driver"+"db_url"+"db_name"+"user_name"+"password"); 
            Connection con = DriverManager.getConnection(db.getDbUrl() + db.getDbName(), db.getUserName(), db.getPassword());

//step3 create the statement object 
            Statement stmt = con.createStatement();
   /*         //  String id=JOptionPane.showInputDialog("Enter the id of the customer");
            String name = JOptionPane.showInputDialog("Enter the name of the customer");
            String age = JOptionPane.showInputDialog("Enter the age of the customer");
            String location = JOptionPane.showInputDialog("Enter the location of the customer");
*/
   String sq=JOptionPane.showInputDialog("Enter the location of the customer");
   String cid=JOptionPane.showInputDialog("Enter the customer id of the customer");
   
           
//step4 execute query 
            //     String  sq="select * from customer where customer_name like '"+var+"%'";
        //    String sql = "INSERT INTO customer(customer_name,customer_age,customer_location) VALUES('" + name + "','" + age + "','" + location + "')";
            String sql ="UPDATE `exavalu`.`customer` SET `customer_location` = '"+sq+"' WHERE (`customer_id` = '"+cid+"')";

            int row = stmt.executeUpdate(sql);

         /*   while (rs.next()) {

                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            }
*/
         if(row==1)
         {
             System.out.println("One row inserted");
         }
         else
         {
             System.out.println("No row inserted");
         }

//step5 close the connection object 
            con.close();

        } catch (Exception e) {

            System.out.println("Driver classpath not set::" + e);

        }

    }

}
