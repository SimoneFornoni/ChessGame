# ChessGame

A simple two-player chess game built in Java with Swing. The project includes a graphical board, piece movement logic, turn management, pawn promotion, and a victory popup when the opponent's king is captured.

## Project overview

This game was created as a local desktop chess application for two players on the same computer.

The project includes:
- a start screen
- a chess board rendered with Swing buttons
- standard chess piece movement
- turn-based gameplay
- pawn promotion to rook, knight, bishop, or queen
- victory condition based on the custom rule: the king is considered captured and the game ends

## Custom rules implemented

The project uses a simplified/challenging variant of chess with these rules:
- no draw
- no castling
- no en passant
- legal/illegal move logic is handled directly by the piece logic
- if the king is captured, the game ends immediately

## Repository structure

```text
ChessGame/
├── InitialFrame.java
├── ChessFrame.java
├── ChangePawnFrame.java
├── chessgame/
│   ├── Board.java
│   ├── Square.java
│   ├── IPiece.java
│   ├── ImageResources.java
│   └── pieces/
│       ├── Pawn.java
│       ├── Rook.java
│       ├── Knight.java
│       ├── Bishop.java
│       ├── Queen.java
│       └── King.java
├── images/
│   ├── Wpawn.png
│   ├── Wrook.png
│   ├── Wknight.png
│   ├── Wbishop.png
│   ├── Wqueen.png
│   ├── Wking.png
│   ├── Bpawn.png
│   ├── Brook.png
│   ├── Bknight.png
│   ├── Bbishop.png
│   ├── Bqueen.png
│   ├── Bking.png
│   └── VictoryCup.png
├── images.zip
├── .gitignore
└── README.md

## How to run

Requires Java JDK or newer

From the project root, compile the Java sources:

```
javac *.java chessgame/*.java chessgame/pieces/*.java
```

Then run the game:
```
java InitialFrame
```

Gameplay
1. Launch the app with InitialFrame.
2. Click the "Gioca" button.
3. Select a piece to view available moves.
4. Click a highlighted destination square to move it.
5. The turn switches automatically between white and black.
6. When a king is captured, a victory dialog is shown.