//package utils;
//
//import java.io.FileReader;
//import java.io.Reader;
//import java.util.Properties;
//
//public class PropertiesHelper {
//	
//	private static String url;
//	private static String user;
//	private static String pass;
//
//	static {
//		Properties props = new Properties();
//		try {
//			Reader reader = new FileReader("src/main/resources/project.properties");
//			props.load(reader);
//			url = props.getProperty("DB_URL");
//			user = props.getProperty("DB_USER");
//			pass = props.getProperty("DB_PASS");			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static String getUrl() {
//		return url;
//	}
//
//	public static String getUser() {
//		return user;
//	}
//
//	public static String getPass() {
//		return pass;
//	}
//}
