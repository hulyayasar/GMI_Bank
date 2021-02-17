package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //This class reads the configuration.properties file

    //Create Properties Instance
    private static Properties properties;




    static {
        //path of the configuration file.
        String path = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            //close the file
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //this method will get the key from properties file.
    //and returns the value as String.
    public static String getProperty(String key) {
        return properties.getProperty(key);

    }

    //Test if logic works

    public static void main(String[] args) {
        System.out.println( properties.getProperty("url"));
    }


}
