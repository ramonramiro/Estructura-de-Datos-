
package unidaddos.estructuradedatos;

import java.util.Scanner;

/**UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
 * TECNOLOGIAS DE LA INFORMACION DE LA COMUNICACION
 * SISTEMAS INFORMATICOS
 *RAMON RAMIRO SOTO RINCON
 * GSI-1241
 * PERRY.9314@GMAIL.COM
 * @author RRSR
 */
public class BuscaMinas {
   
    private static int [][] mostrar;
    
    
    
    public static int [][] defineMinas(){   /// EN ESTA LINEA SE DEFINE EL ARREGLO BIDIMENSIONAL
        int [][] mostrar={{1,0,0,1,0},
                           {0,0,1,0,0},
                           {1,0,0,0,1},
                           {0,0,0,1,1}};
        return mostrar;  
    }
 
    public static String mostrarMinas (int mostrar[][]){   ////AQUI SE ESTA CREANDO EL METODO PARA MOSTRAR LOS DATOS DEL ARREGLO
        String res="";
        for (int i = 0; i < mostrar.length; i++) {
            for (int j = 0; j < mostrar[i].length; j++) {
                res=res+i+","+j+"  ";
                
            }
            res=res+"\n";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);   ///esta linea es para crear un objeto que facilitara la entrada de datos 
        System.out.println(mostrarMinas(defineMinas()));
   
        int arreglo[][]=defineMinas();  
        int contador =0;
        for (int i = 0; i < 5; i++) {    
              System.out.println("Que coordenadas "
                + "quieres Renglon:");  ///esta es una impresion donde solicita la entrada de datos para las columnas 
        int ren=leer.nextInt();
        System.out.println("Columna:");
        int col=leer.nextInt();
           
        if(arreglo[ren][col]==1){
            System.out.println("Explota");
            System.out.println("Lo siento has perdido");
            break;
        }else{
            System.out.println("Continuas");
          
           }
        contador++;
        }
          System.out.println("Felicidades has ganado");
    }
    
}
