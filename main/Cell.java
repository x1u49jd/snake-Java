package main;
import java.awt.Color;
import java.awt.Graphics;

public class Cell {

    private int row;
    private int col;
    private int size;
    private CellType type;

    public Cell(int row, int col, int size) {
        this.row = row;
        this.col = col;
        this.size = size;
        this.type = CellType.EMPTY;
    }

    public void setType(CellType type) {
        this.type = type;
    }

    public void draw(Graphics g) {
        int x = col * size;
        int y = row * size;

        // set colour to each type of cell and draw it as a square
        if (type == CellType.EMPTY) {
        g.setColor(Color.GRAY);
        }
        if (type == CellType.SNAKE) {
        g.setColor(Color.GREEN);
        }
        if (type == CellType.FOOD) {
        g.setColor(Color.ORANGE);
        }
        g.fillRect(x, y, size, size);

        // draw grid lines
        g.setColor(Color.DARK_GRAY);
        g.drawRect(x, y, size, size);
    }
}
