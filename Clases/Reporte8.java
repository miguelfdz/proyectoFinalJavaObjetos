/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/17/18
Fecha de terminación:
Objetivo del programa: 
*/


//VENTAS POR VIDEOJUEGO
import java.io.*;
import java.util.*;
import java.text.*;

class Reporte8 implements Serializable {
	public static void main(String[] args) {
	Detalle d = null;	
		ArrayList<Venta> ventas = new ArrayList<Venta>();
		try {
			FileInputStream f1 = new FileInputStream("Ventas.dat");
			ObjectInputStream f2 = new ObjectInputStream(f1);
			d = (Detalle) f2.readObject();
			
			while (d != null) {
         Venta v1= new Venta(d.getProducto().getNombre(),d.getCantidad());
         ventas.add(v1);
				d = (Detalle) f2.readObject();
			}
         
         


			
			f2.close();
			f1.close();
			
		} catch (IOException e) {
    System.out.println("\n\nNuestros Prodcutos Top en ventas:\n\n");
         Collections.sort(ventas);

for (int i = 0; i < ventas.size(); i++) {
   System.out.printf( "%-18s %-40s %-8s %5s %n","Videojuego/Accesorio:", ventas.get(i).getNombre(),"Cantidad", ventas.get(i).getCantidad());
	 }			
    
    System.out.println("Fin del archivo");
			
		} catch (ClassNotFoundException c) {
			System.out.println("No se encontro la clase de");
		}
	}
}