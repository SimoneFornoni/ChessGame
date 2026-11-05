package chessgame.pieces;

import chessgame.Board;
import chessgame.ImageResources;
import chessgame.IPiece;

import java.awt.*;

public class Queen implements IPiece {
    private boolean isWhite;
    
    public Queen(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override 
    public void showMoves(Board board, int x, int y, boolean turno) {
        int cnt1,cnt2;
        boolean brk=true;

        board.getSquare(x, y).getButton().setBackground(Color.PINK);
        if (isWhite && turno) {           // bianco
            cnt1 = x+1;
            while (cnt1 < 8 && brk) {   // giú
                if (!board.getSquare(cnt1, y).isEmpty()) {
                    if (board.getSquare(cnt1, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, y).isEmpty()) {
                    board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                }
                cnt1++;
            }

            brk=true;
            cnt1 = x-1;
            while (cnt1 >= 0 && brk) {   // su
                if (!board.getSquare(cnt1, y).isEmpty()) {
                    if (board.getSquare(cnt1, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, y).isEmpty()) {
                    board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                }
                cnt1--;
            }

            brk=true;
            cnt1 = y+1;
            while (cnt1 < 8 && brk) {   // destra
                if (!board.getSquare(x, cnt1).isEmpty()) {
                    if (board.getSquare(x, cnt1).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(x, cnt1).isEmpty()) {
                    board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                }
                cnt1++;
            }

            brk=true;
            cnt1 = y-1;
            while (cnt1 >= 0 && brk) {      //sinistra
                if (!board.getSquare(x, cnt1).isEmpty()) {
                    if (board.getSquare(x, cnt1).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(x, cnt1).isEmpty()) {
                    board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                }
                cnt1--;
            }

            brk=true;
            cnt1 = x+1;
            cnt2 = y+1;
            while (cnt1 < 8 && cnt2 < 8 && brk) {   // basso destra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
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
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
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
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
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
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                }
                cnt1--;
                cnt2--;
            }
        }
        else if(!isWhite && !turno ){        // nero
            cnt1 = x+1;
            while (cnt1 < 8 && brk) {   // giú
                if (!board.getSquare(cnt1, y).isEmpty()) {
                    if(!board.getSquare(cnt1, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, y).isEmpty()) {
                    board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                }
                cnt1++;
            }

            brk=true;
            cnt1 = x-1;
            while (cnt1 >= 0 && brk) {   // su
                if (!board.getSquare(cnt1, y).isEmpty()) {
                    if(!board.getSquare(cnt1, y).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                        brk=false;

                    }

                }
                else if(board.getSquare(cnt1, y).isEmpty()) {
                    board.getSquare(cnt1, y).getButton().setBackground(Color.ORANGE);
                }
                cnt1--;
            }

            brk=true;
            cnt1 = y+1;
            while (cnt1 < 8 && brk) {   // destra
                if (!board.getSquare(x, cnt1).isEmpty()) {
                    if(!board.getSquare(x, cnt1).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(x, cnt1).isEmpty()) {
                    board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                }
                cnt1++;
            }

            brk=true;
            cnt1 = y-1;
            while (cnt1 >= 0 && brk) {      //sinistra
                if (!board.getSquare(x, cnt1).isEmpty()) {
                    if(!board.getSquare(x, cnt1).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                        brk=false;

                    }

                }
                else if(board.getSquare(x, cnt1).isEmpty()) {
                    board.getSquare(x, cnt1).getButton().setBackground(Color.ORANGE);
                }
                cnt1--;
            }

            brk=true;
            cnt1 = x+1;
            cnt2 = y+1;
            while (cnt1 < 8 && cnt2 < 8 && brk) {   // basso destra
                if (!board.getSquare(cnt1, cnt2).isEmpty()) {
                    if(!board.getSquare(cnt1, cnt2).isWhite()) {
                        brk=false;
                    }
                    else {
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
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
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
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
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
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
                        board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
                        brk=false;
                    }
                }
                else if(board.getSquare(cnt1, cnt2).isEmpty()) {
                    board.getSquare(cnt1, cnt2).getButton().setBackground(Color.ORANGE);
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

    @Deprecated 
    public Image getImage() {
        return ImageResources.load(isWhite ? "/images/Wqueen.png" : "/images/Bqueen.png");
    }
}
