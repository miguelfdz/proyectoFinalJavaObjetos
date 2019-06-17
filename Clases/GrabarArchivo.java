import java.io.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GrabarArchivo implements Serializable{

   public static void main(String arg[]){
      
   	JPanel panel =null;
   	JLabel label2 = null;
   	JTextField user =null;
   	JLabel label = null;
   	JPasswordField pass=null;
   	String pw="";
   	
      String nombre_Producto="";
      double precio;
      int clave;
      String marca="";
      String almacenamiento="";
      String clasificacion="";
      int dia;
      int mes;
      int anio;
      int cantidad;
      Producto pa=null;
      Videojuego vid=null;
      Accesorio acc=null;
      Consola con=null;
               
       FileOutputStream f1=null;
       ObjectOutputStream f2=null;
       ObjectOutputStream f3=null;
       ObjectOutputStream f4=null;
       String ans = "si";
   
               
                  do {
   		panel = new JPanel();
   		label2 = new JLabel("Usuario:");
   		user = new JTextField(10);
   		label = new JLabel("Contrasena:");
   		pass = new JPasswordField(10);
   		panel.add(label2);
   		panel.add(user);
   		panel.add(label);
   		panel.add(pass);
   		String[] options = new String[]{"OK", "Cancelar"};
   		int option = JOptionPane.showOptionDialog(null, panel, "Inicio",
   		                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
   		                         null, options, options[1]);
   		if(option == 1) // pressing OK button
   		{
   		    char[] password = pass.getPassword();
   		    pw=new String(password);
   		    System.out.println("Usuario: " + user.getText());
   		    System.out.println("Password: " + new String(password));
   		}
   	}while(!user.getText().equals("udem")||!pw.equals("final"));
      System.out.println("\nBienvenido!");
   		

      
      String resp = "";
     
		do{
	         System.out.println("EPIC GAMER UNIVERSE\n\nSelecciona una se las siguientes opciones\n");
	         System.out.println("1. Productos 1");
	         System.out.println("2. Clientes 2");

           
	         int op = Lectura.readByte();
	         switch(op){
	         
	            case 1:
               System.out.println("Productos R1");

               
               try{
               f1= new FileOutputStream ("Productos4.dat");
               f2= new ObjectOutputStream (f1);
               f3= new ObjectOutputStream (f1);
               f4= new ObjectOutputStream (f1);
while (ans.equalsIgnoreCase("si")){
 
            //Fecha
            Calendar cal = Calendar.getInstance();
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
         
            Fecha fe = new Fecha(day,month,year);
         
            //Tiempo   
           
    
   System.out.println("Que Producto se desea registrar (1 Consola) (2 Videojuego) (3 Accesorio)");
   int categoria=Lectura.readInt();

switch(categoria){
   case 1:
    System.out.println("Nombre de la consola");
   nombre_Producto= Lectura.readString();
   
    System.out.println("Marca de la consola");
   marca= Lectura.readString();
   
   System.out.println("Cual es su precio");
     precio=Lectura.readDouble(); 
    
    System.out.println("clave de la consola");
   clave = Lectura.readInt();
   
		System.out.println("Ingresa el dia de lanzamiento");
			 dia=Lectura.readInt();
			
		System.out.println("Ingresa el mes (1 - 12) de lanzamiento");
			 mes=Lectura.readInt();
			
		System.out.println("Ingresa el año de lanzamiento");
			 anio=Lectura.readInt();
         
   Fecha fec1 = new Fecha(dia,mes,anio);

         
      System.out.println("Capacidad de almacenamiento de la consola");
   almacenamiento= Lectura.readString();
   
       System.out.println("Cantidad de consolas a registrar");
   cantidad = Lectura.readInt();
   
    con=new Consola(nombre_Producto,precio,clave,marca,fec1,almacenamiento,cantidad);
   System.out.println(con);
    f2.writeObject(con);

   break;
   
   case 2:
   
     System.out.println("Nombre del videojuego ");
   nombre_Producto= Lectura.readString();
   
    System.out.println("Marca de la videojuego");
   marca= Lectura.readString();
   
   System.out.println("Cual es su precio");
     precio=Lectura.readDouble(); 
    
    System.out.println("clave de la videojuego");
   clave = Lectura.readInt();
   
		System.out.println("Ingresa el dia de lanzamiento");
			 dia=Lectura.readInt();
			
		System.out.println("Ingresa el mes (1 - 12) de lanzamiento");
			 mes=Lectura.readInt();
			
		System.out.println("Ingresa el año de lanzamiento");
			 anio=Lectura.readInt();
         
   Fecha fec2 = new Fecha(dia,mes,anio);

         
      System.out.println("Clasificacion del videojuego");
   clasificacion= Lectura.readString();
   
       System.out.println("Cantidad de videojuegos a registrar");
   cantidad = Lectura.readInt();
  
    vid=new Videojuego(nombre_Producto,precio,clave,marca,fec2,clasificacion,cantidad);
   System.out.println(vid);
    f3.writeObject(vid);

   break;
   
      case 3:
   
     System.out.println("Nombre del accesorios ");
   nombre_Producto= Lectura.readString();
   
    System.out.println("Marca del accesorios");
   marca= Lectura.readString();
   
   System.out.println("Cual es su precio");
     precio=Lectura.readDouble(); 
    
    System.out.println("clave de la accesorios");
   clave = Lectura.readInt();
   
		System.out.println("Ingresa el dia de lanzamiento");
			 dia=Lectura.readInt();
			
		System.out.println("Ingresa el mes (1 - 12) de lanzamiento");
			 mes=Lectura.readInt();
			
		System.out.println("Ingresa el año de lanzamiento");
			 anio=Lectura.readInt();
         
   Fecha fec3 = new Fecha(dia,mes,anio);

          System.out.println("Cantidad de accesorios a registrar");
   cantidad = Lectura.readInt();
   
    acc=new Accesorio(nombre_Producto,precio,clave,marca,fec3,cantidad);
   System.out.println(acc);
    f4.writeObject(acc);

   break;}
   
      System.out.println("Desea ingresar otro producto?");
   ans = Lectura.readString();


         }


               }
               
               catch (IOException e){System.out.println("No se almaceno informacion");}
               finally{
      
               try{ f2.close();
               f1.close();
               }
               catch(IOException e){System.out.println("Error al cerrar el archivo");}
               }
	               break;
	            
  /////////////////////////////////////////////////////////////////////////////////////////////////////             
               
	               case 2: 
            
               Reporte4();
               
               
 ////////////////////////////////////////////////////////////////////////////////////////////////              
	               break;
	                          
 ////////////////////////////////////////////////////////////////////////////////////////////////              
         
        	         default: System.out.println("Error. No seleccionaste ninguna opcion."); 
	               break;
	               }
	         System.out.println("Continuar? si/no");
	         resp=Lectura.readString();
	      }while(resp.equalsIgnoreCase("si"));
      
      }
 ////////////////////////////////////////////////////////////////////////////////////////////////              
     
     public static void Reporte4() {

         
      if (new File("Clientes.dat").exists()){
      }
      else{ FileOutputStream f1=null;
         ObjectOutputStream f2=null;
         try{
            f1=new FileOutputStream("clientes.dat");
            f2=new ObjectOutputStream(f1);
         }
         catch(IOException e){System.out.println("No se guardo");}
         finally{
            try{
               f2.close();
               f1.close();
            }
            catch(IOException e){System.out.println("Error al cerrar el archivo");}
         }
      }
      
        
      String resp="";
      Cliente c1=null;
      ArrayList<Cliente> cliente=new ArrayList<Cliente>();
       
      FileInputStream f3=null;
      ObjectInputStream f4=null;
      try{
         
         f3=new FileInputStream("Clientes.dat");
         f4=new ObjectInputStream(f3);
         while(true){
            cliente.add((Cliente)f4.readObject());
            
         }
      }
      catch(EOFException e){System.out.print("");} 
      catch(NullPointerException e){System.out.println("Error en objeto");}  
      catch(IOException e){System.out.println("No se guardo");}
         
      catch(ClassNotFoundException e){System.out.println("Error en clase");}  
      finally{
         try{
            f4.close();
            f3.close();
         }
         catch(IOException e){System.out.println("Error al cerrar el archivo");}
      }
      
      
      FileOutputStream f1=null;
      ObjectOutputStream f2=null;
   
      try{
         f1=new FileOutputStream("Clientes.dat");
         f2=new ObjectOutputStream(f1);
      
         do{
            System.out.println ("Ingrese su nombre completo ");
            String nom=Lectura.readString();
         
            String nomarr[]= nom.split(" ");
         
            String name=nomarr[0];
            String lastname1=nomarr[1];
            String lastname2=nomarr[2];
            
      //Dirección
   System.out.println("Ingresa tu Calle (Dirección)");
   String calle=Lectura.readString();
   
   System.out.println("Ingresa tu Numero (Dirección)");
   String numeroExt=Lectura.readString();
   
      System.out.println("Ingresa tu Numero interior (Dirección)");
   String numeroInt=Lectura.readString();

   System.out.println("Ingresa tu Colonia (Dirección)");
   String colonia=Lectura.readString();
   
   //Datos del Cliente
 
 System.out.println("Ingresa tu codigo postal (Dirección)");
   int cp=Lectura.readInt();
   
   System.out.println("Ingresa su Municipio (Dirección)");
   String municipio=Lectura.readString();


Domicilio d1= new Domicilio (calle,numeroExt,numeroInt,colonia,cp,municipio);
            
            //Fecha
            Calendar cal = Calendar.getInstance();
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
         
            Fecha fe = new Fecha(day,month,year);
                
           Nombre nom_cliente = new Nombre(name,lastname1,lastname2);
                           
            c1 = new Cliente(nom_cliente,fe,d1);    
            cliente.add(c1);
            System.out.println("Agregar otro cliente si o no");
            resp=Lectura.readString();
         
         }while(resp.equalsIgnoreCase("si"));
         for(int i=0;i<cliente.size();i++)
            f2.writeObject(cliente.get(i)); 
         
      }
      catch(IOException e){System.out.println("No se guardo");}
      finally{
         try{
            f2.close();
            f1.close();
         }
         catch(IOException e){System.out.println("Error al cerrar el archivo");}
      }
   
   }
 
 
      
        
   }
   
      