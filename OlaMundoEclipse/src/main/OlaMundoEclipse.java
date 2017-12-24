package main;

public class OlaMundoEclipse {
	
	private String msg;
	
	public void setMessage(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return this.msg;
	}
	
	public static void main(String[] args) {
		
		OlaMundoEclipse test = new OlaMundoEclipse();
		
		test.setMessage("Olá Mundo!");
		
		System.out.println(test.getMessage());
		
	}

}
