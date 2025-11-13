package demos.basics;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertiesFile {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(System.getProperty("user.dir"));
		
		
		//FileInputStream fis = new FileInputStream("H:\\SelfStudy\\MyGitHubRepo\\core-java-repo\\java-io-demos\\src\\main\\resources\\sample.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\sample.properties");
		Properties props = new Properties();
		props.load(fis);
		String name = props.getProperty("name");
		String age = props.getProperty("age");
		String email = props.getProperty("email");
		System.out.println("Name: "+name+" Age: "+age+" email: "+email);
		
		
	}

}
