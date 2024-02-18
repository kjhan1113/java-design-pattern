package creational.singleton;

public class SingletonLoggerTest {
	
	public static void main(String[] args) {
		
		// Attempting to create a new instance directly will not work
		// SingletonLogger logger = new SingletonLogger();

		SingletonLogger logger = SingletonLogger.getInstance();
		
        // Log messages
        logger.log("Application started");
        logger.log("Processing data...");
        logger.log("Data processing complete");

        // Close the log file
        logger.closeLogFile();
        
        SingletonLogger secondLogger = SingletonLogger.getInstance();
        secondLogger.log("Logging from second reference");

        // Close the log file for second reference
        secondLogger.closeLogFile();
        
        System.out.println("logger hash code : " + logger.hashCode());
        System.out.println("secondLogger hash code : " + secondLogger.hashCode());
	}
}
