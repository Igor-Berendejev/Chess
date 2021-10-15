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
        if (line == toLine && column == toColumn) return false;
        if (!chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)) return false;
        if (this.getColor().equals("White")){
            if (line == 1 && (toLine == line + 1 || toLine == line + 2) && column == toColumn) return true;
            else if (line != 1 && toLine == line + 1 && column == toColumn) return true;
            else return false;
        }
        if (this.getColor().equals("Black")){
            if (line == 6 && (toLine == line - 1 || toLine == line - 2) && column == toColumn) return true;
            else if (line != 6 && toLine == line - 1 && column == toColumn) return true;
            else return false;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
