package Service;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author andres
 */
public class Validar {

    //Se agregan métodos estáticos de validación da datos general
    //para usar en *texfield...
    public static void esLetra(KeyEvent evt) {
        /*método para verificar si cada caracter es una letra con el método
        isLetter(). Y además verifica que si es un espacio lo deja escribir
        Si no lo es se consume el caracter y no lo escribe .
        Se agregan teclas Delete y borrar <-- como permitidas*/
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && evt.getKeyChar() != KeyEvent.VK_DELETE && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyChar() != KeyEvent.VK_ENTER) {
            evt.consume();
            mostrarMensajeFlotante("SÓLO se permiten LETRAS en este campo.", 1500);
        }
    }

    public static void esNumero(KeyEvent evt) {
        //Método para verificar si el caracter indicado es número...
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        //Se agregan teclas Delete y borrar <-- como permitidas
        if (!numero && evt.getKeyChar() != KeyEvent.VK_DELETE && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && evt.getKeyChar() != KeyEvent.VK_ENTER) {
            evt.consume();
            mostrarMensajeFlotante("SÓLO se permiten NÚMEROS en este campo.", 1500);
        }
    }

    private static void mostrarMensajeFlotante(String mensaje, int duracion) {
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        dialog.setUndecorated(true);
        JLabel label = new JLabel(mensaje);

        //Formato fuente
        Font font = new Font("Arial", Font.PLAIN, 15);
        label.setFont(font);
        label.setForeground(Color.WHITE);

        // Configura el fondo del mensaje
        label.setBackground(Color.RED);
        label.setOpaque(true);

        label.setHorizontalAlignment(JLabel.CENTER);
        dialog.getContentPane().add(label);
        dialog.pack();
        dialog.setLocationRelativeTo(null);

        Timer timer = new Timer(duracion, (e) -> dialog.dispose());
        timer.setRepeats(false);

        dialog.setVisible(true);
        timer.start();
    }

}
