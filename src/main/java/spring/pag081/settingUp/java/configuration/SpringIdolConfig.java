package spring.pag081.settingUp.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.pag031.Performer;
import spring.pag033.Juggler;
import spring.pag033.Poem;
import spring.pag033.PoeticJuggler;
import spring.pag033.Sonnet29;
import spring.pag041.Instrumentalist;

@Configuration
public class SpringIdolConfig {

	@Bean
	public Performer duke() {
		return new Juggler();
	}
	
	@Bean
	public Performer duke15() {
		return new Juggler(15);
	}
	
	@Bean 
	public Performer kenny() {
		Instrumentalist kenny = new Instrumentalist();
		kenny.setSong("Jingle Bells");
		return kenny;
	}
	
	@Bean
	public Poem sonnet29() {
		return new Sonnet29();
	}
	
	@Bean
	public Performer poeticDuke() {
		return new PoeticJuggler(sonnet29());
	}
}
