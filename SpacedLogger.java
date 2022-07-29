package logger;

public class SpacedLogger implements Logger {

	
	public void Log(String log) {
		for(int i = 0; i < log.length(); i++) {
			 System.out.print(log.charAt(i) + " ");
		}
		
		     System.out.println(" ");

		}


	public void Error(String error) {
		System.out.print("ERROR: ");
			for(int i = 0; i < error.length(); i++) {
			
			System.out.print(error.charAt(i) + " ");
		}
			System.out.println(" ");
			System.out.println(" ");

	}

}
