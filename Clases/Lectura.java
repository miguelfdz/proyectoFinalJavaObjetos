import java.io.*;import java.text.*;

class Lectura{

public static int readInt(){

int sw = 0;
int x2 = 0;

do {
   sw = 0;
   DataInputStream z = new DataInputStream(System.in);
   String x;
   try{
      x = z.readLine();
      x2 = Integer.parseInt(x);
      }
      catch(NumberFormatException e){
      System.out.println("No es un formato valido para un entero");
      sw = 1; 
      }
      catch(IOException e){x="0";}
} while (sw == 1);

return x2;
}

public static byte readByte(){
   
int sw = 0;
byte x2 = 0;
   
do {
   DataInputStream z = new DataInputStream(System.in);
   String x;
   sw = 0;

   try{
      x = z.readLine();
      x2 = Byte.parseByte(x);
      }
      catch (NumberFormatException e) {
         System.out.println("No es un formato valido para byte");
         sw = 1;
      }
      catch(IOException e){
         x="0";
      }
} while (sw == 1);

   return x2;
}

public static short readShort(){
int sw = 0;
short x2 = 0;
   
do {
   DataInputStream z = new DataInputStream(System.in);
   String x;
   sw = 0;

   try{
      x = z.readLine();
      x2 = Short.parseShort(x);
      }
      catch (NumberFormatException e) {
         System.out.println("No es un formato valido para short");
         sw = 1;
      }
      catch(IOException e){
         x="0";
      }
} while (sw == 1);

   return x2;
}

public static long readLong(){
   int sw = 0;
   long x2 = 0;
      
   do {
      DataInputStream z = new DataInputStream(System.in);
      String x;
      sw = 0;

      try{
         x = z.readLine();
         x2 = Long.parseLong(x);
         }
         catch (NumberFormatException e) {
            System.out.println("No es un formato valido para long");
            sw = 1;
         }
         catch(IOException e){
            x="0";
         }
   } while (sw == 1);

   return x2;
}

public static float readFloat(){
   int sw = 0;
   float x2 = 0;
      
   do {
      DataInputStream z = new DataInputStream(System.in);
      String x;
      sw = 0;

      try{
         x = z.readLine();
         x2 = Float.parseFloat(x);
         }
         catch (NumberFormatException e) {
            System.out.println("No es un formato valido para float");
            sw = 1;
         }
         catch(IOException e){
            x="0";
         }
   } while (sw == 1);

   return x2;
}

public static double readDouble(){

   int sw = 0;
   double x2 = 0;
      
   do {
      DataInputStream z = new DataInputStream(System.in);
      String x;
      sw = 0;

      try{
         x = z.readLine();
         x2 = Double.parseDouble(x);
         }
         catch (NumberFormatException e) {
            System.out.println("No es un formato valido para double");
            sw = 1;
         }
         catch(IOException e){
            x="0";
         }
   } while (sw == 1);

   return x2;
}

public static String readString(){

DataInputStream z = new DataInputStream(System.in);
String x;
try{
   x = z.readLine();
   }
   catch(IOException e){x =" ";}
   return x;
}

public static char readChar(){

DataInputStream z = new DataInputStream(System.in);
String x;
try{
   x = z.readLine();
   }
   catch(IOException e){x = " ";}
   char y = x.charAt(0);
   return y;
}
}
