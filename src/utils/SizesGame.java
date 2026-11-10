package utils;

import java.awt.*;

public class SizesGame {
    private static final int ORIGINAL_TILE_SIZE = 32;
    private static final int SCALE = 2;
    public static final int TILE_SCALE = ORIGINAL_TILE_SIZE * SCALE;
    public static final int TILES = 8;

    public static final int SIZE_DIMENSION = TILE_SCALE * TILES;
    public static final Dimension DIMENSION = new Dimension(SIZE_DIMENSION, SIZE_DIMENSION);
}
