package hashMap;

public class State {
	public State(String code, String name, String language, String capital) {
		super();
		this.code = code;
		this.name = name;
		this.language = language;
		this.capital = capital;
	}
	private String code;
	private String name;
	private String language;
	private String capital;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "State [code=" + code + ", name=" + name + ", language=" + language + ", capital=" + capital + "]";
	}
	
}
