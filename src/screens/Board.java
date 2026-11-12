package screens;

import entity.ChessPiece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static utils.SizesGame.*;

public class Board extends JPanel {
    ChessPiece piece;

    public Board() {
        this.piece = new ChessPiece(1, 10, 0, 0);
        this.setPreferredSize(DIMENSION);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                if (mouseX >= piece.getMinX() && mouseX <= piece.getMaxX()) {
                    if (mouseY >= piece.getMinY() && mouseY <= piece.getMaxY()) {
                        piece.stepsWalkVertical(true);
                        pintar(getGraphics());
                    }
                }
            }
        });
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

        g2d.setColor(Color.BLUE);
        g2d.fillRect(this.piece.getMinX(), this.piece.getMinY(), piece.getWidth(), piece.getHeight());
    }

    private void pintar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLUE);
        g2d.fillRect(this.piece.getMinX(), this.piece.getMinY(), piece.getWidth(), piece.getHeight());
        repaint();
    }
}
