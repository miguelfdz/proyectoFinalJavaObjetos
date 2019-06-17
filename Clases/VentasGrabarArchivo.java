/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 11/18/18
Fecha de terminación:
Objetivo del programa: 
*/

import java.io.*;
import java.util.*;
import java.text.*;

class VentasGrabarArchivo implements Serializable{
	public static void main(String[] args) {
	
			Producto p = null;
			
			//Detalles de Compras
			Detalle[] d1 = new Detalle[4];
			Detalle[] d2 = new Detalle[4];
			Detalle[] d3 = new Detalle[4];				
			Detalle[] d4 = new Detalle[4];
			
			//VALOR DEFAULT DE DETALLES
			for (int i = 0; i < 4; i++) {
				d1[i] = new Detalle(p,0);
				d2[i] = new Detalle(p,0);
				d3[i] = new Detalle(p,0);
				d4[i] = new Detalle(p,0);
			}
			
				
				try{
					//LEER .dat de Productos
					FileInputStream f1 = new FileInputStream("Productos.dat");
					ObjectInputStream f2 = new ObjectInputStream(f1);
					p = (Producto) f2.readObject();

					
					//GENERAR .dat de Ventas
					FileOutputStream fd1 = new FileOutputStream("Ventas.dat");
					ObjectOutputStream fd2 = new ObjectOutputStream(fd1);

							while(p != null){
								//FALLOUT 76
								if (p.getClave() == 456456) {
									p = (Videojuego)p;
									d1[0].setProducto(p);
									d1[0].setCantidad(4);
								}
								//DRAGON BALL FIGHTERZ
								else if (p.getClave() == 887711) {
									d1[1].setProducto(p);
									d1[1].setCantidad(5);
								}
								//CALL OF DUTY BLACK OPS 4 
								else if (p.getClave() == 4444) {
									d1[2].setProducto(p);
									d1[2].setCantidad(7);
								}
								//SPIDERMAN
								else if (p.getClave() == 667788) {
									d1[3].setCantidad(3);
									d1[3].setProducto(p); 
								}
								
								//FIFA 19
								else if (p.getClave() == 111231) {					
									d2[0].setProducto(p);
									d2[0].setCantidad(7);
									d3[0].setProducto(p);
									d3[0].setCantidad(4);
									d4[1].setProducto(p);
									d4[1].setCantidad(9);
								}
								//XBOX ONE BFV 
								else if (p.getClave() == 102938) {
									d2[1].setProducto(p);
									d2[1].setCantidad(1);
									d4[0].setProducto(p);
									d4[0].setCantidad(2);
								}
								//Nintendo Switch Splatoon
								else if (p.getClave() == 334210) {
									d3[1].setProducto(p);
									d3[1].setCantidad(2);
								}
								//Wii U Zombi U
								else if (p.getClave() == 100201) {
									d3[2].setProducto(p);
									d3[2].setCantidad(1);
								}
								//XBOX 360 MW3 
								else if (p.getClave() == 660000) {
									d3[3].setProducto(p);
									d3[3].setCantidad(2);
								}
								//New 3DS Pokemon Ultra Sun
								else if (p.getClave() == 101117) {
									d4[2].setProducto(p);
									d4[2].setCantidad(4);
								}
								//MANDO INALAMBRICO XBOX ROJO
								else if (p.getClave() == 97896) {
									d4[3].setProducto(p);
									d4[3].setCantidad(3);
									/*GENERAR .dat de ventas
									
									Agregar arreglo de detalles 1*/								
									for (int i = 0; i < 4; i++) {
										fd2.writeObject(d1[i]);
									}
									//Arreglo de detalles 2
									for (int j = 0; j < 4; j++) {
										fd2.writeObject(d2[j]);
									}
									//Arreglo de detalles 3
									for (int k = 0; k < 4; k++) {
										fd2.writeObject(d3[k]);
									}
									//Arreglo de detalles 4
									for (int l = 0; l < 4; l++) {
										fd2.writeObject(d4[l]);
									}
									
								}
								
								//Red Dead Redemption 2
								else if (p.getClave() == 555123) {
									d2[2].setProducto(p);
									d2[2].setCantidad(14);
								}
								
								//3DS Space Purple
								else if (p.getClave() == 666666) {
									d2[3].setProducto(p);
									d2[3].setCantidad(4);
								}
								p = (Producto) f2.readObject();
							}
						fd2.close();
						fd1.close();
							
						f2.close();
						f1.close();
						} 
						
				catch (IOException e) {System.out.println("No se encontro el archivo .dat");} 
				catch (ClassNotFoundException c) {System.out.println("No se encontro la clase de "+c);}
				catch (NullPointerException n){System.out.println("Error en objeto  "+n.getMessage());}  
	}
}