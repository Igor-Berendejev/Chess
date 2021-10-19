public interface MovableHorizontally {
    default boolean canMoveHorizontally(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (chessBoard.board[toLine][toColumn] == null && Math.abs(toColumn - column) == 1) return true;
        if (Math.abs(toColumn - column) > 1){
            for (int i = Math.min(column, toColumn) + 1; i < Math.max(column, toColumn); i++){
                if (chessBoard.board[line][i] != null) return false;
            }
        }
        return true;
    }
}
