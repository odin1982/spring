package spring.pag067;

public class Ability {
	private String skill;

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Ability [skill=" + skill + "]";
	}
	
}
