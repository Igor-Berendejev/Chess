public class Horse extends ChessPiece{

    public Horse (String color){
        super(color);
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        int[][] toPositions = {
                {line - 2, column - 1},
                {line - 2, column + 1},
                {line - 1, column - 2},
                {line - 1, column + 2},
                {line + 1, column - 2},
                {line + 1, column + 2},
                {line + 2, column - 1},
                {line + 2, column + 1}};
        if (illegalMove(chessBoard, line, column, toLine, toColumn)) return false;
        for (int[]pos : toPositions){
            if (pos[0] == toLine && pos[1] == toColumn) return true;
        }
        return false;
    }
    @Override
    public String getSymbol(){
        return "H";
    }
}