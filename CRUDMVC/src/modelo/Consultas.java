/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Suricata
 */
public class Consultas extends Conexion{//Extiende(herencia) de la clase conexión 
    
    public boolean Registrar(Producto producto){
    
        PreparedStatement ps = null;
        Connection conexion = getConexion();//Manda a llamar a la conexion
        String sql = "INSERT INTO producto (clave,nombre,precio,cantidad) VALUES (?,?,?,?)";
        
        try{
        
            ps =conexion.prepareStatement(sql);
            ps.setString(1,producto.getCodigo());
            ps.setString(2,producto.getNombre());
            ps.setDouble(3,producto.getPrecio());
            ps.setInt(4,producto.getCantidad());
            ps.execute();
            return true;
            
        }catch(SQLException ex){
        
            System.err.println(""+ex);
            return false;
        }finally{
            
            try{
                
                conexion.close();
            }catch(SQLException ex){ System.err.println(""+ex);}
        }
        
        
    }
    
    public boolean Modificar(Producto producto){
    
        PreparedStatement ps = null;
        Connection conexion = getConexion();//Manda a llamar a la conexion
        String sql = "UPDATE producto SET clave=?,nombre=?,precio=?,cantidad=? WHERE id=?";
        
        try{
        
            ps =conexion.prepareStatement(sql);
            ps.setString(1,producto.getCodigo());
            ps.setString(2,producto.getNombre());
            ps.setDouble(3,producto.getPrecio());
            ps.setInt(4,producto.getCantidad());
            ps.setInt(5,producto.getId());
            ps.execute();
            return true;
            
        }catch(SQLException ex){
        
            System.err.println(""+ex);
            return false;
        }finally{
            
            try{
                
                conexion.close();
            }catch(SQLException ex){ System.err.println(""+ex);}
        }
        
        
    }
    
    public boolean Eliminar(Producto producto){
    
        PreparedStatement ps = null;
        Connection conexion = getConexion();//Manda a llamar a la conexion
        String sql = "DELETE FROM producto WHERE id=?";
        
        try{
        
            ps =conexion.prepareStatement(sql);
            ps.setInt(1,producto.getId());
            ps.execute();
            return true;
            
        }catch(SQLException ex){
        
            System.err.println(""+ex);
            return false;
        }finally{
            
            try{
                
                conexion.close();
            }catch(SQLException ex){ System.err.println(""+ex);}
        }
        
        
    }
    
    public boolean Buscar(Producto producto){
    
        PreparedStatement ps = null;
        ResultSet result = null; 
        Connection conexion = getConexion();//Manda a llamar a la conexion
        String sql = "SELECT * FROM producto WHERE clave=?";
        
        try{
        
            ps =conexion.prepareStatement(sql);
            ps.setString(1,producto.getCodigo());
            result = ps.executeQuery();
            
            if(result.next()){
                
                producto.setId(Integer.parseInt(result.getString("id")));
                producto.setCodigo(result.getString("clave"));
                producto.setNombre(result.getString("nombre"));
                producto.setPrecio(Double.parseDouble(result.getString("precio")));
                producto.setCantidad(Integer.parseInt(result.getString("cantidad")));
                return true;
            }
            return false;
            
        }catch(SQLException ex){
        
            System.err.println(""+ex);
            return false;
        }finally{
            
            try{
                
                conexion.close();
            }catch(SQLException ex){ System.err.println(""+ex);}
        }
        
        
    }
}
