package creational.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SingletonLogger {
	private static SingletonLogger instance;
	private PrintWriter logFile;
	
	// Private constructor to prevent external instantiation
	private SingletonLogger() {
		try {
			logFile = new PrintWriter(new FileWriter("application_log.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	// Public method to access the instance : global point of access
	// Use synchronized keyword to ensure thread safety
	public static synchronized SingletonLogger getInstance() {
		if(instance == null) {
			instance = new SingletonLogger();
		}
		
		return instance;
	}
	
	// Log a message to the file
	public void log(String message) {
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		logFile.println(timestamp + " - " + message);
		logFile.flush();
	}
	
	// Close the log file when the application shuts down
	public void closeLogFile() {
		if(logFile != null) {
			logFile.close();
		}
	}
}
