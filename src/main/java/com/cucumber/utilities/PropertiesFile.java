package com.cucumber.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	FileInputStream fileInput;
	public String getProperties(String Key) throws IOException {
//	define the path of the file
	String userdir = System.getProperty("user.dir");
	String fileseperator = System.getProperty("file.separator");
	String filepath = userdir+fileseperator+"Properties"+fileseperator+"application.properties";
	
//	load this path into file object
	try {
	 fileInput = new FileInputStream(filepath);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
//	create the object as property file
	
	Properties prop  = new Properties();
	try {
	prop.load(fileInput);
	}catch(IOException e) {
		e.printStackTrace();
	}
//	fetch the data from the property file
	String value = prop.getProperty(Key);

	return value;
}

}
