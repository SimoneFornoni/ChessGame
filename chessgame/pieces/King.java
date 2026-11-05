package chessgame.pieces;

import chessgame.Board;
import chessgame.ImageResources;
import chessgame.IPiece;

import java.awt.*;

public class King implements IPiece {
    private boolean isWhite;

    public King(boolean isWhite) {
        this.isWhite = isWhite;
    }
    
    @Override 
    public void showMoves(Board board, int x, int y, boolean turno){

        board.getSquare(x, y).getButton().setBackground(Color.PINK);
        if(isWhite && turno) {           // bianco

            if(x>0){        // su
                if(board.getSquare(x-1, y).isEmpty()){
                    board.getSquare(x-1, y).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y).isEmpty() && !board.getSquare(x-1, y).isWhite()){
                    board.getSquare(x-1, y).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7){        // giú
                if(board.getSquare(x+1, y).isEmpty()){
                    board.getSquare(x+1, y).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y).isEmpty() && !board.getSquare(x+1, y).isWhite()){
                    board.getSquare(x+1, y).getButton().setBackground(Color.ORANGE);
                }
            }

            if(y>0){        // sinistra
                if(board.getSquare(x, y-1).isEmpty()){
                    board.getSquare(x, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x, y-1).isEmpty() && !board.getSquare(x, y-1).isWhite()){
                    board.getSquare(x, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(y<7){        // destra
                if(board.getSquare(x, y+1).isEmpty()){
                    board.getSquare(x, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x, y+1).isEmpty() && !board.getSquare(x, y+1).isWhite()){
                    board.getSquare(x, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y>0){     // alto sinistra
                if(board.getSquare(x-1, y-1).isEmpty()){
                    board.getSquare(x-1, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y-1).isEmpty() && !board.getSquare(x-1, y-1).isWhite()){
                    board.getSquare(x-1, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y<7){     // alto destra
                if(board.getSquare(x-1, y+1).isEmpty()){
                    board.getSquare(x-1, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y+1).isEmpty() && !board.getSquare(x-1, y+1).isWhite()){
                    board.getSquare(x-1, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y>0){     // basso sinistra
                if(board.getSquare(x+1, y-1).isEmpty()){
                    board.getSquare(x+1, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y-1).isEmpty() && !board.getSquare(x+1, y-1).isWhite()){
                    board.getSquare(x+1, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y<7){     // basso destra
                if(board.getSquare(x+1, y+1).isEmpty()){
                    board.getSquare(x+1, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y+1).isEmpty() && !board.getSquare(x+1, y+1).isWhite()){
                    board.getSquare(x+1, y+1).getButton().setBackground(Color.ORANGE);
                }
            }
        }
        else if(!isWhite && !turno){         // nero

            if(x>0){        // su
                if(board.getSquare(x-1, y).isEmpty()){
                    board.getSquare(x-1, y).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y).isEmpty() && board.getSquare(x-1, y).isWhite()){
                    board.getSquare(x-1, y).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7){        // giú
                if(board.getSquare(x+1, y).isEmpty()){
                    board.getSquare(x+1, y).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y).isEmpty() && board.getSquare(x+1, y).isWhite()){
                    board.getSquare(x+1, y).getButton().setBackground(Color.ORANGE);
                }
            }

            if(y>0){        // sinistra
                if(board.getSquare(x, y-1).isEmpty()){
                    board.getSquare(x, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x, y-1).isEmpty() && board.getSquare(x, y-1).isWhite()){
                    board.getSquare(x, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(y<7){        // destra
                if(board.getSquare(x, y+1).isEmpty()){
                    board.getSquare(x, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x, y+1).isEmpty() && board.getSquare(x, y+1).isWhite()){
                    board.getSquare(x, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y>0){     //alto sinistra
                if(board.getSquare(x-1, y-1).isEmpty()){
                    board.getSquare(x-1, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y-1).isEmpty() && board.getSquare(x-1, y-1).isWhite()){
                    board.getSquare(x-1, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y<7){     // alto destra
                if(board.getSquare(x-1, y+1).isEmpty()){
                    board.getSquare(x-1, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y+1).isEmpty() && board.getSquare(x-1, y+1).isWhite()){
                    board.getSquare(x-1, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y>0){     // basso sinistra
                if(board.getSquare(x+1, y-1).isEmpty()){
                    board.getSquare(x+1, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y-1).isEmpty() && board.getSquare(x+1, y-1).isWhite()){
                    board.getSquare(x+1, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y<7){     // basso destra
                if(board.getSquare(x+1, y+1).isEmpty()){
                    board.getSquare(x+1, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y+1).isEmpty() && board.getSquare(x+1, y+1).isWhite()){
                    board.getSquare(x+1, y+1).getButton().setBackground(Color.ORANGE);
                }
            }
        }
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }

    @Override 
    public Image getImage() {
        return ImageResources.load(isWhite ? "/images/Wking.png" : "/images/Bking.png");
    }

    @Override
    public boolean isKing() {
        return true;
    }
}
