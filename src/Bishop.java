public class Bishop extends ChessPiece implements MovableDiagonally{
    public Bishop(String color){
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (illegalMove(chessBoard, line, column, toLine, toColumn)) return false;
        return Math.abs(line - toLine) == Math.abs(column - toColumn) &&
                this.canMoveDiagonally(chessBoard, line, column, toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
