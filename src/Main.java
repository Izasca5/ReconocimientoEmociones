import java.awt.*;
import java.io.*;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        //Crea la interfaz grafica
        InterfazGrafica interfaz = new InterfazGrafica();

        //Guarda la resena introducida en el cuadro de texto
        String resena = interfaz.getResena();
        //Guarda la puntuación de dicha resena
        int puntuacion = interfaz.getPuntuacion();


        //analisisFichero("C:\\Users\\izana\\IdeaProjects\\ReconocimientoEmociones\\src\\BaseDeDatosResenas.txt","C:\\Users\\izana\\IdeaProjects\\ReconocimientoEmociones\\src\\BaseDeDatosResenasClean.txt");

        calcularPuntuacion(resena);

        anadirNuevosDatos(resena, puntuacion);

        crearTabla("C:\\Users\\izana\\IdeaProjects\\ReconocimientoEmociones\\src\\BaseDeDatosResenasClean.txt","C:\\Users\\izana\\IdeaProjects\\ReconocimientoEmociones\\src\\tablaPalabras");

    }



    private static void calcularPuntuacion(String resena)
    {
        String[] palabras= filtrarYSeparar(resena);
    }

    private static String[] filtrarYSeparar(String resena)
    {
        return null;
    }

    private static void anadirNuevosDatos(String resena, int puntuacion)
    {

    }

    private static void quickSort(int[] array, int start, int end)
    {
        if(start>=end)
        {
            return; //base case
        }
        int pivot = partition(array, start, end);

        quickSort(array, start, pivot - 1);
        quickSort(array,pivot+1,end);


    }

    private static int partition(int[] array,int start,int end)
    {
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j<=array.length-1;j++)
        {
            if (array[j] < pivot)
            {
                i++;
                int temp1 = array[i];
                array[i] = array[j];
                array[j] = temp1;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
    public static void analisisFichero(String pNombre, String pNombreEscribe) {
        int i=0;
        try{
            Scanner sc=new Scanner(new File(pNombre));
            PrintWriter pw=new PrintWriter(new FileWriter(pNombreEscribe));

            while(sc.hasNextLine()){
                String linea=sc.nextLine();
                linea=cleanString(linea);
                linea=linea.toLowerCase();
                linea=linea.replaceAll("[^a-z1-9$ ]", "");
                pw.println(linea);
                i++;
            }
            sc.close();
            pw.close();
        }catch (FileNotFoundException e){
            System.err.println("No se ha podido leer el fichero: "+pNombre);
        } catch (IOException e) {
            System.err.println("No se ha podido leer el fichero: "+pNombre);
            throw new RuntimeException(e);
        }
        System.out.println(i);

    }
    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }

    public static void crearTabla(String nombre, String nombreSalida) throws FileNotFoundException {
        ArrayList<String[]> lineas = new ArrayList<>();
        try
        {
            //Busca los ficheros y los abre
            Scanner sc = new Scanner(new File(nombre));
            PrintWriter pw = new PrintWriter(nombreSalida);

            int contador=0;
            while (sc.hasNextLine())
            {



            }


        }
        catch (FileNotFoundException e)
        {
            System.err.println("No se ha podido crear el fichero: "+nombre);
        }

    }
}