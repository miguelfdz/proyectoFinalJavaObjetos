/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/17/18
Fecha de terminación:
Objetivo del programa: 
*/


//JUEGOS POR CLASIFICACION
import java.io.*;

class Reporte6 implements Serializable{
	public static void main(String[] args) {
		Producto p = null;
			FileInputStream f1=null;
			ObjectInputStream f2=null;
         
        int contador_E=0;
			try{
				f1=new FileInputStream("Productos.dat");
				f2=new ObjectInputStream(f1);




		System.out.println("Qué clasificacion quieres buscar? \n 1(Everyone) 2(Teen) 3(Mature)");
         int ans=Lectura.readInt();           

p = (Producto)f2.readObject();
          
            switch(ans){
            case 1:
				System.out.println("- Juegos Clasificados Como E -\n");
				System.out.println("For Everyone\n");
				while(p != null){
            
            if(String.valueOf(p.getClass()).contains("Videojuego")) {                  
					if (((Videojuego)p).getClasificacion().equalsIgnoreCase("e")) {
						System.out.println(p.toString()+"\n");
                   contador_E++;        
					}}
               p = (Producto)f2.readObject();}
            break;
            case 2:
				System.out.println("- Juegos Clasificados Como T -\n");
				System.out.println("For Teens\n");
				while(p != null){
            if(String.valueOf(p.getClass()).contains("Videojuego")) {                  
					if (((Videojuego)p).getClasificacion().equalsIgnoreCase("t")) {
						System.out.println(p.toString()+"\n");
                   contador_E++;        
               }}
               p = (Producto)f2.readObject();}
            break;
            
            case 3:
				System.out.println("- Juegos Clasificados Como M -\n");
				System.out.println("For Mature\n");
				while(p != null){
            
            if(String.valueOf(p.getClass()).contains("Videojuego")) {                  
					if (((Videojuego)p).getClasificacion().equalsIgnoreCase("m")) {
						System.out.println(p.toString()+"\n");
                   contador_E++;        
					}}
               p = (Producto)f2.readObject();}
            break; 
								
			}  } 
			
		catch(EOFException e){
               System.out.println("Para un total de "+contador_E+" juegos en la categoria");
      System.out.println("Ya termino con el archivo");}
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
