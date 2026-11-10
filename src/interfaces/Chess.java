package interfaces;

public abstract class Chess {
    private final int blocks;
    private final int points;

    public Chess(int blocks, int points) {
        this.blocks = blocks;
        this.points = points;
    }

    public int getBlocks() {
        return blocks;
    }

    public int getPoints() {
        return points;
    }
}
