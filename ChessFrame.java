import chessgame.Board;
import chessgame.ImageResources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessFrame implements ActionListener {

    JFrame frame;
    JPanel panelgame, panelnorth, panelwest;
    JLabel lblround;
    Board board;
    char c;
    public static boolean bool = false;
    int row, col;
    int lastrow, lastcol;
    public static boolean round = true;


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

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = board.getSquare(i, j).getButton();
                button.setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.BLACK);
                button.addActionListener(this);
                panelgame.add(button);
            }
        }

        // frame
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void resetBoardColors() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((j + i) % 2 == 0) {
                    board.getSquare(i, j).getButton().setBackground(Color.WHITE);
                } else {
                    board.getSquare(i, j).getButton().setBackground(Color.BLACK);
                }
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

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (e.getSource() == board.getSquare(i, j).getButton()) {
                    if (bool) {                             // secondo bottone
                        if (board.getSquare(i, j).getButton().getBackground() == Color.ORANGE) {
                            if (board.getSquare(i, j).isKing()) {
                                board.movePiece(row, col, i, j);

                                resetBoardColors();
                                displayVictoryMessage(round);
                            }

                            board.movePiece(row, col, i, j);

                            round = !round;
                            if (round) {
                                lblround.setText("Turno dei Bianchi");
                            } else {
                                lblround.setText("Turno dei Neri");
                            }
                            lastrow = i;      // per evitare che si clicchi due volte sullo stesso pezzo
                            lastcol = j;

                            bool = false;
                            resetBoardColors();

                            if (board.getSquare(i, j).isWhite()) {
                                if (board.getSquare(i, j).isPawn() && i == 0) {
                                    ChangePawnFrame frameCP = new ChangePawnFrame(board, board.getSquare(i, j).isWhite(), i, j);
                                }
                            } else {
                                if (board.getSquare(i, j).isPawn() && i == 7) {
                                    ChangePawnFrame frameCP = new ChangePawnFrame(board, board.getSquare(i, j).isWhite(), i, j);
                                }
                            }

                        } else {
                            if (i == row && j == col) {
                                bool = false;
                                resetBoardColors();
                            }
                            if (board.getSquare(row, col).isWhite() == board.getSquare(lastrow, lastcol).isWhite()) {
                                bool = false;
                            }
                        }
                    }
                    else {
                        board.getSquare(i, j).showMoves(board, i, j, round);
                        row = i;
                        col = j;
                        bool = true;
                    }
                }
            }
        }
    }
}
