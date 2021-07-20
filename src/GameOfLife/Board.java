package GameOfLife;

public class Board {
    // fields
    private int width;
    private int length;
    private Cell[][] grid;
    private boolean isDone = false;

    // constructor

    public Board(int x, int y) {
        this.width = x;
        this.length = y;

        // generating grid of cells
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.length; j++) {
                this.grid[i][j] = new Cell(i, j);
            }
        }
    }

    // allow user to initialize cell on board
    public void setCell(int x, int y) {
        if (this.grid[x][y].isDead()) {
            this.grid[x][y].setDead(false);
        } else {
            this.grid[x][y].setDead(true);
        }
    }
}
