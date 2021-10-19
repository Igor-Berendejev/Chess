public class King extends ChessPiece{
    public King(String color){
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int[][] toPositions = {
                {line - 1, column - 1},
                {line - 1, column},
                {line - 1, column + 1},
                {line, column - 1},
                {line, column + 1},
                {line + 1, column - 1},
                {line + 1, column},
                {line + 1, column + 1}};
        if (illegalMove(chessBoard, line, column, toLine, toColumn)) return false;
        for (int[]pos: toPositions){
            if (pos[0] == toLine && pos[1] == toColumn) {check = false; return true;}
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column){
        for (int i = 0; i <= 7; i++){
            for (int j = 0; j <= 7; j++){
                if (board.board[i][j] != null && !board.board[i][j].getColor().equals(this.getColor())){
                    if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) return true;
                }
            }
        }
        return false;
    }
}
