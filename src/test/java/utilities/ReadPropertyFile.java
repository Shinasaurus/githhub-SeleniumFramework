package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static FileReader fr;
	public static Properties p;
	public static String browser;
	public static String url;

	public static void propertyFileSetup() throws IOException {

		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
		fr = new FileReader(file);
		p = new Properties();
		p.load(fr);
		browser = p.getProperty("browser");
		url = p.getProperty("url");
	}

}
