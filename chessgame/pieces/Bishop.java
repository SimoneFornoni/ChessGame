package chessgame.pieces;

import chessgame.Board;
import chessgame.ImageResources;
import chessgame.IPiece;

import java.awt.*;

public class Bishop implements IPiece {
    private boolean isWhite;

    public Bishop(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override 
    public void showMoves(Board board, int x, int y, boolean round) {
        int cnt1, cnt2;
        boolean brk=true;

        board.getSquare(x, y).highlightSource();
        if (isWhite && round) {              // bianco
            cnt1 = x+1;
            cnt2 = y+1;
            while (cnt1 < 8 && cnt2 < 8 && brk) {   // basso destra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if (board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1++;
                cnt2++;
            }

            brk=true;
            cnt1= x+1;
            cnt2= y-1;
            while (cnt1 < 8 && cnt2 >= 0 && brk) {   // basso sinistra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1++;
                cnt2--;
            }

            brk=true;
            cnt1= x-1;
            cnt2= y+1;
            while (cnt1 >= 0 && cnt2 < 8 && brk) {   // alto destra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1--;
                cnt2++;
            }

            brk=true;
            cnt1= x-1;
            cnt2= y-1;
            while (cnt1 >= 0 && cnt2 >= 0 && brk) {   // alto sinistra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1--;
                cnt2--;
            }
        }
        else if(!isWhite && !round){         // nero

            cnt1 = x+1;
            cnt2 = y+1;
            while (cnt1 < 8 && cnt2 < 8 && brk) {   // basso destra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(!board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1++;
                cnt2++;
            }

            brk=true;
            cnt1= x+1;
            cnt2= y-1;
            while (cnt1 < 8 && cnt2 >= 0 && brk) {   // basso sinistra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(!board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1++;
                cnt2--;
            }

            brk=true;
            cnt1= x-1;
            cnt2= y+1;
            while (cnt1 >= 0 && cnt2 < 8 && brk) {   // alto destra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(!board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1--;
                cnt2++;
            }

            brk=true;
            cnt1= x-1;
            cnt2= y-1;
            while (cnt1 >= 0 && cnt2 >= 0 && brk) {   // alto sinistra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(!board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).highlightDestination();
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).highlightDestination();
                }
                cnt1--;
                cnt2--;
            }
        }
    }

    @Override 
    public boolean isWhite() {
        return isWhite;
    }
    
    @Override 
    public Image getImage() {
        return ImageResources.load(isWhite ? "/images/Wbishop.png" : "/images/Bbishop.png");
    }
}
