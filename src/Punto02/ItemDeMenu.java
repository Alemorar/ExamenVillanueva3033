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
public class ItemDeMenu {
    private int idItem;
    private String nombre;
    private String descripcion;
    private double precio;

    public ItemDeMenu() {
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "\n" + idItem + "\t" + nombre + "\t" + descripcion + "\t" + precio;
    }
}
