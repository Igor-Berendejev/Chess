public class Queen extends ChessPiece{
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
        if (column == toColumn || line == toLine) return true;
        return Math.abs(line - toLine) == Math.abs(column - toColumn);
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
