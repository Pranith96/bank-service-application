
public interface Addition {

	public void hi();
	public void hello();
	public static void add() {
		
	}
	
	public static void display() {
		System.out.println("display");
	}
	
	default void print() {
		System.out.println("print");
	}
}
