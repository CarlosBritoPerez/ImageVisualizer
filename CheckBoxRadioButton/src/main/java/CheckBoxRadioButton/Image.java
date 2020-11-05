package CheckBoxRadioButton;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import static com.mycompany.practica5.UtilsPractica5.*;

public class Image extends JPanel {

    private BufferedImage image = null;
    private BufferedImage logo = null;
    private BufferedImage imageCopy = null;
    private Graphics g;
    
    private int x = 0;
    private int y = 0;

    public Image() {
        try {
            image = ImageIO.read(new URL("https://etcanada.com/wp-content/uploads/2016/09/astley.jpg?quality=80&strip=all&w=720&h=480&crop=1"));
            logo = ImageIO.read(new URL("https://i.imgur.com/dyJ8Hxe.png "));
            imageCopy = image;
        } catch (MalformedURLException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
        g.drawImage(logo, x, y, null);//x = 335 y = 320
    }
    
    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
        this.repaint();
    }
    
    public void paintLayers(boolean redCheck, boolean greenCheck, boolean blueCheck) {
        image = seleccionarComponentes(imageCopy,redCheck,greenCheck,blueCheck);        
        this.repaint();
    }
}
