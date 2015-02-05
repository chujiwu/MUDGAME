package personalproj.chujiwu.env;

import java.io.File;

public class EnvConstant {
	
	public static String CONFFILEPATH = System.getProperty("user.dir") + File.separator;
	
	public static String SAVEDATAPATH = CONFFILEPATH + "data" + File.separator + "savedata.dat";
	
	public static String XMLFILEPATH = System.getProperty("user.dir") + File.separator + "xml";
	
	enum ConfigFile{
		GAMESETTING("gamesetting.conf");
		
		private String fileName;
		private ConfigFile(String fileName){
			this.fileName = fileName;
		}
		public String getFileName(){
			return fileName;
		}
	}
}
