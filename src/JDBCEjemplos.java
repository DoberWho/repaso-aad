import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

public class JDBCEjemplos {

	public static void main(String[] args) throws SQLException {
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clase?useSSL=false", "root", "y^wgdscy");
		 
	
		PreparedStatement pstBuscarCodigo;
		PreparedStatement pstInsertarCuenta;

		String sqlBusqueda = "SELECT codigo FROM cuentas WHERE codigo=?";
		pstBuscarCodigo = cn.prepareStatement(sqlBusqueda);
		pstBuscarCodigo.setString(1, "codigo");
		ResultSet rs = pstBuscarCodigo.executeQuery();
		if (!rs.next()){
			
		}
		
		// Ejemplo de StringFormat
		String str = String.format("name is %s %s %d","codigo", "Codigo 2", 3);
		

		String sqlNuevaCuenta = "INSERT INTO cuentas VALUES (?,?,?,?)";
		
		pstInsertarCuenta = cn.prepareStatement(sqlNuevaCuenta); 
		pstInsertarCuenta.setString(1, "codigo");
		pstInsertarCuenta.setString(2, "nombre");
		pstInsertarCuenta.setString(3, "email");
		pstInsertarCuenta.setDouble(4, 2);
		pstInsertarCuenta.executeUpdate();    
		
	}

}
