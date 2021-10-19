public class Queen extends ChessPiece implements MovableDiagonally, MovableVertically, MovableHorizontally{
    public Queen(String color){
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (illegalMove(chessBoard, line, column, toLine, toColumn)) return false;
        if (column == toColumn && this.canMoveVertically(chessBoard, line, column, toLine, toColumn) ||
                (line == toLine && this.canMoveHorizontally(chessBoard, line, column, toLine, toColumn))) return true;
        return Math.abs(line - toLine) == Math.abs(column - toColumn) &&
                this.canMoveDiagonally(chessBoard, line, column, toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
