package exavalu.com.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author PC
 */
public class PropertiesReader {

    /**
     *
     * @param filePath
     * @return
     */
    public static DbParamProvider readProperties(String filePath) {
        DbParamProvider dbparamProvider = new DbParamProvider();

        //now read the properties file and extract the properties to set into DbparamProvider class
        FileReader reader;
        try {
            reader = new FileReader(filePath);
            Properties p = new Properties();
            p.load(reader);
            dbparamProvider.setDriver(p.getProperty("driver"));
            dbparamProvider.setDbUrl(p.getProperty("db_url"));
            dbparamProvider.setDbName(p.getProperty("db_name"));
            dbparamProvider.setUserName(p.getProperty("user_name"));
            dbparamProvider.setPassword(p.getProperty("password"));

        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (IOException e) {
            System.out.println(e);

        }
        return dbparamProvider;
    }
}
