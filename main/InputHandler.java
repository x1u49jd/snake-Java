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

        if ((key == KeyEvent.VK_UP || key == KeyEvent.VK_W) && !direction.equals( "DOWN")) {
            direction = "UP";
        }
        else if ((key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) && !direction.equals( "UP")) {
            direction = "DOWN";
        }
        else if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) && !direction.equals( "RIGHT")) {
            direction = "LEFT";
        }
        else if ((key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) && !direction.equals( "LEFT")) {
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
