/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 9/18/18
Fecha de terminación:
Objetivo del programa: 
*/
import java.io.*;

class Nombre implements Serializable{
private String nombre;
private String app;
private String apm;

	public Nombre (String nombre, String app, String apm){
		setNombre(nombre);
		setApp(app);
		setApm(apm);
	}

	//Constructor para facturas sin valores de atributos 
	public Nombre (){
	}

	//SETS	
	public void setNombre(String nombre)
	{
	this.nombre=nombre;
	}
	
	public void setApp(String app)
	{
	this.app=app;
	}
	
	public void setApm(String apm)
	{
	this.apm=apm;
	}
	
	//GETS
	public String getNombre(){
	return nombre;
	}
	
	public String getApp(){
	return app;
	}
	
	public String getApm(){
	return apm;
	}
	
	//Desplegar objeto
	public String toString(){
		return getNombre()+" "+getApp()+" "+getApm();
	}

}