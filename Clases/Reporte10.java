/*
Autor: Miguel A. Fernandez Marquez & Steve Albo

Fecha de inicio: 11/19/18
Fecha de terminación:
Objetivo del programa: 
*/

import java.io.*;
import java.util.*;
import java.text.*;

//HISTROIAL DE COMPRAS
class Reporte10 implements Serializable {
	public static void main(String[] args) {
	Detalle d = null;	
		try {
			System.out.println("- HISTORIAL DE COMPRAS -\n");
			FileInputStream f1 = new FileInputStream("Ventas.dat");
			ObjectInputStream f2 = new ObjectInputStream(f1);
			d = (Detalle) f2.readObject();
			
			while (d != null) {
				System.out.println(d);
				d = (Detalle) f2.readObject();
			}
			
			f2.close();
			f1.close();
			
		} catch (IOException e) {
			System.out.println("No se encontro el archivo .dat");
			
		} catch (ClassNotFoundException c) {
			System.out.println("No se encontro la clase de");
		}
	}
}