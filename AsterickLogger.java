package logger;

public  class AsterickLogger implements Logger {

	
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

	
	public void Error(String error) {
		System.out.println("******************"+"\n\n***Error:" + error +"***"+ "\n\n******************" );
		System.out.println(" ");
	}

}
