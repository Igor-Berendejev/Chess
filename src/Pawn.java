public class Pawn extends ChessPiece{

    public Pawn(String color){
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (illegalMove(chessBoard, line, column, toLine, toColumn)) return false;
        if (this.getColor().equals("White")){
            if (line == 1 &&
                    (toLine == line + 1 || (toLine == line + 2 && chessBoard.board[line + 1][column] == null)) &&
                    column == toColumn) return true;
            else return line != 1 && toLine == line + 1 && column == toColumn;
        }
        if (this.getColor().equals("Black")){
            if (line == 6 &&
                    (toLine == line - 1 || (toLine == line - 2 && chessBoard.board[line - 1][column] == null)) &&
                    column == toColumn) return true;
            else return line != 6 && toLine == line - 1 && column == toColumn;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
