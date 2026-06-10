package main;
import javax.swing.JFrame;

import entities.Snake;

public class Game {
    JFrame frame = new JFrame();
    Panel panel = new Panel();
    InputHandler inputHandler = new InputHandler();
    Snake snake = new Snake(5, 5);

    public void gameLoop() {
        while(true) {
            snake.move(inputHandler.getDirection());
            panel.update(snake);

            // wait 120 ms between updates (roughly 8 fps)
            try {
                Thread.sleep(120);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Game() {
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setTitle("Snake");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.addKeyListener(inputHandler);

        new Thread(this::gameLoop).start();
    }
}
