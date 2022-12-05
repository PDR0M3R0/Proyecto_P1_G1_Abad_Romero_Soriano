package SistemaCompraTicketsAereos;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public class ManejoArchivo {
    /**
     * Este metodo permite poder acceder a los archivos de text para poder meter cada linea del texto seprada respectivamente por cada coma mediante un split, en un arregleo de string para posteriormente ser recorrida en un metodo de cargar de archivos y poder rellenar las listas estaticas de un objeto de la clase sistema
     * @param nombrearchivo recibe el nombre del archivo tde texto a leer para facilidad de la ruta este archiv se colocaron dentro de la carpeta dell mismo proyecto
     * @return una lista de arreglos de string
     */
    public static ArrayList<String[]> LeeFichero(String nombrearchivo) {
        ArrayList<String[]> lineas = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(nombrearchivo);
            fr = new FileReader(archivo,StandardCharsets.UTF_8);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            linea = br.readLine();
            while ((linea = br.readLine()) != null) {
                if(linea.equals("...")){
                   linea = br.readLine();
                }else{
                //System.out.println(linea);
                String[] parametrosObjeto = linea.split(",");
                lineas.add(parametrosObjeto);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lineas;

    }
    /**
     * Este metod permite poder escribir infirmpacion dentro de un archivo de texto, el cual estara ubicacdo en la misma carpeta del proyecto para no usar alguna ruta. resi
     * @param nombreArchivo recite el nombre de l archivo a leer
     * @param linea corresponde al forma que estara estructura la informacion al escribir en el archivo de text, en estos casos usaemos toString para su uso respectivamente separado con comas
     */
    public static void EscribirArchivo(String nombreArchivo, String linea) {

        FileWriter fichero = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(nombreArchivo,true);
            bw = new BufferedWriter(fichero);
            bw.write(linea+"\n");
            System.out.println("se registró pago en pagos.txt");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    //fichero.close();
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
}
