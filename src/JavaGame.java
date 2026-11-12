// George Reed
// 11/3/26-
// Create a Basic Minecraft/Java Game

import jdk.jfr.Category;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.desktop.SystemSleepEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;


public class JavaGame {


    public static void main(String[] args) {
        JFrame gameWindow = new JFrame("Java Game");
        gameWindow.setSize(1280, 800);
        JLayeredPane layers = new JLayeredPane();
        layers.setPreferredSize(new Dimension(gameWindow.getWidth(), gameWindow.getHeight()));
        DefaultBackdrop defaultBackdrop = new DefaultBackdrop();
        WorldCreationBackdrop worldCreationBackdrop = new WorldCreationBackdrop();
        MainGameScreen mainGameScreen = new MainGameScreen();
        JButton customizeButton = new JButton("Skin");          //Customize tab
            // Change Color Buttons
            JButton redButton = new JButton("Click to make more red");
            JButton blueButton = new JButton("Click to make more blue");
            JButton greenButton = new JButton("Click to make more green");
            JButton lessRedButton = new JButton("Click to make less red");
            JButton lessBlueButton = new JButton("Click to make less blue");
            JButton lessGreenButton = new JButton("Click to make less green");

        JButton worldSettingsButton = new JButton("World");     //World tab
            JButton worldTypeButton = new JButton("World Type");
                // World Types
                JButton superflatButton = new JButton("Superflat");
                JButton amplifiedButton = new JButton("Amplified");
                JButton default1 = new JButton("Default");

        JButton gameButton = new JButton("Game");               //Game tab
            JButton gameModeButton = new JButton("Game Mode");
                // Game Modes
                JButton creativeButton = new JButton("Creative");
                JButton survivalButton = new JButton("Survival");
                JButton adventureButton = new JButton("Adventure");

        JButton startButton = new JButton("Play");
        JButton createWorld = new JButton("Create New World");
                    // In Game Creations
            final boolean[] createWorldPressed = {false};

            // Movement Mechanics
            PlayerCreator steve = new PlayerCreator();

            // Health Mechanics
            mainGameScreen.playerHealth= 20;
            JLabel playerHealthLabel = new JLabel("()()()()()()()()()()");
            JButton respawnButton = new JButton("Respawn");
            JButton titleScreenButton = new JButton("Title Screen");

            // Item Mechanics
            JButton swordButton = new JButton("Sword");
            JButton axeButton = new JButton("Axe");
            JButton bowButton = new JButton("Bow");
            JButton shovelButton = new JButton("Shovel");
            JButton pickaxeButton = new JButton("Pickaxe");

            // Inventory Mechanics
            JButton inventoryExitButton = new JButton();
            JButton hotbarButton2 = new JButton();
            JButton hotbarButton3 = new JButton();
            JButton hotbarButton4 = new JButton();
            JButton hotbarButton5 = new JButton();
            JButton hotbarButton6 = new JButton();
            JButton hotbarButton7 = new JButton();
            JButton hotbarButton8 = new JButton();
            JButton hotbarButton9 = new JButton();
            JButton offhandButton = new JButton();
            JButton inventoryButton = new JButton("...");
                JButton inventoryButton1 = new JButton();
                JButton inventoryButton2 = new JButton();
                JButton inventoryButton3 = new JButton();
                JButton inventoryButton4 = new JButton();
                JButton inventoryButton5 = new JButton();
                JButton inventoryButton6 = new JButton();
                JButton inventoryButton7 = new JButton();
                JButton inventoryButton8 = new JButton();
                JButton inventoryButton9 = new JButton();
                JButton inventoryButton10 = new JButton();
                JButton inventoryButton11 = new JButton();
                JButton inventoryButton12 = new JButton();
                JButton inventoryButton13 = new JButton();
                JButton inventoryButton14 = new JButton();
                JButton inventoryButton15 = new JButton();
                JButton inventoryButton16 = new JButton();
                JButton inventoryButton17 = new JButton();
                JButton inventoryButton18 = new JButton();
                JButton inventoryButton19 = new JButton();
                JButton inventoryButton20 = new JButton();
                JButton inventoryButton21 = new JButton();
                JButton inventoryButton22 = new JButton();
                JButton inventoryButton23 = new JButton();
                JButton inventoryButton24 = new JButton();
                JButton inventoryButton25 = new JButton();
                JButton inventoryButton26 = new JButton();
                JButton inventoryButton27 = new JButton();
                JButton helmetButton = new JButton();
                JButton chestplateButton = new JButton();
                JButton leggingsButton = new JButton();
                JButton bootsButton = new JButton();

            // Creation/Destruction/Attacks Mechanics
            JButton breakButton = new JButton();JButton hotbarButton1 = new JButton();

            // Commands, Chat, and Exit buttons
            JButton cancelButton = new JButton("Cancel");

        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setResizable(false);
        gameWindow.add(layers);


    // Game Setup Adders
    layers.add(defaultBackdrop, 1);
    layers.add(worldCreationBackdrop, 1);
    layers.add(createWorld, 2);
    layers.add(cancelButton, 2);
    layers.add(redButton, 2);
    layers.add(blueButton, 2);
    layers.add(greenButton, 2);
    layers.add(lessRedButton, 2);
    layers.add(lessBlueButton, 2);
    layers.add(lessGreenButton, 2);
    layers.add(startButton, 2);
    layers.add(customizeButton, 2);
    layers.add(gameButton, 2);
    layers.add(worldSettingsButton, 2);
    layers.add(worldTypeButton, 2);
    layers.add(gameModeButton, 2);
    layers.add(creativeButton, 2);
    layers.add(survivalButton, 2);
    layers.add(adventureButton, 2);
    layers.add(superflatButton, 2);
    layers.add(default1, 2);
    layers.add(amplifiedButton, 2);

    // Actual Game Screen Adders
        // Movement
    layers.add(steve,3);
        // Creation/Destruction/Attacks Mechanics
    layers.add(breakButton, 2);
        // Commands, Chat, and Exit Mechanics
    layers.add(cancelButton, 3);
    layers.add(inventoryExitButton, 2);
        // Health Mechanics
    layers.add(titleScreenButton, 3);
    layers.add(respawnButton, 3);
    layers.add(playerHealthLabel,3);
        // Item Mechanics
    layers.add(swordButton);
    layers.add(axeButton);
    layers.add(bowButton);
    layers.add(shovelButton);
    layers.add(pickaxeButton);
        // Inventory Mechanics
    layers.add(inventoryButton, 3);
    layers.add(offhandButton, 3);
    layers.add(helmetButton, 3);
    layers.add(chestplateButton, 3);
    layers.add(leggingsButton, 3);
    layers.add(bootsButton, 3);
    layers.add(hotbarButton1, 3);
    layers.add(hotbarButton2, 3);
    layers.add(hotbarButton3,3);
    layers.add(hotbarButton4, 3);
    layers.add(hotbarButton5, 3);
    layers.add(hotbarButton6, 3);
    layers.add(hotbarButton7, 3);
    layers.add(hotbarButton8, 3);
    layers.add(hotbarButton9, 3);
    layers.add(inventoryButton1, 3);
    layers.add(inventoryButton2, 3);
    layers.add(inventoryButton3, 3);
    layers.add(inventoryButton4, 3);
    layers.add(inventoryButton5, 3);
    layers.add(inventoryButton6, 3);
    layers.add(inventoryButton7, 3);
    layers.add(inventoryButton8, 3);
    layers.add(inventoryButton9, 3);
    layers.add(inventoryButton10, 3);
    layers.add(inventoryButton11, 3);
    layers.add(inventoryButton12, 3);
    layers.add(inventoryButton13, 3);
    layers.add(inventoryButton14, 3);
    layers.add(inventoryButton15, 3);
    layers.add(inventoryButton16, 3);
    layers.add(inventoryButton17, 3);
    layers.add(inventoryButton18, 3);
    layers.add(inventoryButton19, 3);
    layers.add(inventoryButton20, 3);
    layers.add(inventoryButton21, 3);
    layers.add(inventoryButton22, 3);
    layers.add(inventoryButton23, 3);
    layers.add(inventoryButton24, 3);
    layers.add(inventoryButton25, 3);
    layers.add(inventoryButton26, 3);
    layers.add(inventoryButton27, 3);

    // Game Setup Layers
    layers.setLayer(defaultBackdrop, 1);
    layers.setLayer(worldCreationBackdrop, 1);
    layers.setLayer(createWorld, 2);
    layers.setLayer(cancelButton, 2);
    layers.setLayer(redButton, 2);
    layers.setLayer(blueButton, 2);
    layers.setLayer(greenButton, 2);
    layers.setLayer(lessRedButton, 2);
    layers.setLayer(lessBlueButton,2);
    layers.setLayer(lessGreenButton, 2);
    layers.setLayer(startButton, 2);
    layers.setLayer(customizeButton, 2);
    layers.setLayer(worldSettingsButton, 2);
    layers.setLayer(gameButton, 2);
    layers.setLayer(worldTypeButton, 2);
    layers.setLayer(gameModeButton, 2);
    layers.setLayer(creativeButton, 2);
    layers.setLayer(survivalButton, 2);
    layers.setLayer(adventureButton, 2);
    layers.setLayer(superflatButton, 2);
    layers.setLayer(default1, 2);
    layers.setLayer(amplifiedButton, 2);

    // Actual Game Screen Layers
        // Movement Mechanics
    layers.setLayer(steve, 3);
        // Health Mechanics
    layers.setLayer(playerHealthLabel,3);
    layers.setLayer(titleScreenButton, 3);
    layers.setLayer(respawnButton, 3);
        // Creation/Destruction/Attacks Mechanics
    layers.setLayer(breakButton, 2);
        // Commands/Chat/Exit Mechanics
    layers.setLayer(cancelButton, 3);
    layers.setLayer(inventoryExitButton, 2);
        // Item Mechanics
    layers.setLayer(swordButton,3);
    layers.setLayer(axeButton,3);
    layers.setLayer(bowButton,3);
    layers.setLayer(shovelButton,3);
    layers.setLayer(pickaxeButton,3);
        // Inventory Mechanics
    layers.setLayer(inventoryButton, 3);
    layers.setLayer(offhandButton, 3);
    layers.setLayer(helmetButton, 3);
    layers.setLayer(chestplateButton, 3);
    layers.setLayer(leggingsButton, 3);
    layers.setLayer(bootsButton, 3);
    layers.setLayer(hotbarButton1, 3);
    layers.setLayer(hotbarButton2, 3);
    layers.setLayer(hotbarButton3, 3);
    layers.setLayer(hotbarButton4, 3);
    layers.setLayer(hotbarButton5, 3);
    layers.setLayer(hotbarButton6, 3);
    layers.setLayer(hotbarButton7, 3);
    layers.setLayer(hotbarButton8, 3);
    layers.setLayer(hotbarButton9, 3);
    layers.setLayer(inventoryButton1, 3);
    layers.setLayer(inventoryButton2, 3);
    layers.setLayer(inventoryButton3, 3);
    layers.setLayer(inventoryButton4, 3);
    layers.setLayer(inventoryButton5, 3);
    layers.setLayer(inventoryButton6, 3);
    layers.setLayer(inventoryButton7, 3);
    layers.setLayer(inventoryButton8, 3);
    layers.setLayer(inventoryButton9, 3);
    layers.setLayer(inventoryButton10, 3);
    layers.setLayer(inventoryButton11, 3);
    layers.setLayer(inventoryButton12, 3);
    layers.setLayer(inventoryButton13, 3);
    layers.setLayer(inventoryButton14, 3);
    layers.setLayer(inventoryButton15, 3);
    layers.setLayer(inventoryButton16, 3);
    layers.setLayer(inventoryButton17, 3);
    layers.setLayer(inventoryButton18, 3);
    layers.setLayer(inventoryButton19, 3);
    layers.setLayer(inventoryButton20, 3);
    layers.setLayer(inventoryButton21, 3);
    layers.setLayer(inventoryButton22, 3);
    layers.setLayer(inventoryButton23, 3);
    layers.setLayer(inventoryButton24, 3);
    layers.setLayer(inventoryButton25, 3);
    layers.setLayer(inventoryButton26, 3);
    layers.setLayer(inventoryButton27, 3);


    defaultBackdrop.setSize(gameWindow.getWidth(), gameWindow.getHeight());
    defaultBackdrop.setLocation(0, 0);
    defaultBackdrop.setBounds(0, 0, gameWindow.getWidth(), gameWindow.getHeight());
    defaultBackdrop.setVisible(true);
    defaultBackdrop.setOpaque(false);

    worldCreationBackdrop.setSize(gameWindow.getWidth(), gameWindow.getHeight());
    worldCreationBackdrop.setLocation(0, 0);
    worldCreationBackdrop.setBounds(0, 0, gameWindow.getWidth(), gameWindow.getHeight());
    worldCreationBackdrop.setVisible(false);
    worldCreationBackdrop.setOpaque(false);

    mainGameScreen.setSize(gameWindow.getWidth(), gameWindow.getHeight());
    mainGameScreen.setLocation(0, 0);
    mainGameScreen.setBounds(0,0,gameWindow.getWidth(),gameWindow.getHeight());
    mainGameScreen.setVisible(false);
    mainGameScreen.setOpaque(false);

    setButtonCenter(createWorld, 530, 700, 220, 40);
    createWorld.setSize(220, 40);
    createWorld.setVisible(false);
    createWorld.setOpaque(false);

        steve.setBounds(steve.playerXMovement[0], steve.playerYMovement[0], 80, 80);
        steve.setVisible(false);
        steve.setOpaque(false);

        breakButton.setLocation(0, 0);
        breakButton.setSize(1500, 1000);
        breakButton.setVisible(false);
        breakButton.setOpaque(false);
        breakButton.setContentAreaFilled(false);
        breakButton.setBorderPainted(false);

        cancelButton.setLocation(0, 0);
        cancelButton.setSize(80, 20);
        cancelButton.setVisible(false);
        cancelButton.setOpaque(false);

        inventoryExitButton.setLocation(0, 0);
        inventoryExitButton.setSize(1500, 1000);
        inventoryExitButton.setVisible(false);
        inventoryExitButton.setOpaque(false);
        inventoryExitButton.setContentAreaFilled(false);
        inventoryExitButton.setBorderPainted(false);

        playerHealthLabel.setLocation(340,765);
        playerHealthLabel.setBounds(340, 740, 250, 40);
        playerHealthLabel.setFont(new Font("Arial", Font.BOLD, 25));
        playerHealthLabel.setForeground(Color.RED);
        playerHealthLabel.setVisible(false);
        playerHealthLabel.setOpaque(false);

        setButtonCenter(offhandButton, 340, 700, 65, 65);
        offhandButton.setSize(65, 65);
        offhandButton.setVisible(false);
        offhandButton.setOpaque(false);

        setButtonCenter(hotbarButton1, 370, 700, 60, 60);
        hotbarButton1.setSize(65, 65);
        hotbarButton1.setVisible(false);
        hotbarButton1.setOpaque(false);

        setButtonCenter(hotbarButton2, 430, 700, 60, 60);
        hotbarButton2.setSize(65, 65);
        hotbarButton2.setVisible(false);
        hotbarButton2.setOpaque(false);

        setButtonCenter(hotbarButton3, 490, 700, 60, 60);
        hotbarButton3.setSize(65, 65);
        hotbarButton3.setVisible(false);
        hotbarButton3.setOpaque(false);

        setButtonCenter(hotbarButton4, 550, 700, 60, 60);
        hotbarButton4.setSize(65, 65);
        hotbarButton4.setVisible(false);
        hotbarButton4.setOpaque(false);

        setButtonCenter(hotbarButton5, 610, 700, 60, 60);
        hotbarButton5.setSize(65, 65);
        hotbarButton5.setVisible(false);
        hotbarButton5.setOpaque(false);

        setButtonCenter(hotbarButton6, 670, 700, 60, 60);
        hotbarButton6.setSize(65, 65);
        hotbarButton6.setVisible(false);
        hotbarButton6.setOpaque(false);

        setButtonCenter(hotbarButton7, 730, 700, 60, 60);
        hotbarButton7.setSize(65, 65);
        hotbarButton7.setVisible(false);
        hotbarButton7.setOpaque(false);

        setButtonCenter(hotbarButton8, 790, 700, 60, 60);
        hotbarButton8.setSize(65, 65);
        hotbarButton8.setVisible(false);
        hotbarButton8.setOpaque(false);

        setButtonCenter(hotbarButton9, 850, 700, 60, 60);
        hotbarButton9.setSize(65, 65);
        hotbarButton9.setVisible(false);
        hotbarButton9.setOpaque(false);

        setButtonCenter(inventoryButton, 910, 700, 65, 65);
        inventoryButton.setSize(65, 65);
        inventoryButton.setVisible(false);
        inventoryButton.setOpaque(false);
        inventoryButton.setFocusable(true);

            setButtonCenter(helmetButton, 100, 700, 80, 80);
            helmetButton.setSize(80, 80);
            helmetButton.setVisible(false);
            helmetButton.setOpaque(false);

            setButtonCenter(chestplateButton, 100, 700, 80, 80);
            chestplateButton.setSize(80, 80);
            chestplateButton.setVisible(false);
            chestplateButton.setOpaque(false);

            setButtonCenter(leggingsButton, 100, 700, 80, 80);
            leggingsButton.setSize(80, 80);
            leggingsButton.setVisible(false);
            leggingsButton.setOpaque(false);

            setButtonCenter(bootsButton, 100, 700, 80, 80);
            bootsButton.setSize(80, 80);
            bootsButton.setVisible(false);
            bootsButton.setOpaque(false);

            setButtonCenter(inventoryButton1, 420, 360, 60, 60);
            inventoryButton1.setSize(60, 60);
            inventoryButton1.setVisible(false);
            inventoryButton1.setOpaque(false);

            setButtonCenter(inventoryButton2, 480, 360, 60, 60);
            inventoryButton2.setSize(60, 60);
            inventoryButton2.setVisible(false);
            inventoryButton2.setOpaque(false);

            setButtonCenter(inventoryButton3, 540, 360, 80, 80);
            inventoryButton3.setSize(80, 80);
            inventoryButton3.setVisible(false);
            inventoryButton3.setOpaque(false);

            setButtonCenter(inventoryButton4, 600, 360, 80, 80);
            inventoryButton4.setSize(80, 80);
            inventoryButton4.setVisible(false);
            inventoryButton4.setOpaque(false);

            setButtonCenter(inventoryButton5, 660, 360, 80, 80);
            inventoryButton5.setSize(80, 80);
            inventoryButton5.setVisible(false);
            inventoryButton5.setOpaque(false);

            setButtonCenter(inventoryButton6, 720, 360, 80, 80);
            inventoryButton6.setSize(80, 80);
            inventoryButton6.setVisible(false);
            inventoryButton6.setOpaque(false);

            setButtonCenter(inventoryButton7, 780, 360, 80, 80);
            inventoryButton7.setSize(80, 80);
            inventoryButton7.setVisible(false);
            inventoryButton7.setOpaque(false);

            setButtonCenter(inventoryButton8, 640, 360, 80, 80);
            inventoryButton8.setSize(80, 80);
            inventoryButton8.setVisible(false);
            inventoryButton8.setOpaque(false);

            setButtonCenter(inventoryButton9, 100, 420, 80, 80);
            inventoryButton9.setSize(80, 80);
            inventoryButton9.setVisible(false);
            inventoryButton9.setOpaque(false);

            setButtonCenter(inventoryButton10, 160, 420, 80, 80);
            inventoryButton10.setSize(80, 80);
            inventoryButton10.setVisible(false);
            inventoryButton10.setOpaque(false);

            setButtonCenter(inventoryButton11, 220, 420, 80, 80);
            inventoryButton11.setSize(80, 80);
            inventoryButton11.setVisible(false);
            inventoryButton11.setOpaque(false);

            setButtonCenter(inventoryButton12, 280, 420, 80, 80);
            inventoryButton12.setSize(80, 80);
            inventoryButton12.setVisible(false);
            inventoryButton12.setOpaque(false);

            setButtonCenter(inventoryButton13, 340, 420, 80, 80);
            inventoryButton13.setSize(80, 80);
            inventoryButton13.setVisible(false);
            inventoryButton13.setOpaque(false);

            setButtonCenter(inventoryButton14, 400, 420, 80, 80);
            inventoryButton14.setSize(80, 80);
            inventoryButton14.setVisible(false);
            inventoryButton14.setOpaque(false);

            setButtonCenter(inventoryButton15, 460, 420, 80, 80);
            inventoryButton15.setSize(80, 80);
            inventoryButton15.setVisible(false);
            inventoryButton15.setOpaque(false);

            setButtonCenter(inventoryButton16, 520, 420, 80, 80);
            inventoryButton16.setSize(80, 80);
            inventoryButton16.setVisible(false);
            inventoryButton16.setOpaque(false);

            setButtonCenter(inventoryButton17, 580, 420, 80, 80);
            inventoryButton17.setSize(80, 80);
            inventoryButton17.setVisible(false);
            inventoryButton17.setOpaque(false);

            setButtonCenter(inventoryButton18, 640, 420, 60, 60);
            inventoryButton18.setSize(80, 80);
            inventoryButton18.setVisible(false);
            inventoryButton18.setOpaque(false);

            setButtonCenter(inventoryButton19, 160, 480, 60, 60);
            inventoryButton19.setSize(60, 60);
            inventoryButton19.setVisible(false);
            inventoryButton19.setOpaque(false);

            setButtonCenter(inventoryButton20, 220, 480, 60, 60);
            inventoryButton20.setSize(60, 60);
            inventoryButton20.setVisible(false);
            inventoryButton20.setOpaque(false);

            setButtonCenter(inventoryButton21, 280, 480, 60, 60);
            inventoryButton21.setSize(60, 60);
            inventoryButton21.setVisible(false);
            inventoryButton21.setOpaque(false);

            setButtonCenter(inventoryButton22, 340, 480, 60, 60);
            inventoryButton22.setSize(60, 60);
            inventoryButton22.setVisible(false);
            inventoryButton22.setOpaque(false);

            setButtonCenter(inventoryButton23, 400, 480, 60, 60);
            inventoryButton23.setSize(60, 60);
            inventoryButton23.setVisible(false);
            inventoryButton23.setOpaque(false);

            setButtonCenter(inventoryButton24, 460, 480, 60, 60);
            inventoryButton24.setSize(60, 80);
            inventoryButton24.setVisible(false);
            inventoryButton24.setOpaque(false);

            setButtonCenter(inventoryButton25, 520, 480, 60, 60);
            inventoryButton25.setSize(60, 60);
            inventoryButton25.setVisible(false);
            inventoryButton25.setOpaque(false);

            setButtonCenter(inventoryButton26, 580, 480, 60, 60);
            inventoryButton26.setSize(60, 60);
            inventoryButton26.setVisible(false);
            inventoryButton26.setOpaque(false);

            setButtonCenter(inventoryButton27, 640, 480, 60, 60);
            inventoryButton27.setSize(60, 60);
            inventoryButton27.setVisible(false);
            inventoryButton27.setOpaque(false);

    setButtonCenter(startButton, 640, 490, 180, 40);
    startButton.setSize(180, 40);
    startButton.setVisible(true);
    startButton.setOpaque(false);

    setButtonCenter(cancelButton, 750, 700, 180, 40);
    cancelButton.setSize(180, 40);
    cancelButton.setVisible(false);
    cancelButton.setOpaque(false);

    customizeButton.setLocation(310, 100);
    customizeButton.setSize(220, 40);
    customizeButton.setVisible(false);
    customizeButton.setOpaque(false);

        setButtonCenter(lessRedButton, 440, 360, 180, 40);
        lessRedButton.setSize(180, 40);
        lessRedButton.setVisible(false);
        lessRedButton.setOpaque(false);

        setButtonCenter(redButton, 440, 300, 180, 40);
        redButton.setSize(180, 40);
        redButton.setVisible(false);
        redButton.setOpaque(false);

        setButtonCenter(lessBlueButton, 640, 360, 180, 40);
        lessBlueButton.setSize(180, 40);
        lessBlueButton.setVisible(false);
        lessBlueButton.setOpaque(false);

        setButtonCenter(blueButton, 640, 300, 180, 40);
        blueButton.setSize(180, 40);
        blueButton.setVisible(false);
        blueButton.setOpaque(false);

        setButtonCenter(lessGreenButton, 840, 360, 180, 40);
        lessGreenButton.setSize(180, 40);
        lessGreenButton.setVisible(false);
        lessGreenButton.setOpaque(false);

        setButtonCenter(greenButton, 840, 300, 180, 40);
        greenButton.setSize(180, 40);
        greenButton.setVisible(false);
        greenButton.setOpaque(false);

    gameButton.setLocation(530, 100);
    gameButton.setSize(220, 40);
    gameButton.setVisible(false);
    gameButton.setOpaque(false);

        gameModeButton.setLocation(530, 150);
        gameModeButton.setSize(220, 40);
        gameModeButton.setVisible(false);
        gameModeButton.setOpaque(false);

            survivalButton.setLocation(530, 150);
            survivalButton.setSize(220, 40);
            survivalButton.setVisible(false);
            survivalButton.setOpaque(false);

            creativeButton.setLocation(530, 190);
            creativeButton.setSize(220, 40);
            creativeButton.setVisible(false);
            creativeButton.setOpaque(false);

            adventureButton.setLocation(530, 230);
            adventureButton.setSize(220, 40);
            adventureButton.setVisible(false);
            adventureButton.setOpaque(false);

    worldSettingsButton.setLocation(750, 100);
    worldSettingsButton.setSize(180, 40);
    worldSettingsButton.setVisible(false);
    worldSettingsButton.setOpaque(false);

        worldTypeButton.setLocation(750, 150);
        worldTypeButton.setSize(180, 40);
        worldTypeButton.setVisible(false);
        worldTypeButton.setOpaque(false);

            amplifiedButton.setLocation(750, 150);
            amplifiedButton.setSize(180, 40);
            amplifiedButton.setVisible(false);
            amplifiedButton.setOpaque(false);

            superflatButton.setLocation(750, 190);
            superflatButton.setSize(180, 40);
            superflatButton.setVisible(false);
            superflatButton.setOpaque(false);

            default1.setLocation(750, 230);
            default1.setSize(180, 40);
            default1.setVisible(false);
            default1.setOpaque(false);


    gameWindow.setVisible(true);
    layers.setVisible(true);

    startButton.addActionListener(_ -> {
        startButton.setVisible(false);
        defaultBackdrop.setVisible(false);
        worldCreationBackdrop.setVisible(true);
        createWorld.setVisible(true);
        cancelButton.setVisible(true);
        showButtons(customizeButton, worldSettingsButton, gameButton);
    });
    cancelButton.addActionListener(click -> {
        cancelButton.setVisible(false);
        createWorld.setVisible(false);
        worldCreationBackdrop.setVisible(false);
        worldCreationBackdrop.isCustom = false;
        worldTypeButton.repaint();
        hideButtons(redButton, blueButton, greenButton);
        hideButtons(lessRedButton, lessBlueButton, lessGreenButton);
        hideButtons(adventureButton, creativeButton, survivalButton);
        hideButtons(amplifiedButton, superflatButton, default1);
        hideButtons(worldSettingsButton, customizeButton, gameButton);
        gameModeButton.setVisible(false);
        worldTypeButton.setVisible(false);
        defaultBackdrop.setVisible(true);
        startButton.setVisible(true);
    });
    createWorld.addActionListener(click -> {
        createWorld.setVisible(false);
        cancelButton.setVisible(false);
        worldCreationBackdrop.setVisible(false);
        worldCreationBackdrop.isCustom = false;
        worldTypeButton.repaint();
        hideButtons(redButton, blueButton, greenButton);
        hideButtons(lessRedButton, lessBlueButton, lessGreenButton);
        hideButtons(survivalButton, creativeButton, adventureButton);
        hideButtons(gameButton, worldSettingsButton, customizeButton);
        gameModeButton.setVisible(false);
        worldTypeButton.setVisible(false);
        //mainGameScreen.setVisible(true);
        //mainGameScreen.repaint();
        playerHealthLabel.setVisible(true);
        steve.setVisible(true);
        steve.repaint();
        showHotbarButtons(hotbarButton1, hotbarButton2, hotbarButton3, hotbarButton4, hotbarButton5, hotbarButton6, hotbarButton7, hotbarButton8, hotbarButton9);
        offhandButton.setVisible(true);
        breakButton.setVisible(true);
        createWorldPressed[0] = true;
    });

            // the Actual code for the Game

            if (mainGameScreen.playerHealth == 20) {
            playerHealthLabel.setText("()()()()()()()()()()");
            }
            if (mainGameScreen.playerHealth == 19) {
            playerHealthLabel.setText("()()()()()()()()()(");
            }
            if (mainGameScreen.playerHealth == 18) {
            playerHealthLabel.setText("()()()()()()()()()");
            }
            if (mainGameScreen.playerHealth == 17) {
            playerHealthLabel.setText("()()()()()()()()(");
            }
            if (mainGameScreen.playerHealth == 16) {
            playerHealthLabel.setText("()()()()()()()()");
            }
            if (mainGameScreen.playerHealth == 15) {
            playerHealthLabel.setText("()()()()()()()(");
            }
            if (mainGameScreen.playerHealth == 14) {
            playerHealthLabel.setText("()()()()()()()");
            }
            if (mainGameScreen.playerHealth == 13) {
            playerHealthLabel.setText("()()()()()()(");
            }
            if (mainGameScreen.playerHealth == 12) {
            playerHealthLabel.setText("()()()()()()");
            }
            if (mainGameScreen.playerHealth == 11) {
            playerHealthLabel.setText("()()()()()(");
            }
            if (mainGameScreen.playerHealth == 10) {
            playerHealthLabel.setText("()()()()()");
            }
            if (mainGameScreen.playerHealth == 9) {
            playerHealthLabel.setText("()()()()(");
            }
            if (mainGameScreen.playerHealth == 8) {
            playerHealthLabel.setText("()()()()");
            }
            if (mainGameScreen.playerHealth == 7) {
            playerHealthLabel.setText("()()()(");
            }
            if (mainGameScreen.playerHealth == 6) {
            playerHealthLabel.setText("()()()");
            }
            if (mainGameScreen.playerHealth == 5) {
            playerHealthLabel.setText("()()(");
            }
            if (mainGameScreen.playerHealth == 4) {
            playerHealthLabel.setText("()()");
            }
            if (mainGameScreen.playerHealth == 3) {
            playerHealthLabel.setText("()(");
            }
            if (mainGameScreen.playerHealth == 2) {
            playerHealthLabel.setText("()");
            }
            if (mainGameScreen.playerHealth == 1) {
            playerHealthLabel.setText("(");
            }
            if (mainGameScreen.playerHealth <= 0) {
            mainGameScreen.repaint();
            }


                        // Inventory KeyListeners
            KeyListener openInventory = new  KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode()==KeyEvent.VK_E) {
                            breakButton.setVisible(false);
                            showInventoryButtons(inventoryButton1, inventoryButton2, inventoryButton3, inventoryButton4, inventoryButton5,
                                    inventoryButton6, inventoryButton7, inventoryButton8, inventoryButton9, inventoryButton10,
                                    inventoryButton11, inventoryButton12, inventoryButton13, inventoryButton14, inventoryButton15,
                                    inventoryButton16, inventoryButton17, inventoryButton18, inventoryButton19, inventoryButton20,
                                    inventoryButton21, inventoryButton22, inventoryButton23, inventoryButton24,
                                    inventoryButton25, inventoryButton26, inventoryButton27);
                            showButtons(helmetButton, chestplateButton, leggingsButton);
                            bootsButton.setVisible(true);
                            inventoryExitButton.setVisible(true);
                        };
                }
            };

            if (createWorldPressed[0] && !inventoryExitButton.isVisible()) {
                inventoryButton.addKeyListener(openInventory);
            }
                // Commands/Chat/Exit keyListeners

            KeyListener closeInventory = new  KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode()==KeyEvent.VK_E) {
                            hideInventoryButtons(inventoryButton1, inventoryButton2, inventoryButton3, inventoryButton4, inventoryButton5,
                                    inventoryButton6, inventoryButton7, inventoryButton8, inventoryButton9, inventoryButton10,
                                    inventoryButton11, inventoryButton12, inventoryButton13, inventoryButton14, inventoryButton15,
                                    inventoryButton16, inventoryButton17, inventoryButton18, inventoryButton19, inventoryButton20,
                                    inventoryButton21, inventoryButton22, inventoryButton23, inventoryButton24,
                                    inventoryButton25, inventoryButton26, inventoryButton27);
                            hideButtons(helmetButton, chestplateButton, leggingsButton);
                            bootsButton.setVisible(false);
                            inventoryExitButton.setVisible(false);
                            breakButton.setVisible(true);
                            showHotbarButtons(hotbarButton1,hotbarButton2,hotbarButton3,hotbarButton4,hotbarButton5,hotbarButton6,hotbarButton7,hotbarButton8,hotbarButton9);
                    }
                }
            };

            if (createWorldPressed[0] && inventoryExitButton.isVisible()) {
                inventoryExitButton.addKeyListener(closeInventory);
            }
            KeyListener exitGame = new  KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_ESCAPE) {
                        hideInventoryButtons(inventoryButton1, inventoryButton2, inventoryButton3, inventoryButton4, inventoryButton5,
                                inventoryButton6, inventoryButton7, inventoryButton8, inventoryButton9, inventoryButton10,
                                inventoryButton11, inventoryButton12, inventoryButton13, inventoryButton14, inventoryButton15,
                                inventoryButton16, inventoryButton17, inventoryButton18, inventoryButton19, inventoryButton20,
                                inventoryButton21, inventoryButton22, inventoryButton23, inventoryButton24,
                                inventoryButton25, inventoryButton26, inventoryButton27);
                        hideButtons(helmetButton, chestplateButton, leggingsButton);
                        bootsButton.setVisible(false);
                        inventoryExitButton.setVisible(false);
                        breakButton.setVisible(false);
                        hideHotbarButtons(hotbarButton1,hotbarButton2,hotbarButton3,hotbarButton4,hotbarButton5,hotbarButton6,hotbarButton7,hotbarButton8,hotbarButton9);
                    }
                }
            };
            if (createWorldPressed[0]) {
                inventoryExitButton.addKeyListener(exitGame);
            }

                        // Moving keyListeners
            KeyListener forwardMover = new  KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                   if (e.getKeyCode()==KeyEvent.VK_W) {
                       // if no block in front
                       steve.playerYMovement[0]++;
                       steve.setLocation(
                               steve.playerXMovement[0],
                               steve.playerYMovement[0]
                       );
                       steve.repaint();
                   }
                }
            };
            if (createWorldPressed[0]) {
                steve.addKeyListener(forwardMover);
            }
            KeyListener backwardMover = new  KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_S) {
                        // if no block behind
                        steve.playerYMovement[0]--;
                        steve.setLocation(
                                steve.playerXMovement[0],
                                steve.playerYMovement[0]
                        );
                        steve.repaint();
                    }
                }
            };
            if (createWorldPressed[0]) {
                //steve.addKeyListener(backwardMover);
            }
            KeyListener leftMover = new  KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_A) {
                        // if no block to left
                        steve.playerXMovement[0]--;
                        steve.setLocation(
                                steve.playerXMovement[0],
                                steve.playerYMovement[0]
                        );
                        steve.repaint();
                    }
                }
            };
            if (createWorldPressed[0]) {
                steve.addKeyListener(leftMover);
            }
            KeyListener rightMover = new  KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_D) {
                        // if no block to right
                        steve.playerXMovement[0]++;
                        steve.setLocation(
                                steve.playerXMovement[0],
                                steve.playerYMovement[0]
                        );
                        steve.repaint();
                    }
                }
            };
            if (createWorldPressed[0]) {
                steve.addKeyListener(rightMover);
            }
            KeyListener upMover = new  KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e){
                    if (e.getKeyCode()==KeyEvent.VK_UP) {
                        steve.playerZMovement[0]++;
                        steve.repaint();
                    }
                }
            };
            if (createWorldPressed[0]) {
                steve.addKeyListener(upMover);
            }


    customizeButton.addActionListener(click -> {
        hideButtons(survivalButton, creativeButton, adventureButton);
        hideButtons(superflatButton, amplifiedButton, default1);
        worldTypeButton.setVisible(false);
        gameModeButton.setVisible(false);
        worldCreationBackdrop.isCustom = true;
        worldCreationBackdrop.repaint();
        showButtons(redButton, blueButton, greenButton);
        showButtons(lessRedButton, lessBlueButton, lessGreenButton);
        showButtons(gameButton, customizeButton, worldSettingsButton);
    });
            redButton.addActionListener(click -> {
            worldCreationBackdrop.redPlayerColor =
                    Math.min(255, worldCreationBackdrop.redPlayerColor + 17);
            worldCreationBackdrop.repaint();
            });

            lessRedButton.addActionListener(click -> {
                worldCreationBackdrop.redPlayerColor =
                        Math.max(0, worldCreationBackdrop.redPlayerColor - 17);
                worldCreationBackdrop.repaint();
            });

            blueButton.addActionListener(click -> {
                worldCreationBackdrop.bluePlayerColor =
                        Math.min(255, worldCreationBackdrop.bluePlayerColor + 17);
                worldCreationBackdrop.repaint();
            });

            lessBlueButton.addActionListener(click -> {
                worldCreationBackdrop.bluePlayerColor =
                        Math.max(0, worldCreationBackdrop.bluePlayerColor - 17);
                worldCreationBackdrop.repaint();
            });

            greenButton.addActionListener(click -> {
                worldCreationBackdrop.greenPlayerColor =
                        Math.min(255, worldCreationBackdrop.greenPlayerColor + 17);
                worldCreationBackdrop.repaint();
            });

            lessGreenButton.addActionListener(click -> {
                worldCreationBackdrop.greenPlayerColor =
                        Math.max(0, worldCreationBackdrop.greenPlayerColor - 17);
                worldCreationBackdrop.repaint();
            });

        gameButton.addActionListener(click -> {
            hideButtons(redButton, blueButton, greenButton);
            hideButtons(lessRedButton, lessBlueButton, lessGreenButton);
            hideButtons(superflatButton, amplifiedButton, default1);
            worldTypeButton.setVisible(false);
            worldCreationBackdrop.isCustom = false;
            worldCreationBackdrop.repaint();
            if (!survivalButton.isVisible() && !adventureButton.isVisible() && !creativeButton.isVisible()) {
                gameModeButton.setVisible(true);
            }
            showButtons(gameButton, customizeButton, worldSettingsButton);
        });
                gameModeButton.addActionListener(click -> {
                    gameModeButton.setVisible(false);
                    showButtons(survivalButton, adventureButton, creativeButton);
                });
                        survivalButton.addActionListener(click -> {
                        hideButtons(survivalButton, creativeButton, adventureButton);
                        gameModeButton.setVisible(true);
                        gameModeButton.setText("Survival");
                        });

                        creativeButton.addActionListener(click -> {
                            hideButtons(survivalButton, creativeButton, adventureButton);
                            gameModeButton.setVisible(true);
                            gameModeButton.setText("Creative");
                        });

                        adventureButton.addActionListener(click -> {
                            hideButtons(adventureButton, survivalButton, creativeButton);
                            gameModeButton.setVisible(true);
                            gameModeButton.setText("Adventure");
                        });

        worldSettingsButton.addActionListener(click -> {
            hideButtons(redButton, blueButton, greenButton);
            hideButtons(lessBlueButton, lessGreenButton, lessRedButton);
            hideButtons(survivalButton, creativeButton, adventureButton);
            gameModeButton.setVisible(false);
            worldCreationBackdrop.isCustom = false;
            worldCreationBackdrop.repaint();
            showButtons(gameButton, customizeButton, worldSettingsButton);
            if (!amplifiedButton.isVisible() && !superflatButton.isVisible() && !default1.isVisible()) {
                worldTypeButton.setVisible(true);
            }
        });
                worldTypeButton.addActionListener(click -> {
                    worldTypeButton.setVisible(false);
                    showButtons(amplifiedButton, superflatButton, default1);
                });
                            superflatButton.addActionListener(click -> {
                                hideButtons(superflatButton, default1, amplifiedButton);
                                worldTypeButton.setVisible(true);
                                worldTypeButton.setText("Superflat");
                            });

                            default1.addActionListener(click -> {
                                hideButtons(superflatButton, default1, amplifiedButton);
                                worldTypeButton.setVisible(true);
                                worldTypeButton.setText("Default");
                            });

                            amplifiedButton.addActionListener(click -> {
                                hideButtons(superflatButton, default1, amplifiedButton);
                                worldTypeButton.setVisible(true);
                                worldTypeButton.setText("Amplified");
                            });


    }

    public static void setButtonCenter(
            JButton button, int x, int y, int width, int height) {

        button.setBounds(
                x - width / 2,
                y - height / 2,
                width,
                height
        );
    }

    public static void hideButtons(JButton button1, JButton button2, JButton button3) {
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
    }

    public static void showButtons(JButton button1, JButton button2, JButton button3) {
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
    }

    public static void hideInventoryButtons(JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10, JButton button11, JButton button12, JButton button13, JButton button14, JButton button15, JButton button16, JButton button17, JButton button18, JButton button19, JButton button20, JButton button21, JButton button22, JButton button23, JButton button24, JButton button25, JButton button26, JButton button27) {
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);
        button13.setVisible(false);
        button14.setVisible(false);
        button15.setVisible(false);
        button16.setVisible(false);
        button17.setVisible(false);
        button18.setVisible(false);
        button19.setVisible(false);
        button20.setVisible(false);
        button21.setVisible(false);
        button22.setVisible(false);
        button23.setVisible(false);
        button24.setVisible(false);
        button25.setVisible(false);
        button26.setVisible(false);
        button27.setVisible(false);
    }

    public static void showInventoryButtons(JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10, JButton button11, JButton button12, JButton button13, JButton button14, JButton button15, JButton button16, JButton button17, JButton button18, JButton button19, JButton button20, JButton button21, JButton button22, JButton button23, JButton button24, JButton button25, JButton button26, JButton button27) {
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);
        button8.setVisible(true);
        button9.setVisible(true);
        button10.setVisible(true);
        button11.setVisible(true);
        button12.setVisible(true);
        button13.setVisible(true);
        button14.setVisible(true);
        button15.setVisible(true);
        button16.setVisible(true);
        button17.setVisible(true);
        button18.setVisible(true);
        button19.setVisible(true);
        button20.setVisible(true);
        button21.setVisible(true);
        button22.setVisible(true);
        button23.setVisible(true);
        button24.setVisible(true);
        button25.setVisible(true);
        button26.setVisible(true);
        button27.setVisible(true);
    }

    public static void hideHotbarButtons(JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9) {
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);

    }

    public static void showHotbarButtons(JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9) {
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);
        button8.setVisible(true);
        button9.setVisible(true);

    }
}

// copy and pastable for not typing
// showInventoryButtons(inventoryButton1,inventoryButton2,inventoryButton3,inventoryButton4,inventoryButton5,
//                    inventoryButton6,inventoryButton7,inventoryButton8,inventoryButton9,inventoryButton10,
//                    inventoryButton11, inventoryButton12,inventoryButton13,inventoryButton14,inventoryButton15,
//                    inventoryButton16,inventoryButton17,inventoryButton18,inventoryButton19,inventoryButton20,
//                    inventoryButton21,inventoryButton22,inventoryButton23,inventoryButton24,
//                    inventoryButton25,inventoryButton26,inventoryButton27);