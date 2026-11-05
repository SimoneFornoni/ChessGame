import javax.swing.*;

import chessgame.Board;
import chessgame.ImageResources;
import chessgame.pieces.Bishop;
import chessgame.pieces.Knight;
import chessgame.pieces.Queen;
import chessgame.pieces.Rook;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePawnFrame implements ActionListener {
    JFrame frame;
    JButton[] btn=new JButton[4];
    JLabel[] lbl=new JLabel[4];

    Board board;
    boolean white;
    int x,y;

    public ChangePawnFrame(Board board,boolean white, int x, int y){
        int cnt;

        this.board=board;
        this.white=white;
        this.x=x;
        this.y=y;

        frame=new JFrame("Cambia il pedone in una nuova pedina");
        for(cnt=0;cnt<4;cnt++){
            btn[cnt]=new JButton();
            btn[cnt].addActionListener(this);
        }
        btn[0].setText("Rook");
        btn[1].setText("Horse");
        btn[2].setText("Bishop");
        btn[3].setText("Queen");

        for(cnt=0;cnt<4;cnt++){
            lbl[cnt]=new JLabel("",SwingConstants.CENTER);
        }

        if(white){
            lbl[0].setIcon(new ImageIcon(ImageResources.load("/images/Wrook.png")));
            lbl[1].setIcon(new ImageIcon(ImageResources.load("/images/Wknight.png")));
            lbl[2].setIcon(new ImageIcon(ImageResources.load("/images/Wbishop.png")));
            lbl[3].setIcon(new ImageIcon(ImageResources.load("/images/Wqueen.png")));
        }
        else{
            lbl[0].setIcon(new ImageIcon(ImageResources.load("/images/Brook.png")));
            lbl[1].setIcon(new ImageIcon(ImageResources.load("/images/Bknight.png")));
            lbl[2].setIcon(new ImageIcon(ImageResources.load("/images/Bbishop.png")));
            lbl[3].setIcon(new ImageIcon(ImageResources.load("/images/Bqueen.png")));
        }


        frame.setLayout(new GridLayout(2,4));
        frame.add(lbl[0]);
        frame.add(lbl[1]);
        frame.add(lbl[2]);
        frame.add(lbl[3]);

        frame.add(btn[0]);
        frame.add(btn[1]);
        frame.add(btn[2]);
        frame.add(btn[3]);

        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn[0]) {
            board.setPiece(x, y, new Rook(white));
            frame.dispose();
        }
        if (e.getSource() == btn[1]) {
            board.setPiece(x, y, new Knight(white));
            frame.dispose();
        }
        if (e.getSource() == btn[2]) {
            board.setPiece(x, y, new Bishop(white));
            frame.dispose();
        }
        if (e.getSource() == btn[3]) {
            board.setPiece(x, y, new Queen(white));
            frame.dispose();
        }
    }
}
