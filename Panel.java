import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {
    private final int rows = 20;
    private final int cols = 20;
    private final int cellSize = 25;

    private Cell[][] cells;

    public Panel() {
        setPreferredSize(new Dimension(cols * cellSize, rows * cellSize));

        // populate the array with Cell objects
        cells = new Cell[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[r][c] = new Cell(r, c, cellSize);
            }
        }

        cells[5][5].setActive(true);
        cells[5][6].setActive(true);
        cells[5][7].setActive(true);
        cells[6][8].setActive(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw all cells from the array
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[r][c].draw(g);
            }
        }
    }

}
