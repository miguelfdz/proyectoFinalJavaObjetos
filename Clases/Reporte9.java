/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/17/18
Fecha de terminación:
Objetivo del programa: 
*/


//VENTAS POR CONSOLA
import java.io.*;
import java.util.*;
class Reporte9 implements Serializable{
	public static void main(String[] args) {
		Producto p = null;
	   Detalle d = null;	
      Venta venta=null;
		ArrayList<Venta> ventas = new ArrayList<Venta>();
	FileInputStream f1=null;
			ObjectInputStream f2=null;
			FileInputStream f3=null;
			ObjectInputStream f4=null;
		try{


				f1=new FileInputStream("Clientes.dat");
				f2=new ObjectInputStream(f1);
            
				f3=new FileInputStream("Ventas.dat");
				f4=new ObjectInputStream(f3);
            
    
        
			d = (Detalle) f4.readObject();
  
       
			while (d != null) {
         Venta v1= new Venta(d.getProducto().getMarca(),d.getCantidad());
         ventas.add(v1);
				d = (Detalle) f4.readObject();
			}       
          


}			
		catch(EOFException e){

int contador_PS4=0;
int contador_XBOX=0;
int contador_Nintendo=0;

System.out.println("Nuestras Ventas Fueron:\n\n");

for (int i = 0; i < ventas.size(); i++) {

   if(ventas.get(i).getNombre().equalsIgnoreCase("ps4")){
contador_PS4+=ventas.get(i).getCantidad();
   }
   else if(ventas.get(i).getNombre().equalsIgnoreCase("xbox")){
contador_XBOX+=ventas.get(i).getCantidad();
   }
   else if(ventas.get(i).getNombre().equalsIgnoreCase("nintendo")){
contador_Nintendo+=ventas.get(i).getCantidad();
   }
   System.out.printf( "%-8s %-20s %-8s %5s %n","Producto", ventas.get(i).getNombre(),"Cantidad", ventas.get(i).getCantidad());
	 }
    
ArrayList<Venta> ordenar = new ArrayList<Venta>();
Venta venta_PS4=new Venta("PS4",contador_PS4);
Venta venta_Xbox=new Venta("XBOX",contador_XBOX);
Venta venta_Nintendo=new Venta("Nintendo",contador_Nintendo);	
ordenar.add(venta_PS4);
ordenar.add(venta_Xbox);
ordenar.add(venta_Nintendo);

Collections.sort(ordenar);

System.out.println("\n\n- Las mayores ventas por consola fueron -\n");

for (int i = 0; i < ordenar.size(); i++) {
   System.out.printf( "%-8s %-20s %-8s %5s %n","Producto", ordenar.get(i).getNombre(),"Cantidad", ordenar.get(i).getCantidad());
  }      
      System.out.println("\nYa termino con el archivo");}
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