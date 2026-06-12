package main;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import entities.Food;
import entities.Snake;

public class Panel extends JPanel {
    private final int rows = 20;
    private final int cols = 20;
    private final int cellSize = 40;
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

    public void update(Snake snake, Food food) {
        // set all cells in the grid to empty (GRAY)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[r][c].setType(CellType.EMPTY);
            }
        }
        
        // set the food cell to food cell type (ORANGE)
        cells[food.getRow()][food.getCol()].setType(CellType.FOOD);

        // for every segment of the snake, 
        // find the matching cell in the grid and mark it as snake cell type (GREEN)
        for (int i = 0; i < snake.getBody().size(); i++) {
            int[] pos = snake.getBody().get(i);
            int r = pos[0];
            int c = pos[1];
            cells[r][c].setType(CellType.SNAKE);
        }

        repaint();
    }


    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
