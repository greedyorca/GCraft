import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PlayerCreator extends JPanel {
    public final int[] playerXMovement = new int [1];
    public final int[] playerYMovement = new int [1];
    public final int[] playerZMovement = new int [1];

    private BufferedImage Steve;

    public PlayerCreator(){
        playerXMovement[0]= 400;
        playerYMovement[0]= 400;
        playerZMovement[0]= 400;

        try{
            Steve = ImageIO.read(new File("src/Assets/Steve.png"));
        }catch(IOException | IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    @Override
    protected void paintComponent(Graphics painter) {
        super.paintComponents(painter);
        painter.drawImage(Steve, playerXMovement[0], playerYMovement[0], 20, 20, this);
    }
}
