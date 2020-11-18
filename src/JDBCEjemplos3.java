import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEjemplos3 {

	public static void main(String[] args) throws SQLException {
		

Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","1daw");
try {
    Class.forName("com.mysql.jdbc.Driver"); 
    conexion.setAutoCommit(false); ////// ----->> Desactivamos auto commit

    Statement st = conexion.createStatement();

    // Crear un pedido
    st.executeUpdate("INSERT INTO PEDIDOS(.......) VALUES(.....)");

    // Actualizar el inventario
    st.executeUpdate("UPDATE TABLE INVENTARIO SET stock = ...... WHERE PRODUCT ID = .....");                           

    // Crear un registro de envíos si se cumple una determinada condición
    boolean condicion = true;
    if (condicion) {
        st.executeUpdate("INSERT INTO ENVIOS(....) VALUES(...)");
        conexion.commit();  ///// ---->> reflejar las operaciones en la base de datos
    } else {
         conexion.rollback(); ///// -----> Deshacer operaciones
    }
} catch (SQLException e) {  //Si se produce una Excepción deshacemos las operaciones
         System.out.println(e.toString());
         if(conexion!=null){
            try {
              conexion.rollback();///// -----> Deshacer operaciones
             } catch (SQLException ex) {
                      System.out.println(ex.toString());
            }
         }
 } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
 } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
 }

		

	}

}
