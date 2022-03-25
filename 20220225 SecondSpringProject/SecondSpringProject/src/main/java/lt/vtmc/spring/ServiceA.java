package lt.vtmc.spring;

public class ServiceA {
	private String message;

	public String getResult() {
		return getMessage();
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
