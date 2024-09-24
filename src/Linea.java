public class Linea
{
    private String[] palabras;

    private int calificacion;


    public Linea(String lineaEntera)
    {
        String palabraVacia="";
        this.palabras = lineaEntera.split(" ");
        try
        {
            this.calificacion = Integer.parseInt(String.valueOf(palabras[palabras.length-1].charAt(1)));
        }
        catch(Exception e)
        {
            System.err.println("Error garrafal");
        }

    }
}
