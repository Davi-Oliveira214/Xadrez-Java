package interfaces;

import static utils.SizesGame.TILE_SCALE;

public abstract class Chess {
    private final int HOMES, POINTS;
    private int walksX, walksY;
    private final double SUBTRACTION = 1.2;

    public Chess(int HOMES, int points, int walksX, int walksY) {
        this.HOMES = HOMES;
        this.POINTS = points;
        this.walksX = walksX;
        this.walksY = walksY;
    }

    public int getHOMES() {
        return HOMES;
    }

    public int getPOINTS() {
        return POINTS;
    }

    public int getWidth() {
        return (int) (TILE_SCALE / SUBTRACTION);
    }

    public int getHeight() {
        return (int) (TILE_SCALE / SUBTRACTION);
    }

    public void stepsWalkVertical(boolean direction) {
        if (direction) this.walksY += HOMES;
        else this.walksY -= HOMES;
    }

    public void stepsWalkHorizontal(boolean direction) {
        if (direction) this.walksX += HOMES;
        else this.walksX -= HOMES;
    }

    public int getMinX() {
        return ((TILE_SCALE - this.getWidth()) / 2) + (TILE_SCALE * this.getWalksX());
    }

    public int getMinY() {
        return ((TILE_SCALE - this.getHeight()) / 2) + (TILE_SCALE * this.getWalksY());
    }

    public int getMaxX() {
        return this.getMinX() + this.getWidth();
    }

    public int getMaxY() {
        return this.getMinY() + this.getHeight();
    }

    public int getWalksX() {
        return walksX;
    }

    public int getWalksY() {
        return walksY;
    }
}
