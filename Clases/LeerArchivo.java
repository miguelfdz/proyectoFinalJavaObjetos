import java.io.*;
import java.util.Arrays; 
class Leer_Clientes implements Serializable{

     public static void main (String args[])throws Exception{
      
      try{
         FileInputStream fis=new FileInputStream("Productos.dat");
ObjectInputStream ois=new ObjectInputStream(fis);

         boolean fin = false;
         while (fin!=true){
         Producto c1= (Producto)ois.readObject();
            System.out.println(c1.toString()+"\n");
          

      }
          
          
         Producto c1 = (Producto)ois.readObject();
            if(c1==null){
               fin = true;
            }
        
   ois.close();
   fis.close();
      }
      catch(IOException e){System.out.println("Fin del archivo");}
   }
}