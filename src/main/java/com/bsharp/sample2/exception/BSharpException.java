package  com.bsharp.sample2.exception;

public class BSharpException extends Exception {
	private String errorMessage;
	
	public BSharpException(){
		super();
	}
	
	public BSharpException(String message){
		this.errorMessage = message;
	}
	
	public String getErrorMessage(){
		return this.errorMessage;
	}
}
