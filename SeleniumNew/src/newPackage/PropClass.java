package newPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/data.properties");
		prop.load(fis);
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.get("browser"));
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"/data.properties");
		prop.store(fos, "updated browser");
	}

}
