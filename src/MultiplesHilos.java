
public class MultiplesHilos {

	public static void main(String[] args) {
		
		long prevTime = System.nanoTime();
		for (int idx = 0; idx < 2000000; idx++) {
			
			 Thread t = new Thread(new Runnable() {
				    @Override
				    public void run() {
				    	long currentTime = System.nanoTime();
				        System.out.println("HOLA: "+((currentTime - prevTime) / 1000000 ));
				    }
			  });
			 t.start();
			
		}

	}

}
