package chessgame.pieces;

import chessgame.Board;
import chessgame.ImageResources;
import chessgame.IPiece;

import java.awt.*;

public class Knight implements IPiece {
    private boolean isWhite;

    public Knight(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override 
    public void showMoves(Board board, int x, int y, boolean turno){
        board.getSquare(x, y).getButton().setBackground(Color.PINK);
        if(isWhite && turno) {           // bianco

            if(x>1 && y<7){     //alto destra
                if(board.getSquare(x-2, y+1).isEmpty()){
                    board.getSquare(x-2, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-2, y+1).isEmpty() && !board.getSquare(x-2, y+1).isWhite()){
                    board.getSquare(x-2, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>1 && y>0){     //alto sinistra
                if(board.getSquare(x-2, y-1).isEmpty()){
                    board.getSquare(x-2, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-2, y-1).isEmpty() && !board.getSquare(x-2, y-1).isWhite()){
                    board.getSquare(x-2, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y<6){     //destra alto
                if(board.getSquare(x-1, y+2).isEmpty()){
                    board.getSquare(x-1, y+2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y+2).isEmpty() && !board.getSquare(x-1, y+2).isWhite()){
                    board.getSquare(x-1, y+2).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y<6){     //destra basso
                if(board.getSquare(x+1, y+2).isEmpty()){
                    board.getSquare(x+1, y+2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y+2).isEmpty() && !board.getSquare(x+1, y+2).isWhite()){
                    board.getSquare(x+1, y+2).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<6 && y<7){     //basso destra
                if(board.getSquare(x+2, y+1).isEmpty()){
                    board.getSquare(x+2, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+2, y+1).isEmpty() && !board.getSquare(x+2, y+1).isWhite()){
                    board.getSquare(x+2, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<6 && y>0){     //basso sinistra
                if(board.getSquare(x+2, y-1).isEmpty()){
                    board.getSquare(x+2, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+2, y-1).isEmpty() && !board.getSquare(x+2, y-1).isWhite()){
                    board.getSquare(x+2, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y>1){     //sinistra alto
                if(board.getSquare(x-1, y-2).isEmpty()){
                    board.getSquare(x-1, y-2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y-2).isEmpty() && !board.getSquare(x-1, y-2).isWhite()){
                    board.getSquare(x-1, y-2).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y>1){     //sinistra basso
                if(board.getSquare(x+1, y-2).isEmpty()){
                    board.getSquare(x+1, y-2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y-2).isEmpty() && !board.getSquare(x+1, y-2).isWhite()){
                    board.getSquare(x+1, y-2).getButton().setBackground(Color.ORANGE);
                }
            }
        }
        else if(!isWhite && !turno){         // nero
            if(x>1 && y<7){     //alto destra
                if(board.getSquare(x-2, y+1).isEmpty()){
                    board.getSquare(x-2, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-2, y+1).isEmpty() && board.getSquare(x-2, y+1).isWhite()){
                    board.getSquare(x-2, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>1 && y>0){     //alto sinistra
                if(board.getSquare(x-2, y-1).isEmpty()){
                    board.getSquare(x-2, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-2, y-1).isEmpty() && board.getSquare(x-2, y-1).isWhite()){
                    board.getSquare(x-2, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y<6){     //destra alto
                if(board.getSquare(x-1, y+2).isEmpty()){
                    board.getSquare(x-1, y+2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y+2).isEmpty() && board.getSquare(x-1, y+2).isWhite()){
                    board.getSquare(x-1, y+2).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y<6){     //destra basso
                if(board.getSquare(x+1, y+2).isEmpty()){
                    board.getSquare(x+1, y+2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y+2).isEmpty() && board.getSquare(x+1, y+2).isWhite()){
                    board.getSquare(x+1, y+2).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<6 && y<7){     //basso destra
                if(board.getSquare(x+2, y+1).isEmpty()){
                    board.getSquare(x+2, y+1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+2, y+1).isEmpty() && board.getSquare(x+2, y+1).isWhite()){
                    board.getSquare(x+2, y+1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<6 && y>0){     //basso sinistra
                if(board.getSquare(x+2, y-1).isEmpty()){
                    board.getSquare(x+2, y-1).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+2, y-1).isEmpty() && board.getSquare(x+2, y-1).isWhite()){
                    board.getSquare(x+2, y-1).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x>0 && y>1){     //sinistra alto
                if(board.getSquare(x-1, y-2).isEmpty()){
                    board.getSquare(x-1, y-2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x-1, y-2).isEmpty() && board.getSquare(x-1, y-2).isWhite()){
                    board.getSquare(x-1, y-2).getButton().setBackground(Color.ORANGE);
                }
            }

            if(x<7 && y>1){     //sinistra basso
                if(board.getSquare(x+1, y-2).isEmpty()){
                    board.getSquare(x+1, y-2).getButton().setBackground(Color.ORANGE);
                }
                else if(!board.getSquare(x+1, y-2).isEmpty() && board.getSquare(x+1, y-2).isWhite()){
                    board.getSquare(x+1, y-2).getButton().setBackground(Color.ORANGE);
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
        return ImageResources.load(isWhite ? "/images/Wknight.png" : "/images/Bknight.png");
    }

    
}
