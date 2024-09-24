import java.awt.*;
import java.awt.event.*;

public class InterfazGrafica extends Frame {

    private TextField resenaFT;
    private TextField puntuacionFT;
    private Button btnSubmit;
    private String resena;
    private int puntuacion;

    public InterfazGrafica() {
        setLayout(new BorderLayout());

        // Crear un TextField
        resenaFT = new TextField("Introduzca su resena");
        resenaFT.setPreferredSize(new Dimension(300, 25)); // Establecemos el tamaño del TextField
        add(resenaFT, BorderLayout.WEST); // Añadir el TextField en el centro

        // Crear un TextField
        puntuacionFT = new TextField("Introduzca su puntuacion");
        puntuacionFT.setPreferredSize(new Dimension(300, 25)); // Establecemos el tamaño del TextField
        add(puntuacionFT, BorderLayout.EAST); // Añadir el TextField en el centro

        // Crear un Button pequeño
        btnSubmit = new Button("Pulse para continuar");
        btnSubmit.setPreferredSize(new Dimension(100, 50)); // Establecemos el tamaño del Button
        add(btnSubmit, BorderLayout.SOUTH); // Añadir el Button en la parte inferior

        // Configuración de la ventana
        setTitle("Detector de Emociones V0.1");
        setSize(500, 200); // Tamaño de la ventana
        setVisible(true); // Hacer visible la ventana

        // Añadir un ActionListener al botón
        btnSubmit.addActionListener(new ActionListener()
        {
            // Acción cuando se presiona el boton
            public void actionPerformed(ActionEvent e)
            {

                //Accion para el cuadro de la resena
                resena = resenaFT.getText();
                //Accion para el cuadro de la puntuacion
                try {
                    puntuacion = Integer.parseInt(puntuacionFT.getText());
                } catch (NumberFormatException exception) {
                    System.err.println("Error: El String no es un número válido.");
                }
                System.out.println("Valores obtenidos correctamente");
            }
        });
    }
    public String getResena()
    {
        return resena;
    }
    public int getPuntuacion()
    {
        return puntuacion;
    }


}
