package GameOfLife;

public class Cell {
    private int x;
    private int y;
    private boolean dead = true;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTERS

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public boolean isDead() {
        return dead;
    }

    // SETTERS

    public void setDead(boolean dead) {
        this.dead = dead;
    }

}
