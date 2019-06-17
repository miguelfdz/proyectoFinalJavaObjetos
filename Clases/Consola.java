import java.io.*;
import java.util.*;
import java.text.*;
 class Consola extends Producto implements Serializable{
   private String almacenamiento;

   public Consola (String nombre, double precio, int clave, String marca, Fecha fecha_Lanzamiento, String almacenamiento,int cantidad){
      super(nombre,precio,clave,marca,fecha_Lanzamiento,cantidad);
      setAlmacenamiento(almacenamiento);
   }
   
        public void setAlmacenamiento(String almacenamiento){
      this.almacenamiento=almacenamiento;
   }
   public String getAlmacenamiento(){
      return almacenamiento;
   }
   
public String toString(){
      return "Nombre: "+super.getNombre()+"\nPrecio: "+super.getPrecio()+"\nClave: "+super.getClave()+"\nMarca: "+super.getMarca()+"\nFecha de lanzamiento: "+super.getFecha_Lanzamiento()+"\nAlmacenamiento de Consola: "+getAlmacenamiento()+"\nCantidad: "+getCantidad();
   }
}