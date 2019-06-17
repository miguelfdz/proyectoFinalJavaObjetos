import java.io.*;
import java.util.*;
import java.text.*;
 class Accesorio extends Producto implements Serializable{

   public Accesorio (String nombre, double precio, int clave, String marca, Fecha fecha_Lanzamiento,int cantidad){
      super(nombre,precio,clave,marca,fecha_Lanzamiento,cantidad);
   }
      
public String toString(){
      return "Nombre: "+super.getNombre()+"\nPrecio: "+super.getPrecio()+"\nClave: "+super.getClave()+"\nMarca: "+super.getMarca()+"\nFecha de lanzamiento: "+super.getFecha_Lanzamiento()+"\nCantidad: "+super.getCantidad();
   }
}