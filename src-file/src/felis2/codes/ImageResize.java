/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package felis2.codes;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Dinesh
 */
public class ImageResize {
    public static BufferedImage resize(String fname, int width, int height) {
        try{
            BufferedImage image = ImageIO.read(new File(fname));
            BufferedImage resizedImage = new BufferedImage(width, height,
            BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = resizedImage.createGraphics();
        //    ImageIcon iff;
            g.drawImage(image, 0, 0, width, height, null);
            g.dispose();

            return resizedImage;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
