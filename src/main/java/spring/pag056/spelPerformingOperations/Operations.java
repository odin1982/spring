package spring.pag056.spelPerformingOperations;

public class Operations {
	private int x;
	private int y;
	private double resultado;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public double getResultadoSuma() {
		return x+y;
	}
	
	@Override
	public String toString() {
		return "Operations [x=" + x + ", y=" + y + ", resultado=" + resultado + "]";
	}
	
}
