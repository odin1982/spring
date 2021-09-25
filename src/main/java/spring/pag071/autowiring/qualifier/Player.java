package spring.pag071.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Player {
	private String name;
	
	@Autowired
	@Qualifier("barcelona")
	private Team team;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + "]";
	}
	
}
