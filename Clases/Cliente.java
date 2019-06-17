import java.io.*;

/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 11/2/18
Fecha de terminación:
Objetivo del programa: 
*/


class Cliente implements Serializable{
	Nombre nom;
	Fecha fecha_Registro;
	Domicilio dom;
	
	public Cliente (Nombre nom, Fecha fecha_Registro, Domicilio dom){
		setNombre(nom);
		setFechaRegistro(fecha_Registro);
		setDomicilio(dom);
	}
	
	//SETS
	public void setNombre(Nombre nom){
		this.nom = nom;
	}
	
	public void setFechaRegistro(Fecha fecha_Registro){
		this.fecha_Registro = fecha_Registro;
	}
	
	public void setDomicilio(Domicilio dom){
		this.dom = dom;
	}

	
	//GETS
	public Nombre getNombre(){
		return nom;
	}
	
	public Fecha getFechaRegistro(){
		return fecha_Registro;
	}
	
	public Domicilio getDomicilio(){
		return dom;
	}
	
	//PrintObject
	public String toString(){		
		System.out.println("\nNombre de cliente: "+nom);
		System.out.println("Fecha de registro: "+fecha_Registro);
		System.out.println("Domicilio: \n"+dom);
		return "";	
	}
	
}