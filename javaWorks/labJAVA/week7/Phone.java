
public class Phone {
	private String countrycode;
	private int code;
	private int number;
	private String type;

	// constructors
	public Phone(String countrycode, int code, int number, String type) {
		this.countrycode = countrycode;
		this.code = code;
		this.number = number;
		this.type = type;		
	}
	public Phone(int code, int number, String type) {
		this.countrycode = "+90";
		this.code = code;
		this.number = number;
		this.type = type;
	}

	// setters
	public void setCountryCode(String countrycode){
		this.countrycode = countrycode;
	}
	public void setCode(int code){
		this.code = code;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public void setType(String type){
		this.type = type;
	}

	// getters
	public String getCountryCode(){
		return this.countrycode;
	}
	public int getCode(){
		return this.code;
	}
	public int getNumber(){
		return this.number;
	}
	public String type(){
		return this.type;
	}

	// display
	public String Display() {
		return "Phone:"+countrycode+" "+code+number;
	}
}