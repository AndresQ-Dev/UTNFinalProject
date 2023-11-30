package Service;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author andres
 */
public class JPanelDegrade extends JPanel {
//111, 177, 252
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Color color1 = new Color(109, 213, 250);
        Color color2 = new Color(2, 27, 121);
        GradientPaint gp = new GradientPaint(0, 0, color1,180, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

}
