package spring.pag067;

public class Person {
	private Ability ability;

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "Person [ability=" + ability + "]";
	}
	
}
