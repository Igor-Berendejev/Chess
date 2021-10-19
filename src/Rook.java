public class Rook extends ChessPiece implements MovableVertically, MovableHorizontally{

    public Rook(String color){
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (illegalMove(chessBoard, line, column, toLine, toColumn)) return false;
        if ((column == toColumn && this.canMoveVertically(chessBoard, line, column, toLine, toColumn))
                || (line == toLine && this.canMoveHorizontally(chessBoard, line, column, toLine, toColumn))) {
            check = false;
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
