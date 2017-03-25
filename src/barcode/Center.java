/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author i1
 */
public class Center {

    public static void setCenter(JDialog dl) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dl.getWidth()) / 2;
        final int y = (screenSize.height - dl.getHeight()) / 2;
        dl.setLocation(x, y);
    }

    public static void setCenter(JFrame dl) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dl.getWidth()) / 2;
        final int y = (screenSize.height - dl.getHeight()) / 2;
        dl.setLocation(x, y);
    }

    public static void setCenter(JPanel dl) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dl.getWidth()) / 2;
        final int y = (screenSize.height - dl.getHeight()) / 2;
        dl.setLocation(x, y);
    }
       public static void setCenter(JInternalFrame dl) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dl.getWidth()) / 2;
        final int y = (screenSize.height - dl.getHeight()) / 2;
        dl.setLocation(x, y);
    }

    public static void setLeft(JDialog dl) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dl.getWidth()) / 2;
        final int y = (screenSize.height - dl.getHeight()) / 2;
        dl.setLocation(x, y);
    }

    public static void setRight(JDialog dl) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dl.getWidth()) / 2;
        final int y = (screenSize.height - dl.getHeight()) / 2;
        dl.setLocation(x, y);
    }
}
