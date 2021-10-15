public abstract class ChessPiece{
    String color;
    boolean check = true;
    public ChessPiece(String color){
        this.color = color;
    }

    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();
    public static boolean illegalMove(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        return (line == toLine && column == toColumn) ||
                (!chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn));
    }
}