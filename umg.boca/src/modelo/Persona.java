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
abstract class Persona {
    private String nombre,apellido,direccion,telefono,fecha_nacimiento;
    
    Persona publica(){
        
    }
    
    public Persona(String nombres, String apellidos, String direccion, String telefono,   String fecha_nacimiento) {
        esto.  nombres = nombres;
        esto. apellidos = apellidos;
        esto.  direccion = direccion;
        esto. telefono = teléfono;
        esto. fecha_nacimiento = fecha_nacimiento;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public Persona(String nombres, String apellidos, String direccion, String telefono,   String fecha_nacimiento) {
        esto.  nombres = nombres;
        esto. apellidos = apellidos;
        esto.  direccion = direccion;
        esto. telefono = teléfono;
        esto. fecha_nacimiento = fecha_nacimiento;
    
    
}
