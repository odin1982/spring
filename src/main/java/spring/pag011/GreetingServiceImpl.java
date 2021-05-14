package spring.pag011;

public class GreetingServiceImpl implements GreetingService{
	private String greeting;
	
	//constructor
	public GreetingServiceImpl() {}
	
	public GreetingServiceImpl(String greeting) {
		this.greeting = greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayGreeting() {
		System.out.println(greeting);
	}
	
}
