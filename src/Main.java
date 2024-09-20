import java.awt.*;
public class Main
{
    public static void main(String[] args)
    {
        //Crea la interfaz grafica
        InterfazGrafica interfaz = new InterfazGrafica();

        //Guarda la resena introducida en el cuadro de texto
        String resena = interfaz.getResena();
        //Guarda la puntuación de dicha resena
        int puntuacion = interfaz.getPuntuacion();

        calcularPuntuacion(resena);

        anadirNuevosDatos(resena, puntuacion);



    }



    private static void calcularPuntuacion(String resena)
    {

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
}