
public class ClaseSingleton {

	private static ClaseSingleton instancia;
	private ClaseSingleton() {
		
	}
	
	public static ClaseSingleton init() {
		
		if (instancia == null) {
			instancia = new ClaseSingleton();
		}
		
		return instancia;
	}
	
	public void cosa() {
		
	}
	
	public static void main( String[] args ) { 
		ClaseSingleton instancia = ClaseSingleton.init();
		ClaseSingleton.cosa();
		instancia.cosa();
	}
	
}
