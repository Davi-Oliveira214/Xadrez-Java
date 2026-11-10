package screens;

import javax.swing.*;
import java.awt.*;

import static utils.SizesGame.*;

public class Board extends JPanel {
    public Board() {
        this.setPreferredSize(DIMENSION);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < TILES; i++) {
            for (int l = 0; l < TILES; l++) {
                g2d.setColor(Color.BLUE);
                g2d.drawRect((i * TILE_SCALE), (l * TILE_SCALE), TILE_SCALE, TILE_SCALE);
            }
        }
    }
}
