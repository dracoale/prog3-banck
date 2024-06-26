/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.pucp.tienda.model.producto.services;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import pe.edu.pucp.tienda.producto.dao.OfertaDAO;
import pe.edu.pucp.tienda.producto.model.Oferta;
import pe.edu.pucp.tienda.producto.mysql.OfertaMYSQL;

/**
 *
 * @author james
 */
@WebService(serviceName = "OfertaWS", targetNamespace = "http://services.usuario.model.tienda.pucp.edu.pe/")
public class OfertaWS {
    private OfertaDAO ofertadao;
    /**
     * This is a sample web service operation
     * @param oferta
     * @return 
     */
    @WebMethod(operationName = "insertarOferta")
    public int insertarOferta(@WebParam(name = "oferta") Oferta oferta) {
        int resultado = 0;
        try{
            ofertadao = new OfertaMYSQL();
            resultado = ofertadao.insertar(oferta);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return resultado;
    }
    @WebMethod(operationName = "actualizarOferta")
    public int actualizarOferta(@WebParam(name = "oferta") Oferta oferta) {
        int resultado = 0;
        try{
            ofertadao = new OfertaMYSQL();
            resultado = ofertadao.actualizar(oferta);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return resultado;
    }
    @WebMethod(operationName = "eliminarOferta")
    public int eliminarOferta(@WebParam(name = "idOferta") int idOferta) {
        int resultado = 0;
        try{
            ofertadao = new OfertaMYSQL();
            resultado = ofertadao.eliminar(idOferta);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return resultado;
    }
}
