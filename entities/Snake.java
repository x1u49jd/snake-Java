package entities;

import java.util.LinkedList;

public class Snake {
    // list storing the snake's body (head + all tail segments)
    private LinkedList<int[]> body = new LinkedList<>();
    
    // initialise snake with one segment at the starting position
    public Snake(int startRow, int startCol) {
        body.add(new int[]{startRow, startCol});
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

        // add a new head at the front with updated position
        body.addFirst(new int[]{newRow, newCol});

        // remove the tail to keep snake length the same
        body.removeLast();
    }
}
