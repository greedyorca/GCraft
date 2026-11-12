import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;
import javax.imageio.ImageIO;


public class WorldCreationBackdrop extends JPanel {

    public int redPlayerColor = 0;
    public int greenPlayerColor = 0;
    public int bluePlayerColor = 0;
    public boolean isCustom = false;

    private BufferedImage WorldCreationBackdrop;


    public WorldCreationBackdrop() {
        setFocusable(true);

        try {
            WorldCreationBackdrop = ImageIO.read(new File("src/Assets/Backrounds/WorldCreationBackdrop.png"));

        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics painter) {
        super.paintComponent(painter);

        painter.setColor(new Color(redPlayerColor, greenPlayerColor, bluePlayerColor));
        if (isCustom) {
            painter.drawImage(WorldCreationBackdrop, 0, 0, getWidth(), getHeight(), this);
            painter.fillRect(690, 400, 100, 100);
        } else {
            painter.clearRect(690, 400, 100, 100);
            painter.drawImage(WorldCreationBackdrop, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
