import java.awt.Color;
import java.awt.Graphics;

public class Cell {

    private int x;
    private int y;
    private int size;
    private boolean active;

    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.active = false;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void draw(Graphics g) {
        g.setColor(active ? Color.GREEN : Color.GRAY);
        g.fillRect(x, y, size, size);
    }
}
