package chessgame;

import java.awt.Image;

public interface IPiece {

    public void showMoves(Board board, int i, int j, boolean turno);

    public boolean isWhite();

    public Image getImage();

    default boolean isPawn() {
        return false;
    }

    default boolean isKing() {
        return false;
    }
}
