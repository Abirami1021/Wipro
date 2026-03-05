package utilities;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() {

        try {
            prop = new Properties();

            InputStream input =
                    getClass().getClassLoader()
                    .getResourceAsStream("config/config.properties");

            if (input == null) {
                throw new RuntimeException("config.properties file not found!");
            }

            prop.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }

    public String getUrl() {
        return prop.getProperty("url");
    }
}