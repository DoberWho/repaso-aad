import java.sql.SQLException;

public class AplicacionEjemploSettings {
	
	public static void main(String[] args) {
		
		Settings configuracion = Settings.getInstance();
		configuracion.setNotificaciones(false);
		
		
		Settings configuracion2 = Settings.getInstance();
		
		System.out.println("Son Iguales: "+(configuracion == configuracion2));
		System.out.println("CONF1: "+configuracion);
		System.out.println("CONF2: "+configuracion2);
	}

}
