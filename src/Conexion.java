
import java.sql.Connection;//ok
import java.sql.DriverManager;//ok
import java.sql.SQLException;//ok
import java.util.logging.Level;
import java.util.logging.Logger;
// import com.mysql.cj.xdevapi.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Conexion {
    String bd="Proyecto";
    String url="jdbc:mysql://localhost:3306/"; // mostrar un mensaje que diga que mysql tiene que estar en el puerto 3306
    String user="root";
    String password="carlos120042"; //pedir la contraseña de mysql
    String driver="com.mysql.cj.jdbc.Driver"; //com.mysql.cj.jdbc.Driver
    Connection cx;

    //              CONSTRUCTOR 

    public Conexion(String bd, String user, String password){
        this.bd=bd;
        this.user=user;
        this.password=password;
    }

    //              CONECCIÓN
    
    public Connection conectar(){ 
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user,password);
            if(cx!=null){
                System.out.println("@@@@ CONECTADO A LA BASE DE DATOS, SIUUUUUU! @@@@ "+bd);
            }
        } catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("@@@ NO se conecto a "+bd+" "+ex.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return cx;
    }

    //              DESCONECCIÓN
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    //              INSERTAR DATOS
    
    public void insertData(String tableName, String column1, String column2, String value1, String value2) {
        try {
            String query = "INSERT INTO " + tableName + " (" + column1 + ", " + column2 + ") VALUES (?, ?)";
            
            try (PreparedStatement statement = cx.prepareStatement(query)) {
                statement.setString(1, value1);
                statement.setString(2, value2);
                int rowsAffected = statement.executeUpdate();
                
                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data.");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //              CREAR TABLA
    

    public void createTable(String tableName, String column1, String column2) {
        try {
            String query = "CREATE TABLE IF NOT EXISTS " + tableName + " (" + column1 + " VARCHAR(255), " + column2 + " VARCHAR(255))";
            
            try (Statement statement = cx.createStatement()) {
                statement.executeUpdate(query);
                System.out.println("Table created or already exists!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //              CONSULTAS
    
    public void executeQuery(String query) {
        try {
            try (Statement statement = cx.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
                // Process the result set if needed
                while (resultSet.next()) {
                    // Retrieve data from the result set
                    String column1Value = resultSet.getString("column1");
                    String column2Value = resultSet.getString("column2");
                    
                    // Perform actions with the retrieved data
                    System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //              MAIN PARA VALIDAR LA CONEXIÓN, TOCA BORRARLA XD

    public static void main(String[] args) {
        Conexion conexion=new Conexion("Proyecto","root","carlos120042");
        conexion.conectar();
        
        conexion.createTable("example_table", "column1", "column2");
        // Example: Insert Data
        conexion.insertData("example_table", "column1", "column2", "value1", "value2");

        // Example: Execute Query
        String selectQuery = "SELECT * FROM example_table";
        conexion.executeQuery(selectQuery);

        // Close the connection
        conexion.desconectar();
    }

}
