package main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

    private String direction = "RIGHT";

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key =  e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            direction = "UP";
        }
        else if (key == KeyEvent.VK_DOWN) {
            direction = "DOWN";
        }
        else if (key == KeyEvent.VK_LEFT) {
            direction = "LEFT";

        }
        else if (key == KeyEvent.VK_RIGHT) {
            direction = "RIGHT";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public String getDirection() {
        return direction;
    }
}
