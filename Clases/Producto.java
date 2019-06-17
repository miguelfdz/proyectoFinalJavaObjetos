import java.io.*;
import java.util.*;
import java.text.*;

abstract class Producto implements Serializable{
   protected String nombre;
   protected double precio;
   protected int clave;
   protected String marca;
   protected Fecha fecha_Lanzamiento;
   protected int cantidad;
   
   public Producto (String nombre, double precio, int clave, String marca, Fecha fecha_Lanzamiento, int cantidad ){
      setNombre(nombre);
      setPrecio(precio);
      setClave(clave);
      setMarca(marca);
      setFecha_Lanzamiento(fecha_Lanzamiento);
      setCantidad(cantidad);
   }
   
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   public String getNombre(){
      return nombre;
   }

   public void setPrecio(double precio){
      this.precio=precio;
   }
   public double getPrecio(){
      return precio;
   }
   
   public void setClave(int clave){
      this.clave=clave;
   }
   public int getClave(){
      return clave;
   }
   
   public void setMarca(String marca){
      this.marca=marca;
   }
   public String getMarca(){
      return marca;
   }  
   
      public void setFecha_Lanzamiento(Fecha fecha_Lanzamiento){
      this.fecha_Lanzamiento=fecha_Lanzamiento;
   }
   public Fecha getFecha_Lanzamiento(){
      return fecha_Lanzamiento;
   } 
   
      public void setCantidad(int cantidad){
      this.cantidad=cantidad;
   }
   public int getCantidad(){
      return cantidad;
   } 
}
   
   
   
  




