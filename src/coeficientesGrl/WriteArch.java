package coeficientesGrl;








import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antonio
 */
public class WriteArch {
    
     String salidalineabuscada;
     String salidalinea;
    
     public void CrearArchivo(String nombreArchivo) {
         
         
        
        BufferedWriter bufferedWriter= null;
        
        try {
            
            //Construct the BufferedWriter object
            bufferedWriter = new BufferedWriter(new FileWriter(nombreArchivo));
            
    
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            //Close the BufferedWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
       

    
     }
     
      public void BuscarLinea(String filename, String info1) 
      {
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          
         
          try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (filename);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String lineas;
         
         
         // Lectura del fichero
         lineas = "";
         char vacio = ' ';
         char Cletra10 = 'T';
         boolean letra1;
         boolean letra2;
         boolean letra3;
         boolean letra4;
         boolean letra5;
         boolean letra6;
         boolean letra7;
         boolean letra8;
         boolean letra9;
         boolean letra10;
         boolean letra11;
         boolean letra12;
         boolean letra13;
         boolean letra14;
         boolean letra15;
         boolean letra16;
         boolean letra17;
         boolean letra18;
         boolean letra19;
         boolean letra20;
         boolean bandera;
         
         
         
         letra1 = false;
         letra2 = false;
         letra3 = false;
         letra4 = false;
         letra5 = false;
         letra6 = false;
         letra7 = false;
         letra8 = false;
         letra9 = false;
         letra10 = false;
         letra11 = false;
         letra12 = false;
         letra13 = false;
         letra14 = false;
         letra15 = false;
         letra16 = false;
         letra17 = false;
         letra18 = false;
         bandera = false;
         int longitud;
         
         while((lineas = br.readLine())!= null)
         {
             
             if(lineas.contains(info1))
             {
                 salidalinea = lineas;
             }
//             longitud = lineas.length();
//             System.out.print(longitud);
//             System.out.print("\n");
//             if ((longitud > 18) && (lineas != null))
//             {
//                 bandera = true;
//             }
//             if ((bandera == true) && (lineas.charAt(0) == vacio))
//             {
//                 letra1 = true;                  
//             }
//             if ((letra1 == true) && lineas.charAt(1) == vacio)
//             {
//                 letra2 = true;
//             }
//             if ((letra2 == true) && lineas.charAt(2) == vacio)
//             {
//                 letra3 = true;
//             }
//             if ((letra3 == true) && lineas.charAt(3) == vacio)
//             {
//                 letra4 = true;
//             }
//             if ((letra4 == true) && lineas.charAt(4) == vacio)
//             {
//                 letra5 = true;
//             }
//             if ((letra5 == true) && lineas.charAt(5) == vacio)
//             {
//                 letra6 = true;
//             }
//             if ((letra6 == true) && lineas.charAt(6) == vacio)
//             {
//                 letra7 = true;
//             }
//             if ((letra7 == true) && lineas.charAt(7) == vacio)
//             {
//                 letra8 = true;
//             }
//             if ((letra8 == true) && lineas.charAt(8) == vacio)
//             {
//                 letra9 = true;
//             }
//             if ((letra9 == true) && lineas.charAt(9) == vacio)
//             {
//                 letra10 = true;
//             }
//             if ((letra10 == true) && lineas.charAt(10) == 'T')
//             {
//                 letra11 = true;
//             }
//             if ((letra11 == true) && lineas.charAt(11) == 'o')
//             {
//                 letra12 = true;
//             }
//             if ((letra12 == true) && lineas.charAt(12) == 't')
//             {
//                 letra13 = true;
//             }
//             if ((letra13 == true) && lineas.charAt(13) == 'a')
//             {
//                 letra14 = true;
//             }
//             if ((letra14 == true) && lineas.charAt(14) == 'l')
//             {
//                 letra15 = true;
//             }
//             if ((letra15 == true) && lineas.charAt(15) == ' ')
//             {
//                 letra16 = true;
//             }
//             if ((letra16 == true) && lineas.charAt(16) == 'D')
//             {
//                 letra17 = true;
//             }
//             if ((letra17 == true))
//             {
//                 salidalinea = lineas;                
//             }
             
            
             
            
         }
         
        
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        
        
        
                   
    
     }
     
public String DarlineaBuscada()
{
    return salidalineabuscada;

}

 public void LeerLinea(String filename) 
      {
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          
         
          try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (filename);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String lineas;
         //salidalinea = br.readLine();
         
         
         // Lectura del fichero
         
         
         if((lineas = br.readLine())!= null)
         {
             salidalinea = lineas;
                     
            
         }
         
        
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        
        
        
                   
    
     }


public String Darlinea()
{
    return salidalinea;
    
    
    

}


  public void EscribeDeNuevo(String archivo, String Entrada)
    {
     FileWriter fw = null;
     BufferedWriter bw = null;
     try
      {
       fw = new FileWriter(archivo, true);
       bw = new BufferedWriter(fw);
       bw.write(Entrada);              
      }
      catch(Exception e)
       {
        System.out.println(e);
       }
      finally
       {
        if (bw != null)
        try
         {
          bw.close();
         }
         catch (IOException ioe)
          {
           System.out.println(ioe);
          }
       }
     }
  
  public Boolean BanderaBuscarLinea(String filename, String info1) 
      {
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          Boolean bandera = false;
         
          try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (filename);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String lineas;
         
         


         
         while((lineas = br.readLine())!= null)
         {
             
             if(lineas.contains(info1))
             {
                 bandera = true;
             }
             else 
             {
                 bandera = false;
             }
            
            
             
            
         }
         
        
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
         return bandera;
         
        
        
        
                   
    
     }
  
   public int BuscarYdarNumLineaDeLineaAaB(String filename, String info1, int LineaA, int LineaB) 
      {
          //alparecer aceptacomo entrada numeros negativos para LIneaA incluyendo el cero, no marca error
          //si se exeden el numero de lineas no marca errror
          //y si no encuentra el archivo regresa -1 (y)
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          Boolean bandera = false;
          int i;
          int LineaLinea = -1;
         
          try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (filename);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String lineas;
         
         


         i = 1;
         while((lineas = br.readLine())!= null)
         {
             
             if(lineas.contains(info1) && i >= LineaA && i <= LineaB)
             {
                 LineaLinea = i;
                 break;
             }

             
             i = i+1;
            
            
             
            
         }
         
        
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
         return LineaLinea;
         
        
        
        
                   
    
     }
   
   public int BuscarYdarLineaUltimaPalabraDeLineaAaB(String filename, String info1, int LineaA, int LineaB) 
      {
          //alparecer aceptacomo entrada numeros negativos para LIneaA incluyendo el cero, no marca error
          //si se exeden el numero de lineas no marca errror
          //y si no encuentra el archivo regresa -1 (y)
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          Boolean bandera = false;
          int i;
          int LineaLinea = -1;
         
          try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (filename);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String lineas;
         
         


         i = 1;
         while((lineas = br.readLine())!= null)
         {
             
             if(lineas.contains(info1) && i >= LineaA && i <= LineaB)
             {
                 LineaLinea = i;
                 
             }

             
             i = i+1;
            
            
             
            
         }
         
        
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
         return LineaLinea;
         
        
        
        
                   
    
     }
   
   public int ContarRenglones(String filename) 
      {
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          int NumeroDeRenglones;
          
         
          try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (filename);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String lineas;

         //salidalinea = br.readLine();
         
         
         // Lectura del fichero
         
         
         if((lineas = br.readLine())!= null)
         {
             salidalinea = lineas;
                     
            
         }
         
        
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
          NumeroDeRenglones = 0;
          return NumeroDeRenglones;
        
        
        
                   
    
     }

     public int countLines(String filename)  {
//http://stackoverflow.com/questions/453018/number-of-lines-in-a-file-in-java
try{         
LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
int cnt = 0;
String lineRead = "";
while ((lineRead = reader.readLine()) != null) {}

cnt = reader.getLineNumber(); 
reader.close();
return cnt;
}   catch(Exception e){
         return -1;
     }  

     }
    
}



