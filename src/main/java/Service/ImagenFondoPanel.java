package Service;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondoPanel extends JPanel {

//    private Image imagen;
//    
//   @Override
//    public void paint(Graphics g) {
//        imagen = new ImageIcon(getClass().getResource("/Images/BannerTest1.png")).getImage();
//        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//        setOpaque(false);
//        super.paint(g);
//    }
    private Image imagen;

    public ImagenFondoPanel() {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/banner02.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int panelWidth = getWidth();
        int imageWidth = imagen.getWidth(this);

        // Dibuja la imagen en la esquina superior izquierda...
        g.drawImage(imagen, 0, 0, imageWidth, getHeight(), this);
    }
}
