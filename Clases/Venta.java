/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 9/19/18
Fecha de terminación:
Objetivo del programa: 
*/


import java.io.*;

class Venta implements Comparable <Venta>{
private String nombre;
private int cantidad;

	public Venta(String nombre, int cantidad) {
		setNombre(nombre);
		setCantidad(cantidad);
	}
	
	//Para objetos pre definidos
	public Venta() {
	}
	
	//SETS	
	public void setNombre(String nombre)
	{
	this.nombre=nombre;
	}

	public void setCantidad(int cantidad)
	{
	this.cantidad=cantidad;
	}

	
	//GETS
	public String getNombre(){
	return nombre;
	}	

	public int getCantidad(){
	return cantidad;
	}	
	
 @Override
public int compareTo(Venta comparestu) {
        int compare_Venta=((Venta)comparestu).getCantidad();
        /* For Ascending order*/
        return compare_Venta-this.cantidad;
        }
        
        
           
	//Desplegar objeto
	public String toString(){
		return getNombre()+" "+getCantidad();
	}
}