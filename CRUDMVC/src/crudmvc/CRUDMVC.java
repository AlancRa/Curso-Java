/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;

import controlador.Controller;
import modelo.Consultas;
import modelo.Producto;
import vista.JFrmProducto;

/**
 *
 * @author Suricata
 */
public class CRUDMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto producto = new Producto();
        Consultas consultas = new Consultas();
        JFrmProducto vista = new JFrmProducto();
        Controller controller = new Controller(producto,consultas,vista);
        controller.IniciarVista();
        vista.setVisible(true);
        
    }
    
}
