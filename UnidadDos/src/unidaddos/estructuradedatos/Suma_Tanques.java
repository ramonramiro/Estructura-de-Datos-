package unidaddos.estructuradedatos;

/**
 * UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO TECNOLOGIAS DE LA INFORMACION
 * DE LA COMUNICACION SISTEMAS INFORMATICOS RAMON RAMIRO SOTO RINCON GSI-1241
 * PERRY.9314@GMAIL.COM
 *
 * @author RRSR
 */
public class Suma_Tanques {

    private static int[][] cantidad;

    public static int[][] defineArreglo() {   ///aqui se declara el erreglo
        int[][] mostrar = {{25, 20, 20, 50, 50, 30},
        {20, 15, 15, 90, 80, 90},
        {15, 10, 10, 40, 30, 40}, //{1,2,3,4,5,6}
    };
        //cantidad=mostrar;
        cantidad = mostrar;
        return mostrar;
    }

    public static String mostrarDatos(int mostrar[][]) {  ///se crea un metodo para mostrar los datos del arreglo 
        String result = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                result = result + mostrar[i][j] + " , ";
            }
            result = result + "\n";
        }
        return result;
    }

    public static void sumaColumnas(int mostrar[][]) {   ///aqui se crea otro metodo para realizar la suma de las columnas 
        System.out.println("La suma de las columnas es:");
        double suma = 0.0;
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 6; j++) {
                suma = suma + mostrar[i][j];

            }
            System.out.println("La suma es igual a:" + suma);

        }

    }

    public static void sumaFilas(int mostrar[][]) {   ////en esta linea se crea otro metodo donde se realiza las suma de las filas 
        System.out.println("");
        System.out.println("La suma De las Filas es:");
        double suma = 0.0;
        for (int i = 0; i < 6; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma = suma + mostrar[j][i];

            }
            System.out.println("La suma es igual a:" + suma);
        }
    }

    public static void main(String[] args) {
        System.out.println(mostrarDatos(defineArreglo()));
        Suma_Tanques ejer = new Suma_Tanques();

        sumaFilas(cantidad);   ////estas dos lineas son para invocar el metodo y que se muestre en la consola el resultado
        sumaColumnas(cantidad);

    }

}
