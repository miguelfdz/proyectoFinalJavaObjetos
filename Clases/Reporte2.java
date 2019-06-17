/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/17/18
Fecha de terminación:
Objetivo del programa: 
*/


//ACCESORIOS POR PLATAFORMA
import java.io.*;

class Reporte2 implements Serializable{
	public static void main(String[] args) {
		Producto p = null;
			FileInputStream f1=null;
			ObjectInputStream f2=null;
         
         
			try{
				f1=new FileInputStream("Productos.dat");
				f2=new ObjectInputStream(f1);



		System.out.println("Qué filtro de marca deseas buscar? \n 1(Xbox) 2(PS4) 3(Nintendo)");
         int ans=Lectura.readInt();           
				p = (Producto)f2.readObject();
            
            switch(ans){
            case 1:
				System.out.println("- ACCESORIOS POR PLATAFORMA -\n");
				System.out.println("XBOX\n");
				while(p != null){
      if(String.valueOf(p.getClass()).contains("Accesorio")) {                  
					if (p.getMarca().equalsIgnoreCase("xbox")) {
						System.out.println(p.toString()+"\n");
					}}
               p = (Producto)f2.readObject();}
            break;
            case 2:
				System.out.println("- ACCESORIOS POR PLATAFORMA -\n");
				System.out.println("PS4\n");
				while(p != null){
      if(String.valueOf(p.getClass()).contains("Accesorio")) {                  

					if (p.getMarca().equalsIgnoreCase("ps4")) {
						System.out.println(p.toString()+"\n");
					}}
               p = (Producto)f2.readObject();}
            break;
            
            case 3:
				System.out.println("- ACCESORIOS POR PLATAFORMA -\n");
				System.out.println("NINTENDO\n");
				while(p != null){
      if(String.valueOf(p.getClass()).contains("Accesorio")) {                  
					if (p.getMarca().equalsIgnoreCase("nintendo")) {
						System.out.println(p.toString()+"\n");
					}}
               p = (Producto)f2.readObject();}
            break; 
								
			}  } 
			
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
