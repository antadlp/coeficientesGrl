/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coeficientesGrl;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author antonio2
 */
public class CopiarArchivo 
{
    public void Copiar(String archivoAcopiar, String archivonuevo, int renglones)
    {
     String salidalineabuscada;
     String salidalinea;
     int i;
     
     
     WriteArch ManejoArchivo = new WriteArch();
     
     ManejoArchivo.CrearArchivo(archivonuevo);
     
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          
         
         try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (archivoAcopiar);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         //salidalinea = br.readLine();
         
         
         // Lectura del fichero
         
        for (i=1;i<=renglones;i=i+1)
        {
            
            linea = br.readLine(); //al parecer cada que hace una llamada al archivo empieza en la linea siguiente
            
            ManejoArchivo.EscribeDeNuevo(archivonuevo, linea);
            //ManejoArchivo.EscribeDeNuevo(archivocodigo, "ManejoArchivos.EscribeDeNuevo(archivonuevo,"+linea+");");
            ManejoArchivo.EscribeDeNuevo(archivonuevo, "\n");
            
            
            
            //ManejoArchivos.EscribeDeNuevo("energiahcl"+x, linea);
            //ManejoArchivo.EscribeDeNuevo(archivonuevo, "ManejoArchivos.EscribeDeNuevo(\"energiahcl\", linea);");
        }
         
         
//         while((lineas = br.readLine())!= null)
//         {
//             salidalinea = lineas;
//                     
//            
//         }
         
        
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
    
    public void CrearCodigoDe(String archivoAcopiar, String archivocodigo, int renglones)
    {
     String salidalineabuscada;
     String salidalinea;
     int i;
     
     
     WriteArch ManejoArchivo = new WriteArch();
     
     ManejoArchivo.CrearArchivo(archivocodigo);
     
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          
         
          try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (archivoAcopiar);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         
         //salidalinea = br.readLine();
         
         
         // Lectura del fichero
         
        for (i=1;i<=renglones;i=i+1)
        {
            boolean bandera = false;
            
            linea = br.readLine();
            //ManejoArchivo.EscribeDeNuevo(archivonuevo, linea);
            if (linea != null)
            {
                bandera = true;
            }
            
            if ((linea.length() ==  0)&& (bandera == true))
            {
               ManejoArchivo.EscribeDeNuevo(archivocodigo, "ManejoArchivos.EscribeDeNuevo(archivonuevo,\""+"\\"+"n"+"\""+");");
               ManejoArchivo.EscribeDeNuevo(archivocodigo, "\n");
               
            }
            else
            {
                ManejoArchivo.EscribeDeNuevo(archivocodigo, "ManejoArchivos.EscribeDeNuevo(archivonuevo,\""+linea+"\");");
                ManejoArchivo.EscribeDeNuevo(archivocodigo, "\n");
                ManejoArchivo.EscribeDeNuevo(archivocodigo, "ManejoArchivos.EscribeDeNuevo(archivonuevo,\""+"\\"+"n"+"\""+");");
                ManejoArchivo.EscribeDeNuevo(archivocodigo, "\n");

               

            }
            
            
            
            
            //ManejoArchivos.EscribeDeNuevo("energiahcl"+x, linea);
            //ManejoArchivo.EscribeDeNuevo(archivonuevo, "ManejoArchivos.EscribeDeNuevo(\"energiahcl\", linea);");
        }
         
         
//         while((lineas = br.readLine())!= null)
//         {
//             salidalinea = lineas;
//                     
//            
//         }
         
        
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
    
    public void Copiar2(String archivoAcopiar, String archivonuevo, int renglones)
    {
     String salidalineabuscada;
     String salidalinea;
     int i;
     
     
     WriteArch ManejoArchivo = new WriteArch();
     
     ManejoArchivo.CrearArchivo(archivonuevo);
     
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          
         
         try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (archivoAcopiar);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         //salidalinea = br.readLine();
         
         
         // Lectura del fichero
         
        for (i=1;i<=renglones;i=i+1)
        {
            linea = br.readLine();
            ManejoArchivo.EscribeDeNuevo(archivonuevo, linea);
            //ManejoArchivo.EscribeDeNuevo(archivocodigo, "ManejoArchivos.EscribeDeNuevo(archivonuevo,"+linea+");");
            ManejoArchivo.EscribeDeNuevo(archivonuevo, "\n");
            
            
            
            //ManejoArchivos.EscribeDeNuevo("energiahcl"+x, linea);
            //ManejoArchivo.EscribeDeNuevo(archivonuevo, "ManejoArchivos.EscribeDeNuevo(\"energiahcl\", linea);");
        }
         
         
//         while((lineas = br.readLine())!= null)
//         {
//             salidalinea = lineas;
//                     
//            
//         }
         
        
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
    
    public String CopiarLineaIndicada(String archivoAcopiar, int LineaIndicada)
    {
     
     String SalidaLineaIndicada = "none";
     int i;
     
     
     
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;
          
         
         try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (archivoAcopiar);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         //salidalinea = br.readLine();
         
         
         // Lectura del fichero
        
        i = 1;
        while ((linea = br.readLine())!= null)
        {
            
            //linea = br.readLine(); //al parecer cada que hace una llamada al archivo empieza en la linea siguiente
            
            if (i == LineaIndicada)
            {
                SalidaLineaIndicada = linea;
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
         
         return SalidaLineaIndicada;
          
          
          
    }
    
    
    
    

    
    
    
}
