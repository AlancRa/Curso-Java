/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Consultas;
import modelo.Producto;
import vista.JFrmProducto;

/**
 *
 * @author Suricata
 */
public class Controller implements ActionListener {
    
    
    private Producto producto;
    private Consultas consultas;
    private JFrmProducto vista;
    
    public Controller(Producto producto,Consultas consultas,JFrmProducto vista){
    
        this.producto = producto;
        this.consultas = consultas;
        this.vista = vista;
        
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }
    
    public void IniciarVista(){
    
        vista.setTitle("Productos");
        vista.setLocationRelativeTo(null);
        vista.txtId.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== vista.btnGuardar){
            
            producto.setCodigo(vista.txtCodigo.getText());
            producto.setNombre(vista.txtNombre.getText());
            producto.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            producto.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));
            
            if(consultas.Registrar(producto)){
                
                JOptionPane.showMessageDialog(null,"Registro guardado.");
                limpiar();
            }else{
                 
                JOptionPane.showMessageDialog(null,"Error al guardar.");
                limpiar();
            }
        }
        
        if(e.getSource()== vista.btnModificar){
            
            producto.setId(Integer.parseInt(vista.txtId.getText()));
            producto.setCodigo(vista.txtCodigo.getText());
            producto.setNombre(vista.txtNombre.getText());
            producto.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            producto.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));
            
            if(consultas.Modificar(producto)){
                
                JOptionPane.showMessageDialog(null,"Registro modificado.");
                limpiar();
            }else{
                 
                JOptionPane.showMessageDialog(null,"Error al modificar.");
                limpiar();
            }
        }
        
        if(e.getSource()== vista.btnEliminar){
            
            producto.setId(Integer.parseInt(vista.txtId.getText()));
        
            
            if(consultas.Eliminar(producto)){
                
                JOptionPane.showMessageDialog(null,"Registro eliminado.");
                limpiar();
            }else{
                 
                JOptionPane.showMessageDialog(null,"Error al eliminar.");
                limpiar();
            }
        }
        
         if(e.getSource()== vista.btnBuscar){
            
            producto.setCodigo(vista.txtCodigo.getText());
        
            
            if(consultas.Buscar(producto)){
                
                vista.txtId.setText(String.valueOf(producto.getId()));
                vista.txtCodigo.setText(producto.getCodigo());
                vista.txtNombre.setText(producto.getNombre());
                vista.txtPrecio.setText(String.valueOf(producto.getPrecio()));
                vista.txtCantidad.setText(String.valueOf(producto.getCantidad()));
                
              
            
            }else{
                 
                JOptionPane.showMessageDialog(null,"No se encontro ningun registro.");
                
            }
        }
         
       if(e.getSource() == vista.btnLimpiar){
           
           limpiar();
       }
    }
    
    public void limpiar(){
    
        
        vista.txtCodigo.setText(null);
        vista.txtNombre.setText(null);
        vista.txtPrecio.setText(null);
        vista.txtCantidad.setText(null);
        
    }
}
