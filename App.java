package logger;

public class App {

	public static void main(String[] args) {
		
		Logger asterickLogger = new AsterickLogger();
		
		
		
		
		asterickLogger.Log("Hello");
		System.out.println(" ");
		asterickLogger.Error("Hello");
		System.out.println(" ");

		Logger spacedLogger = new SpacedLogger();
		
		
		spacedLogger.Log("Hello");
		System.out.println("");
		spacedLogger.Error("Hello");
		System.out.println("");
		
		
		asterickLogger.Log("Welcome");
		System.out.println("");
		asterickLogger.Error("Welcome");
		System.out.println("");
	}

}
