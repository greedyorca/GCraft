import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainGameScreen extends JPanel {

    public int playerHealth = 20;

    public boolean userHasASword = false;
        public int swordXLocationOnScreen;
        public int swordYLocationOnScreen;
    public boolean userHasPickaxe = false;
        public int pickaxeXLocationOnScreen;
        public int pickaxeYLocationOnScreen;
    public boolean userHasBow = false;
        public int bowXLocationOnScreen;
        public int bowYLocationOnScreen;
    public boolean userHasShovel = false;
        public int shovelXLocationOnScreen;
        public int shovelYLocationOnScreen;
    public boolean userHasAxe = false;
        public int axeXLocationOnScreen;
        public int axeYLocationOnScreen;


    private BufferedImage swordArt;
    private BufferedImage pickaxeArt;
    private BufferedImage bowArt;
    private BufferedImage shovelArt;
    private BufferedImage axeArt;

    public MainGameScreen() {

        try {
            bowArt = ImageIO.read(new File("src/Assets/Items/BowArt.png"));
            swordArt = ImageIO.read(new File("src/Assets/Items/SwordArt.webp"));
            pickaxeArt = ImageIO.read(new File("src/Assets/Items/PickaxeArt.webp"));
            axeArt = ImageIO.read(new File("src/Assets/Items/AxeArt.webp"));
            shovelArt = ImageIO.read(new File("src/Assets/Items/ShovelArt.webp"));

        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics painter) {
        super.paintComponent(painter);
        if (userHasASword) {
            painter.drawImage(swordArt, swordXLocationOnScreen, swordYLocationOnScreen, 12, 20, this);
        }
        if (userHasPickaxe) {
            painter.drawImage(pickaxeArt,pickaxeXLocationOnScreen,pickaxeYLocationOnScreen, 12, 20, this);
        }
        if (userHasBow) {
            painter.drawImage(bowArt,bowXLocationOnScreen, bowYLocationOnScreen, 12, 20, this);
        }
        if (userHasAxe){
            painter.drawImage(axeArt, axeXLocationOnScreen,axeYLocationOnScreen, 12, 20, this);
        }
        if (userHasShovel) {
            painter.drawImage(shovelArt,shovelXLocationOnScreen,shovelYLocationOnScreen, 12, 20, this);
        }
        if (playerHealth <= 0) {
            painter.setColor(new Color(152, 145, 145, 26));
            painter.fillRect(0,0,getWidth(),getHeight());
        }
    }
}
