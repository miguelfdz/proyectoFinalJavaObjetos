import java.io.*;
import java.util.*;
import java.text.*;
 class Videojuego extends Producto implements Serializable{
   private String clasificacion;

   public Videojuego (String nombre, double precio, int clave, String marca, Fecha fecha_Lanzamiento, String clasificacion, int cantidad){
      super(nombre,precio,clave,marca,fecha_Lanzamiento,cantidad);
      setClasificacion(clasificacion);
   }
   
   public void setClasificacion(String clasificacion){
      this.clasificacion=clasificacion;
   }
   
   public String getClasificacion(){
      return clasificacion;
   }
   
public String toString(){
      return "Nombre: "+super.getNombre()+"\nPrecio: "+super.getPrecio()+"\nClave: "+super.getClave()+"\nMarca: "+super.getMarca()+"\nFecha de lanzamiento: "+super.getFecha_Lanzamiento()+"\nClasificacion "+getClasificacion()+"\nCantidad "+getCantidad();
   }
}