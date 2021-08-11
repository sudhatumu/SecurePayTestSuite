package managers;

import utils.ConfigReader;

public class FileReaderManager {
	//making this as singleton - purpose is to control object creation, limiting the number of objects to only one

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigReader configReader;

	private FileReaderManager() {
		//to restrict instantiation of this class from other classes
	}

	 public static FileReaderManager getInstance( ) {
		 //clients cannot instantiate FileReaderManager instances
	      return fileReaderManager;
	 }

	 public ConfigReader getConfigReader() {
		 //clients can access this method to get the instance of config file
		 return (configReader == null) ? new ConfigReader() : configReader;
	 }
}