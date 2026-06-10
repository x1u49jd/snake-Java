package main;
import java.awt.Color;
import java.awt.Graphics;

public class Cell {

    private int row;
    private int col;
    private int size;
    private boolean active;

    public Cell(int row, int col, int size) {
        this.row = row;
        this.col = col;
        this.size = size;
        this.active = false;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void draw(Graphics g) {
        int x = col * size;
        int y = row * size;

        // draw active/unactive cells
        g.setColor(active ? Color.GREEN : Color.GRAY);
        g.fillRect(x, y, size, size);

        // draw grid lines
        g.setColor(Color.DARK_GRAY);
        g.drawRect(x, y, size, size);
    }
}
