package spring.pag068.autowiring.byConstructor;

public class Language {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Language [name=" + name + "]";
	}
	
}
