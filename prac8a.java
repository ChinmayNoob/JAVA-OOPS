// Write a program that moves a circle up, down, left or right using arrow keys.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private int circleX = 200;
    private int circleY = 200;

    public Main() {
        setTitle("Circle Movement");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(circleX, circleY, 50, 50);
            }
        };

        panel.setFocusable(true);
        panel.requestFocusInWindow();
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        circleY -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        circleY += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        circleX -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        circleX += 10;
                        break;
                }
                panel.repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}