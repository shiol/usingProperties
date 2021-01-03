import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * main
 */
public class usingProperties {
    public static void main(String[] args) {

        Properties properties = new Properties();
        
        try {
            File file = new File("data");
            file.createNewFile();

            OutputStream os = new FileOutputStream(file);

            if (!properties.containsKey("username")){
                properties.setProperty("username", "shiol003");
                properties.setProperty("email", "shiol003@gmail.com");
            }

            properties.store(os, "properties for system");

            InputStream is = new FileInputStream(file);

            properties.load(is);
            
            System.out.print(properties.getProperty("username"));
            System.out.print("/");
            System.out.print(properties.getProperty("email"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}