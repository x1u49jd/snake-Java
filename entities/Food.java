package entities;

public class Food {
    int row;
    int col;
    boolean exists = true;

    public Food(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean doesExist() {
        return exists;
    }

    public void remove() {
        exists = false;
    }
}
