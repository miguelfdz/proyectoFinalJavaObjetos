/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 9/18/18
Fecha de terminación:
Objetivo del programa: 
*/

import java.io.*;

class Domicilio implements Serializable{

private String calle;
private String num_Exterior;
private String num_Interior;
private String colonia;
private String entre_Calles;
private int cp;
private String municipio;

	
	public Domicilio (String calle, String num_Exterior, String num_Interior, String colonia, int cp, String municipio){
		setCalle(calle);
		setNumExterior(num_Exterior);
		setNumInterior(num_Interior);
		setColonia(colonia);
		setEntreCalles(entre_Calles);
		setCodigoPostal(cp);
		setMunicipio(municipio);
	}
	
	//Para objetos pre definidos
	public Domicilio (){
	}
	
	//SETS	
	public void setCalle(String calle)
	{
	this.calle=calle;
	}
	
	public void setNumExterior(String num_Exterior)
	{
	this.num_Exterior=num_Exterior;
	}
	
	public void setNumInterior(String num_Interior)
	{
	this.num_Interior=num_Interior;
	}
	
	public void setColonia(String colonia)
	{
	this.colonia=colonia;
	}
	
	public void setEntreCalles(String entre_Calles)
	{
	this.entre_Calles=entre_Calles;
	}
	
	public void setCodigoPostal(int cp)
	{
	this.cp=cp;
	}
	
	public void setMunicipio(String municipio)
	{
	this.municipio=municipio;
	}
	
	//GETS
	public String getCalle()
	{
	return calle;
	}
	
	public String getNumExterior()
	{
	return num_Exterior;
	}
	
	public String getNumInterior()
	{
	return num_Interior;
	}
	
	public String getColonia()
	{
	return colonia;
	}
	
	public String getEntreCalles()
	{
	return entre_Calles;
	}
	
	public int getCodigoPostal()
	{
	return cp;
	}
	
	public String getMunicipio()
	{
	return municipio;
	}
	
	//Desplegar objeto
	public String toString(){
		return getCalle()+"\t#"+getNumExterior()+"\t#"+getNumInterior()+"\t"+getColonia()+"\t"+getCodigoPostal()+"\t"+getMunicipio();
	}
	
}