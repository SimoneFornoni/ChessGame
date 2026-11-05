package chessgame;

import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Square {
    private JButton button;
    private Optional<IPiece> piece;

    public Square(JButton button, IPiece piece) {
        this.button = button;
        setPiece(piece);
    }

    public Square(JButton button) {
        this.button = button;
        this.piece = Optional.empty();
        this.button.setIcon(null);
    }

    public Optional<IPiece> getPiece() {
        return piece;
    }

    public void setPiece(IPiece piece) {
        this.piece = Optional.ofNullable(piece);
        this.button.setIcon(piece == null ? null : new ImageIcon(piece.getImage()));
    }

    public void clearPiece() {
        this.piece = Optional.empty();
        this.button.setIcon(null);
    }

    public void showMoves(Board board, int x, int y, boolean turno) {
        if (piece.isPresent()) {
            piece.get().showMoves(board, x, y, turno);
        }
    }

    public JButton getButton() {
        return button;
    }

    public boolean isWhite() {
        return piece.isPresent() && piece.get().isWhite();
    }

    public boolean isEmpty() {
        return piece.isEmpty();
    }

    public boolean isKing() {
        return piece.isPresent() && piece.get().isKing();
    }

    public boolean isPawn() {
        return piece.isPresent() && piece.get().isPawn();
    }
}
