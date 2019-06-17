/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/17/18
Fecha de terminación:
Objetivo del programa: 
*/


//GENERAR FACTURA 
import java.io.*;
import java.util.*;
class Reporte7 implements Serializable{
	public static void main(String[] args) {
		Producto p = null;
      Cliente c= null;
      Factura factu=null;
      Detalle dF =null;


      //Fecha
            Calendar cal = Calendar.getInstance();
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            
            Fecha fecha_Hoy= new Fecha(day,month,year);
         
			FileInputStream f1=null;
			ObjectInputStream f2=null;
			FileInputStream f3=null;
			ObjectInputStream f4=null;	
        try{


				f1=new FileInputStream("Clientes.dat");
				f2=new ObjectInputStream(f1);
            
				f3=new FileInputStream("Productos.dat");
				f4=new ObjectInputStream(f3);
            
	System.out.println("Nombre del cliente que va a facturar");
       String nombre=Lectura.readString(); 
       
 //Detalle de la Factura
 
 int clave;
        int cantidad;
p = (Producto)f4.readObject();
 System.out.println("Ingresa la clave del producto");                     
  clave= Lectura.readInt();
        
 System.out.println("Ingresa la cantidad del producto");                               
  cantidad= Lectura.readInt();
               
 System.out.println("Ingresa folio de la factura");                               
  String folio= Lectura.readString();
  
   while(p.getClave() != clave){
 p = (Producto)f4.readObject();

		if (p.getClave()==clave) {
       dF = new Detalle(p, cantidad);}
}
           

c = (Cliente)f2.readObject();

while(c != null){
					if (String.valueOf(c.getNombre().getNombre()).equalsIgnoreCase(nombre)) {
						factu= new Factura(c,fecha_Hoy,dF,folio);
                  System.out.println("\n\n"+factu+"\n\n");}
               c = (Cliente)f2.readObject();}


}			
		catch(EOFException e){System.out.println("\nYa termino con el archivo");}
		catch (NullPointerException e){System.out.println("\nError en objeto");}      
		catch (IOException e){System.out.println("\nNo se almaceno informacion");}
		catch(ClassNotFoundException e){System.out.println("\nHay un error en la clase");}

		finally{
			try{ f2.close();
				  f1.close();
				}
			catch(IOException e){System.out.println("Error al cerrar el archivo");}
		}
	}
}
