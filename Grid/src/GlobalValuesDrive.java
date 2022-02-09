import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);

		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));

		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos = new FileOutputStream(path);
		prop.store(fos, null);

	}

}