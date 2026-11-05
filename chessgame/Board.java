package chessgame;

import chessgame.pieces.*;

import javax.swing.JButton;

public class Board {
    private Square[][] matrix;

    public Board() {
        matrix = new Square[8][8];
        
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = new Square(new JButton(), null);
            }
        }

        // Initialize pawns
        for (int j = 0; j < 8; j++) {
            matrix[1][j] = new Square(new JButton(), new Pawn(false));
            matrix[6][j] = new Square(new JButton(), new Pawn(true));
        }

        // Initialize other pieces
        matrix[0][0] = new Square(new JButton(), new Rook(false));
        matrix[0][1] = new Square(new JButton(), new Knight(false));
        matrix[0][2] = new Square(new JButton(), new Bishop(false));
        matrix[0][3] = new Square(new JButton(), new Queen(false));
        matrix[0][4] = new Square(new JButton(), new King(false));
        matrix[0][5] = new Square(new JButton(), new Bishop(false));
        matrix[0][6] = new Square(new JButton(), new Knight(false));
        matrix[0][7] = new Square(new JButton(), new Rook(false));   

        matrix[7][0] = new Square(new JButton(), new Rook(true));
        matrix[7][1] = new Square(new JButton(), new Knight(true));
        matrix[7][2] = new Square(new JButton(), new Bishop(true));
        matrix[7][3] = new Square(new JButton(), new Queen(true));
        matrix[7][4] = new Square(new JButton(), new King(true));
        matrix[7][5] = new Square(new JButton(), new Bishop(true));
        matrix[7][6] = new Square(new JButton(), new Knight(true));
        matrix[7][7] = new Square(new JButton(), new Rook(true));
    }

    public void movePiece(int fromX, int fromY, int toX, int toY) {
        Square fromSquare = matrix[fromX][fromY];
        Square toSquare = matrix[toX][toY];

        if (!fromSquare.isEmpty()) {
            IPiece pieceToMove = fromSquare.getPiece().orElse(null);
            toSquare.setPiece(pieceToMove);
            fromSquare.clearPiece();
        }
    }

    public void setPiece(int x, int y, IPiece piece) {
        matrix[x][y].setPiece(piece);
    }

    public void clearPiece(int x, int y) {
        matrix[x][y].clearPiece();
    }

    public Square getSquare(int x, int y) {
        return matrix[x][y];
    }

    public boolean isEmpty(int x, int y) {
        return matrix[x][y].isEmpty();
    }

    public boolean isWhite(int x, int y) {
        return matrix[x][y].isWhite();
    }

    
}
