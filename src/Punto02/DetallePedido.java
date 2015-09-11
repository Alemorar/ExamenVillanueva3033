/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02;

/**
 *
 * @author nahuel
 */
public class DetallePedido {
    private ItemDeMenu unItem;
    private int idDetalle;
    private double precioUnitario;
    private int cantidad;

    public DetallePedido() {
    }
    
    public double calcularSubtotal(){
        return cantidad * precioUnitario;
    }

    public ItemDeMenu getUnItem() {
        return unItem;
    }

    public void setUnItem(ItemDeMenu unItem) {
        this.unItem = unItem;
    }
    
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "\n" + unItem.getIdItem() + "\t" + unItem.getNombre() + "\t\t" + precioUnitario + "\t" + cantidad + "\t\t" + calcularSubtotal();
    }
    
}
