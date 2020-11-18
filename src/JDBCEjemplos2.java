import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEjemplos2 {

	public static void main(String[] args) throws SQLException {
		
		Connection cnS = DriverManager.getConnection("jdbc:sqlite:C:/codigo/DAM-PR01-1/database.db");
		Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clase?useSSL=false", "root", "y^wgdscy");
		Statement s = cn.createStatement();
		
		try {
			cn.setAutoCommit(false);
		    s.executeUpdate("INSERT INTO RESERVAS(pasajero, origen, destino) VALUES('Felipe', 'Alicante', 'Madrid')");         
		    s.executeUpdate("INSERT INTO RESERVAS(pasajero, origen, destino) VALUES ('Felipe', 'Madrid', 'Dubai')");
		    s.executeUpdate("INSERT INTO RESERVAS(pasajero, origen, destino) VALUES('Felipe', 'Dubai', 'Sydney')");
		    cn.commit(); 

		} catch(SQLException e) {
		        if(cn!=null){
		           try {
		        	   cn.rollback();
		           }catch (SQLException ex) {
		               System.out.println(ex.toString());
		           }
		        }
		}
		

	}

}
