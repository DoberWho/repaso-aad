
public class EjemplosCodigo {
	
	public static void main( String[] args ) { 
		
		String str = "";
		Object obj = str;
		Integer entero = 0;
		Float flotante = 0f;
		
		System.out.println("STR es String: "+ (str instanceof String)  );
		System.out.println("obj es Integer: "+ (obj instanceof Integer)  );
		System.out.println("obj es Float: "+ (obj instanceof Float)  );
		System.out.println("obj es String: "+ (obj instanceof String)  );
		System.out.println("int es Obj: "+ (flotante instanceof Object)  );
		
		System.out.println("entero es Integer: "+ (entero instanceof Integer)  );
		System.out.println("obj es Float: "+ (obj instanceof Float)  );
		
		
		
		
	}

}
