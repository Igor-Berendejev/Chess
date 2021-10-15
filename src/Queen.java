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
        if (line == toLine && column == toColumn) return false;
        if (!chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)) return false;
        if (column == toColumn || line == toLine) return true;
        if (Math.abs(line - toLine) == Math.abs(column - toColumn)) return true;
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}