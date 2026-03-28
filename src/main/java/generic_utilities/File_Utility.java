package generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {

	public static String getPropertyData(String key) {
	    FileInputStream fis = null;
	    Properties property = new Properties();
	    
	    try {
	        fis = new FileInputStream("./src/main/resources/commonData.properties");
	        property.load(fis);
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    return property.getProperty(key);
	}
}
