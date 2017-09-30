/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suricata
 */
public class Conexion {
    
    public static final String BD="tienda";//Base de datos
    public static final String USER="root";//Usuario de la BD
    public static final String PASSWORD="1qaz";//Contraseña de la BD
    public static final String URL="jdbc:mysql://localhost:3307/"+BD;//URL
    private Connection conexion = null;//Variable obtiene conexion, guarda y la retorna
    
    
    public Connection getConexion() {//Método de conexión 
    
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");//Ruta del driver(controlador).
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion = (Connection) DriverManager.getConnection(this.URL,this.USER,this.PASSWORD);
            
        }catch(SQLException ex){
        
            System.err.println(ex);
        }
        return conexion;
    
    }
    
}
