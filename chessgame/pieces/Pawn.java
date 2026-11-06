package chessgame.pieces;

import chessgame.Board;
import chessgame.ImageResources;
import chessgame.IPiece;

import java.awt.Image;

public class Pawn implements IPiece {
    private boolean isWhite;

    public Pawn(boolean isWhite) {
        this.isWhite = isWhite;
    }
    
    @Override 
    public void showMoves(Board board, int x, int y, boolean round){
        board.getSquare(x,y).highlightSource();

        if(isWhite && round){  // pezzo bianco
            if(x==6){                                    // primo spostamento da 2
                if(board.getSquare(x-1,y).isEmpty()){
                    board.getSquare(x-1,y).highlightDestination();
                    if(board.getSquare(x-2,y).isEmpty())
                        board.getSquare(x-2,y).highlightDestination();
                }
            }
            else{
                if(x>0){     // gestione degli indici al di fuori della scacchiera
                    if(board.getSquare(x-1,y).isEmpty())
                        board.getSquare(x-1,y).highlightDestination();
                }
            }

            if(x>0 && y>0){      // quando il pedone mangia
                if(!board.getSquare(x-1,y-1).isWhite() && !board.getSquare(x-1,y-1).isEmpty())
                    board.getSquare(x-1,y-1).highlightDestination();
            }

            if(x>0 && y<7) {
                if (!board.getSquare(x-1,y+1).isWhite() && !board.getSquare(x-1,y+1).isEmpty())
                    board.getSquare(x-1,y+1).highlightDestination();
            }
        }
        else if(!isWhite && !round){    // pezzo nero

            if(x==1){
                if(board.getSquare(x+1,y).isEmpty()){
                    board.getSquare(x+1,y).highlightDestination();
                    if(board.getSquare(x+2,y).isEmpty())
                        board.getSquare(x+2,y).highlightDestination();
                }
            }
            else{
                if(x<7){
                    if(board.getSquare(x+1,y).isEmpty())
                        board.getSquare(x+1,y).highlightDestination();
                }
            }

            if(x<7 && y<7){
                if(board.getSquare(x+1,y+1).isWhite() && !board.getSquare(x+1,y+1).isEmpty())
                    board.getSquare(x+1,y+1).highlightDestination();
            }

            if(x<7 && y>0){
                if(board.getSquare(x+1,y-1).isWhite() && !board.getSquare(x+1,y-1).isEmpty())
                    board.getSquare(x+1,y-1).highlightDestination();
            }
        }
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }

    @Override
    public Image getImage() {
        return ImageResources.load(isWhite ? "/images/Wpawn.png" : "/images/Bpawn.png");
    }

    @Override
    public boolean isPawn() {
        return true;
    }
}
