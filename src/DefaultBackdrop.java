import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class DefaultBackdrop extends JPanel {

    private BufferedImage DefaultBackdrop;

    public DefaultBackdrop() {
        setFocusable(true);

        try {
            DefaultBackdrop = ImageIO.read(
                    new File("src/Assets/Backrounds/DefaultBackdrop.png")
            );
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void paintComponent(Graphics painter) {
        super.paintComponent(painter);

        painter.drawImage(DefaultBackdrop, 0, 0, getWidth(), getHeight(), this);
    }
}
//  - new Color(255, 0, 0) = red.
//  - new Color(0, 255, 0) = green.
//  - new Color(0, 0, 255) = blue.
//  - new Color(0, 0, 0) = black.
//  - new Color(255, 255, 255) = white.
//You can also specify transparency with a fourth argument, called alpha:
//      g.setColor(new Color(255, 0, 0, 128));
//Here, 128 means approximately half opacity. This works with the appropriate alpha-compositing behavior.