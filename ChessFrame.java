import chessgame.Board;
import chessgame.ImageResources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ChessFrame {

    private JFrame frame;
    private JPanel panelgame, panelnorth, panelwest;
    private JLabel lblround;
    private Board board;
    private char c;
    private boolean pieceToMoveSelected = false;
    private int selectedRow, selectedCol;
    private boolean whiteRound = true;


    public ChessFrame() {
        frame = new JFrame("Scacchi Definitive Edition");
        panelgame = new JPanel();
        panelnorth = new JPanel();
        panelwest = new JPanel();
        lblround = new JLabel("Turno dei Bianchi", SwingConstants.CENTER);

        panelgame.setLayout(new GridLayout(8, 8));
        panelnorth.setLayout(new GridLayout(1, 8));
        panelwest.setLayout(new GridLayout(8, 1));

        c = 'a';               // inserimento delle coordinate
        for (int k = 1; k < 9; k++) {
            panelnorth.add(new JLabel(String.valueOf(c), SwingConstants.CENTER));
            panelwest.add(new JLabel(" " + String.valueOf(k) + " ", SwingConstants.CENTER));
            c++;
        }

        frame.setLayout(new BorderLayout());
        frame.add(panelgame, BorderLayout.CENTER);
        frame.add(panelnorth, BorderLayout.NORTH);
        frame.add(panelwest, BorderLayout.WEST);
        frame.add(lblround, BorderLayout.SOUTH);
        board = new Board();

        setupButtons();

        // frame
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setupButtons() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                final int row = i;
                final int col = j;

                JButton button = board.getSquare(i, j).getButton();
                button.setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.BLACK);
                button.addActionListener(e -> {
                    actionPerformed(e, row, col);
                });
                panelgame.add(button);
            }
        }
    }

    private void displayVictoryMessage(boolean whiteWins) {
        Image image = ImageResources.load("/images/VictoryCup.png")
                .getScaledInstance(125, 125, Image.SCALE_DEFAULT);
        int close;
        if (whiteWins) {
            close = JOptionPane.showConfirmDialog(frame, "Hanno vinto i bianchi!", "Vittoria", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, new ImageIcon(image));
        } else {
            close = JOptionPane.showConfirmDialog(frame, "Hanno vinto i neri!", "Vittoria", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, new ImageIcon(image));
        }
        if (close == JOptionPane.OK_OPTION || close == JOptionPane.CLOSED_OPTION)
            frame.dispose();
    }

    public void actionPerformed(ActionEvent e, int x, int y) {
        if (pieceToMoveSelected) {
            if (board.getSquare(x, y).isValidDestination(board, x, y)) {
                if (board.getSquare(x, y).isKing()) {
                    board.movePiece(selectedRow, selectedCol, x, y);
                    board.resetBoardColors();
                    displayVictoryMessage(whiteRound);
                } else {
                    board.movePiece(selectedRow, selectedCol, x, y);
                    whiteRound = !whiteRound;
                    lblround.setText(whiteRound ? "Turno dei Bianchi" : "Turno dei Neri");
                    pieceToMoveSelected = false;
                    board.resetBoardColors();

                    if (board.getSquare(x, y).isPawn()) {
                        if ((board.getSquare(x, y).isWhite() && x == 0) || (!board.getSquare(x, y).isWhite() && x == 7)) {
                            new ChangePawnFrame(board, board.getSquare(x, y).isWhite(), x, y);
                        }
                    }
                }
            } else if (x != selectedRow || y != selectedCol) {
                pieceToMoveSelected = false;
                board.resetBoardColors();
            }
        } else {
            board.getSquare(x, y).showMoves(board, x, y, whiteRound);
            selectedRow = x;
            selectedCol = y;
            pieceToMoveSelected = true;
        }
    }
}
