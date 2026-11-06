package chessgame.pieces;

import chessgame.Board;
import chessgame.ImageResources;
import chessgame.IPiece;

import java.awt.*;

public class Rook implements IPiece {
    private boolean isWhite;

    public Rook(boolean isWhite) {
        this.isWhite = isWhite;
    }
    
    @Override 
    public void showMoves(Board board, int x, int y, boolean round) {
        int cnt;
        boolean brk=true;

        board.getSquare(x, y).highlightSource();
        if(isWhite && round) {           // bianco
            cnt = x+1;
            while (cnt < 8 && brk) {   // giú
                if (!board.getSquare(cnt, y).isEmpty()) {
                    if(board.getSquare(cnt, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt, y).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt, y).isEmpty()) {
                    board.getSquare(cnt, y).highlightDestination();
                }
                cnt++;
            }

            brk=true;
            cnt = x-1;
            while (cnt >= 0 && brk) {   // su
                if (!board.getSquare(cnt, y).isEmpty()) {
                    if(board.getSquare(cnt, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt, y).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt, y).isEmpty()) {
                    board.getSquare(cnt, y).highlightDestination();
                }
                cnt--;
            }

            brk=true;
            cnt = y+1;
            while (cnt < 8 && brk) {   // destra
                if (!board.getSquare(x, cnt).isEmpty()) {
                    if(board.getSquare(x, cnt).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(x, cnt).isEmpty()) {
                    board.getSquare(x, cnt).highlightDestination();
                }
                cnt++;
            }

            brk=true;
            cnt = y-1;
            while (cnt >= 0 && brk) {      //sinistra
                if (!board.getSquare(x, cnt).isEmpty()) {
                    if(board.getSquare(x, cnt).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(x, cnt).isEmpty()) {
                    board.getSquare(x, cnt).highlightDestination();
                }
                cnt--;
            }

        }
        else if(!isWhite && !round ){        // nero
            cnt = x+1;
            while (cnt < 8 && brk) {   // giú
                if (!board.getSquare(cnt, y).isEmpty()) {
                    if(!board.getSquare(cnt, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt, y).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt, y).isEmpty()) {
                    board.getSquare(cnt, y).highlightDestination();
                }
                cnt++;
            }

            brk=true;
            cnt = x-1;
            while (cnt >= 0 && brk) {   // su
                if (!board.getSquare(cnt, y).isEmpty()) {
                    if(!board.getSquare(cnt, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt, y).highlightDestination();
                        brk=false;

                    }

                }
                else if(board.getSquare(cnt, y).isEmpty()) {
                    board.getSquare(cnt, y).highlightDestination();
                }
                cnt--;
            }

            brk=true;
            cnt = y+1;
            while (cnt < 8 && brk) {   // destra
                if (!board.getSquare(x, cnt).isEmpty()) {
                    if(!board.getSquare(x, cnt).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(x, cnt).isEmpty()) {
                    board.getSquare(x, cnt).highlightDestination();
                }
                cnt++;
            }

            brk=true;
            cnt = y-1;
            while (cnt >= 0 && brk) {      //sinistra
                if (!board.getSquare(x, cnt).isEmpty()) {
                    if(!board.getSquare(x, cnt).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt).highlightDestination();
                        brk=false;

                    }

                }
                else if(board.getSquare(x, cnt).isEmpty()) {
                    board.getSquare(x, cnt).highlightDestination();
                }
                cnt--;
            }
        }
    }

    public Image getImage() {
        return ImageResources.load(isWhite ? "/images/Wrook.png" : "/images/Brook.png");
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }
}
