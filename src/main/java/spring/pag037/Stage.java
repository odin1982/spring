package spring.pag037;

public class Stage {
	private Stage() { System.out.println("Creando instancia de Stage!!"); }
	
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}

}
