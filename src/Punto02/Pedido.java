/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nahuel
 */
public class Pedido {
    private int idPedido;
    private int numeroMesa;
    private String mozo;
    private Date fecha;
    private ArrayList<DetallePedido> detalle;

    public Pedido() {
        detalle = new ArrayList<DetallePedido>();
    }
    
    public void agregarDetalle(DetallePedido dp){
        detalle.add(dp);
    }
    
    public double calcularTotal(){
        double total = 0.0;
        for (DetallePedido dp: detalle){
            total = total + dp.calcularSubtotal();
        }
        return total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        String salida = "";
        salida = "\nNumero Pedido: " + idPedido;
        salida = salida + "\nNº de Mesa: " + numeroMesa;
        salida = salida + "\nMozo: " + mozo;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy h:mm:ss");
        salida = salida + "\nFecha: " + sdf.format(fecha) + "\n";
        salida = salida + "\nidItem" + "\tNombre" + "\tDescripcion" + "\tPrecio" + "\tCant." + "\tSubTotal";
        for (DetallePedido dp:detalle){
            salida = salida + dp.toString();
        }
        salida = salida + "\n\t\t\t\t\t----------------";
        salida = salida + "\n\t\t\t\t\tTotal:\t" + calcularTotal();
        return salida;
    }
}
