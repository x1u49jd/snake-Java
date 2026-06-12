package entities;

import java.util.LinkedList;

public class Snake {
    private int gridRows;
    private int gridCols;

    // list storing the snake's body (head + all tail segments)
    private LinkedList<int[]> body = new LinkedList<>();
    
    // initialise snake with one segment at the starting position
    public Snake(int startRow, int startCol, int gridRows, int gridCols) {
        body.add(new int[]{startRow, startCol});
        this.gridRows = gridRows;
        this.gridCols = gridCols;
    }

    // return current snake head position (first element of the LinkedList)
    public int[] getHead() {
        return body.getFirst();
    }

    // return whole snake body (whole LinkedList) 
    public LinkedList<int[]> getBody() {
        return body;
    }

    // read the current head coordinates into newRow/newCol
    // adjust those coordinates based on direction
    public void move(String direction) {
        int[] head = getHead();
        int newRow = head[0];
        int newCol = head[1];

        if (direction.equals("UP")) {newRow--;}
        if (direction.equals("DOWN")) {newRow++;}
        if (direction.equals("LEFT")) {newCol--;}
        if (direction.equals("RIGHT")) {newCol++;}

        if (newRow < 0) {
            // moved off grid at the top
            // appears at bottom
            newRow = gridRows - 1;
        }
        else if (newRow == gridRows) {
            // moved off grid at the bottom
            // appears at the top
            newRow = 0;
        }
        if (newCol < 0) {
            // moves off grid at the left
            // appears at the right
            newCol = gridCols - 1;
        }
        else if (newCol == gridCols) {
            // moves off grid at the right
            // appears at the left
            newCol = 0;
        }
        
        // add a new head at the front with updated position
        body.addFirst(new int[]{newRow, newCol});

        // remove the tail to keep snake length the same
        body.removeLast();
    }
}
