package ar.org.centro8.curso.java.doc;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/* @author Usuario*/
public class ImagendeFondo implements Border{
    public BufferedImage back;
 
    public ImagendeFondo(){
        try {
            URL imagePath = new URL(getClass().getResource("../doc/1aa.png").toString());
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }

    
 
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    public boolean isBorderOpaque() {
        return false;
    }
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if(back !=null);{
      
     g.drawImage(back, 0, 0,width,height, null);
 
    
    }}
}
