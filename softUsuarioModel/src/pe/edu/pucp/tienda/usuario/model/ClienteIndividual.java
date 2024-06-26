/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.tienda.usuario.model;

import java.util.Date;

/**
 *
 * @author james
 */
public class ClienteIndividual extends Usuario{
    private String DNI;
    
    public ClienteIndividual(){}
    
    public ClienteIndividual(Date fechaRegistro,String nombre, String telefono, String correo, EstadoCuenta estadocuenta, Date fechaCreacion, String nombreUsuario, String contraseña, String apellidoPaterno, String apellidoMaterno,String DNI) {
        super(fechaRegistro, nombre,telefono,correo,estadocuenta,fechaCreacion,nombreUsuario,
                contraseña,apellidoPaterno,apellidoMaterno,TipoUsuario.USER_NATURAL);
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void actualizarDNI(String DNI){
        setDNI(DNI);
    }
}
