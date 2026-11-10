import screens.Board;

import javax.swing.*;

public class Screen extends JFrame {
    public Screen() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Board board = new Board();
        this.add(board);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
