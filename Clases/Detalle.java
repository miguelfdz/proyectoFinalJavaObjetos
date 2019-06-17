/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 9/19/18
Fecha de terminación:
Objetivo del programa: 
*/
import java.io.*;
import java.util.*;
import java.text.*;

class Detalle implements Serializable{
private Producto producto;
private int cantidad;

	public Detalle(Producto producto, int cantidad) {
		setProducto(producto);
		setCantidad(cantidad);
	}
	
	//Para objetos pre definidos
	public Detalle() {
		this.producto = null;
		this.cantidad = 0;
	}
	
	//SETS	
	public void setProducto(Producto producto)
	{
	this.producto=producto;
	}

	public void setCantidad(int cantidad)
	{
	this.cantidad=cantidad;
	}

	
	//GETS
	public Producto getProducto(){
	return producto;
	}	

	public int getCantidad(){
	return cantidad;
	}	
	
	//Metodos de instancia
	public double calcularImporte(){
		return cantidad*producto.getPrecio();
	}
	
	//Desplegar objeto
	public String toString(){
      DecimalFormat dosD=new DecimalFormat("0.00");
		System.out.printf( "%-15s %-40s %-15s %-15s %-15s %n", "CLAVE", "NOMBRE", "CANTIDAD", "PRECIO", "IMPORTE");
		System.out.printf( "%-15s %-40s %-15s %-15s %-15s %n", producto.getClave(), producto.getNombre(), cantidad, dosD.format(producto.getPrecio()), "$"+dosD.format(calcularImporte()));
		return "";
	}
}