import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 

public class ConexionJDBC {
	
	public static void println(String txt) {
		System.out.println("=>"+txt);
	}
	 
	public static void main( String[] args ) throws Exception {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clase?useSSL=false", "root", "y^wgdscy");
		
		Statement statement = connection.createStatement();
		
		// Cuando no necesitamos que devuelva nada, el entero devuelve el numero de rows afectadas.
		int res = statement.executeUpdate("INSERT INTO product (description, precio, stock, name) VALUES ('Producto test', '12', '1001', 'Producto Tes')");
		println("ROWS: "+res);	
		res = statement.executeUpdate("UPDATE product SET precio='13' WHERE name='Producto Tes'");
		println("ROWS: "+res);
		res = statement.executeUpdate("DELETE FROM product WHERE name='Producto Tes'");
		println("ROWS: "+res);
		
		// Resulset es la matriz de datos. Para pasar de un row al siguiente usamos .next() que devolverá false cuando no pueda pasar al siguiente.
		ResultSet res2 = statement.executeQuery("SELECT * FROM product");
		while (res2.next()) {
			// read the result set 
			int id      = res2.getInt("id");
			String name = res2.getString("name");
			int precio  = res2.getInt("precio");
			println("NAME:"+name);
		}
		
		
	}

}



















