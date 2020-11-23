
public class Settings {

	private static Settings instance;

	private Settings() {
	}

	public static Settings getInstance() {
		if (instance == null) {
			instance = new Settings();
		}
		return instance;
	}
	
	
	private boolean recibirNotificaciones = true;
	
	public void setNotificaciones(boolean recibir) {
		this.recibirNotificaciones = recibir;
	}
	
}
