/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/17/18
Fecha de terminación:
Objetivo del programa: 
*/


//CONSOLAS PROXIMAS A SALIR 
import java.io.*;
import java.util.*;
class Reporte5 implements Serializable{
	
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
				System.out.println("- Nuestros Proximos Estrenos -\n - No te los pierdas - \n ");
				System.out.println("Fecha de hoy: "+fecha_Hoy+"\n");
				while(true){
				p = (Producto)f2.readObject();
        //    System.out.println(p.getClass());
            if(String.valueOf(p.getClass()).contains("Consola")) {
			
				if (p.getFecha_Lanzamiento().getDay()>fecha_Hoy.getDay() && p.getFecha_Lanzamiento().getMonth()>=fecha_Hoy.getMonth()&& p.getFecha_Lanzamiento().getYear()>=fecha_Hoy.getYear()||p.getFecha_Lanzamiento().getDay()<=fecha_Hoy.getDay() && p.getFecha_Lanzamiento().getMonth()<=fecha_Hoy.getMonth()&& p.getFecha_Lanzamiento().getYear()>fecha_Hoy.getYear()||p.getFecha_Lanzamiento().getDay()<=fecha_Hoy.getDay() && p.getFecha_Lanzamiento().getMonth()>fecha_Hoy.getMonth()&& p.getFecha_Lanzamiento().getYear()>=fecha_Hoy.getYear()||p.getFecha_Lanzamiento().getDay()<=fecha_Hoy.getDay() && p.getFecha_Lanzamiento().getMonth()>fecha_Hoy.getMonth()&& p.getFecha_Lanzamiento().getYear()>=fecha_Hoy.getYear()) {
					System.out.println(p+"\n__________________________________\n");

				}
				}
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