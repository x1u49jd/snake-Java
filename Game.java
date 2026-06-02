import javax.swing.JFrame;

public class Game {

    public Game() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setTitle("Snake");
    }
}
