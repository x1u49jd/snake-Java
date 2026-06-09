package main;
import javax.swing.JFrame;

public class Game {

    public Game() {
        JFrame frame = new JFrame();
        Panel panel = new Panel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setTitle("Snake");
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
}
