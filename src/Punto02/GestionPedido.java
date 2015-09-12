/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02;

import java.util.Date;
/**
 *
 * @author nahuel
 */
public class GestionPedido {
    
    public static void main(String[] args){
        Pedido unPedido = new Pedido();
        unPedido.setIdPedido(1);
        unPedido.setNumeroMesa(5);
        unPedido.setMozo("Juan Carlos");
        unPedido.setFecha(new Date());
        
        DetallePedido detalle1 = new DetallePedido();
        DetallePedido detalle2 = new DetallePedido();
        DetallePedido detalle3 = new DetallePedido();
        
        ItemDeMenu item1 = new ItemDeMenu();
        item1.setIdItem(10);
        item1.setNombre("minuta");
        item1.setDescripcion("mila c/frit");
        item1.setPrecio(65.00);
        
        ItemDeMenu item2 = new ItemDeMenu();
        item2.setIdItem(20);
        item2.setNombre("pasta");
        item2.setDescripcion("knelo c/pec");
        item2.setPrecio(55.00);
        
        ItemDeMenu item3 = new ItemDeMenu();
        item3.setIdItem(30);
        item3.setNombre("bebida");
        item3.setDescripcion("gaseo 1.1/2");
        item3.setPrecio(20.00);
        
        detalle1.setIdDetalle(1);
        detalle1.setUnItem(item1);
        detalle1.setPrecioUnitario(item1.getPrecio());
        detalle1.setCantidad(2);
        
        detalle2.setIdDetalle(2);
        detalle2.setUnItem(item2);
        detalle2.setPrecioUnitario(item2.getPrecio());
        detalle2.setCantidad(1);
        
        detalle3.setIdDetalle(3);
        detalle3.setUnItem(item3);
        detalle3.setPrecioUnitario(item3.getPrecio());
        detalle3.setCantidad(1);
        
        
        
        unPedido.agregarDetalle(detalle1);
        unPedido.agregarDetalle(detalle2);
        unPedido.agregarDetalle(detalle3);
        
        System.out.println(unPedido);
             
    
    }
    
//    unPe.dido.setFecha(new Date());
    
}
