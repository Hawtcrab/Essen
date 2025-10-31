package main.game.gui.screens;



import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.LinkedList;

public class BaseScreen extends JPanel {
    protected BufferedImage backgroundImage;

    public BaseScreen() {}
    public BaseScreen (String imagePath) {
        setLayout(null);
        try {
            URL url = getClass().getResource(imagePath);
            System.out.println("DEBUG: Resource URL = " + url);
            if (url == null) {
                System.err.println("ERROR: Resource not found! " + imagePath);
            } else {
                backgroundImage = ImageIO.read(url);
                System.out.println("DEBUG: Image loaded successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        paintElements();
        paintButtons();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            // Draw the image stretched to fill the panel
            g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            g2d.dispose();
        }
    }

    protected JTextPane prepareTextPane (int x, int y, int width, int height) {
        var comp = new JTextPane();
        comp.setBounds(x,y, width, height);
        comp.setText("Default Title");
        comp.setEditable(false);
        comp.setPreferredSize(new Dimension(width,height));
        StyledDocument doc = comp.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);

        // Apply to all text
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        comp.setBackground(Color.BLACK);
        comp.setForeground(Color.WHITE);
        return comp;
    }

    protected void paintElements() {
        var title = prepareTextPane(250, 10, 100, 20);
        title.setText("Some Location");
        this.add(title);
        var action = prepareTextPane(10, 370,110,20);
        action.setText("Action");
        this.add(action);
        title.setVisible(true);
    }

    protected void paintButtons() {
        var basex = 10;
        var basey = 400;


        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                var button = prepareTextPane(
                        basex + col * 40,
                        basey + row * 40,
                        30, 30);
                button.setText("X");
                this.add(button);
                button.setVisible(true);
            }
        }
    }
}
