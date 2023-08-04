/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author danny
 */
public class Cliente extends Persona {
    nit de cadena  privada;

    Cliente público() {}

     public Cliente(String nit, String nombre, String apellido, String direccion,  String telefono,   String fecha_nacimiento ) {
        super(nombre, apellido, direccion, telefono, fecha_nacimiento);
        esto. nit = liendre;
        
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Invalidar
       protected String[] crear(){
           probar
            {         
                    String datos[]= new String[6 ];      
                      datos[0] = getNit();
                      datos[1] = getNombres();
                      datos[2] = getApellidos();
                      datos[3] = getDireccion();
                      datos[4] = getTelefono();
                      datos[5] = getFecha_Nacimiento();
              devolver datos;            
                 }
            
             captura(Excepción ex)
            {

                    JOptionPane. showMessageDialog(null,ex.getMessage(),"Error en Query",JOptionPane. ERROR_MESSAGE);
                    return null;
            }
    
    }
    
}
