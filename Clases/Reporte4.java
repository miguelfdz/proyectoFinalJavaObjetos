/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/17/18
Fecha de terminación:
Objetivo del programa: 
*/


//ESTRENOS
import java.io.*;
import java.util.*;
class Reporte4 implements Serializable{
	
	public static void main(String[] args) {
		Producto p = null;

            //Fecha
            Calendar cal = Calendar.getInstance();
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            
            Fecha fecha_Hoy= new Fecha(day,month,year);

			FileInputStream f1=null;
			ObjectInputStream f2=null;
			int i = 1;
			try{
				f1=new FileInputStream("Productos.dat");
				f2=new ObjectInputStream(f1);
				System.out.println("- Nuestros Estrenos de Hoy-\n");
				while(true){
				p = (Producto)f2.readObject();
            
            if(p.getFecha_Lanzamiento().toString().equalsIgnoreCase(fecha_Hoy.toString())){

				System.out.println(p+"\n__________________________________\n");}
				}
				}   
			
		catch(EOFException e){System.out.println("Ya termino con el archivo");}
		catch (NullPointerException e){System.out.println("Error en objeto");}      
		catch (IOException e){System.out.println("No se almaceno informacion");}
		catch(ClassNotFoundException e){System.out.println("Hay un error en la clase");}

		finally{
			try{ f2.close();
				  f1.close();
				}
			catch(IOException e){System.out.println("Error al cerrar el archivo");}
				 }
	}
}