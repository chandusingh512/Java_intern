/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class ConnectionProviderToDB {

    private static ConnectionProviderToDB connectionProviderToDB = null;

    /**
     *
     * @return
     */
    public static ConnectionProviderToDB getConnectionObject() {
        if (connectionProviderToDB == null) {
            connectionProviderToDB = new ConnectionProviderToDB();
        }
        return connectionProviderToDB;
    }
    //This is private constructor

    private ConnectionProviderToDB() {
    }

    /**
     *
     * @return
     */
    public Connection getConnection(String filePath) {

        Connection connection = null;
        try {

            DbParamProvider dbParamProvider = PropertiesReader.readProperties(filePath);

            //step1 load the driver class
            Class.forName(dbParamProvider.getDriver());

            //Class.forName("com.mysql.cj.jdbc.Driver");
            //step2 create  the connection object 
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/exavaludb","avijit","root"); 
            connection = DriverManager.getConnection(dbParamProvider.getDbUrl() + dbParamProvider.getDbName(), dbParamProvider.getUserName(), dbParamProvider.getPassword());
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());

        }

        return connection;

    }

}
