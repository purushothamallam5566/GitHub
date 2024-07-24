package com.utils.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
public static Properties initializeProperties() throws IOException
{
String str=System.getProperty("user.dir");	
	File file=new File(str+"/src/test/resources/config/config.properties");
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(fis);
	return prop;
}
}
