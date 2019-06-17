/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 9/18/18
Fecha de terminación:
Objetivo del programa: 
*/

import java.io.*;

class Factura implements Serializable{
  private String folio;
   private Cliente c2;
   private Fecha f1;
   private Detalle d1;



   //Constructor
   public Factura (Cliente c2,Fecha f1,Detalle d1,String folio) {

         setFolio(folio);      
         setC2(c2);
         setF1(f1);
         setDetalle1(d1);

        }
        
         public void setFolio(String folio){
   this.folio=folio;
	}

  public String getFolio(){
   return folio;
	}
   
     public void setC2(Cliente c2){
   this.c2=c2;
	}
   
     public Cliente getC2(){
   return c2;
	}
   
     public void setF1(Fecha f1){
   this.f1=f1;
	}
   
     public Fecha getF1(){
   return f1;
	}
   

   
   public void setDetalle1(Detalle d1){
   this.d1=d1;}
   
   public Detalle getDetalle1(){
   return d1;}
   
   /*public void setDetalle2(Detalle d2){
   this.d2=d2;
	}
   
     public Detalle getDetalle2(){
   return d2;
	}
   
        public void setDetalle3(Detalle d3){
   this.d3=d3;
	}
   
     public Detalle getDetalle3(){
   return d3;
	}*/
   
   public String toString(){

System.out.println("\nFolio de Factura: "+"\t"+folio+"\nTienda: "+"EPIC GAMER UNIVERSE"+"\n"+c2.toString()+"\nFecha de Hoy: "+f1.toString());       

return d1.toString();
      }

  }