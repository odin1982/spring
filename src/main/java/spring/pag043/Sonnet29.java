package spring.pag043;

public class Sonnet29 implements Poem{
	private static String[] LINES = {"uno","dos","tres"};
	
	public Sonnet29() {
		
	}

	@Override
	public void recite() {
		for(String phrase:LINES) {
			System.out.println(phrase);
		}
	}
	
}
