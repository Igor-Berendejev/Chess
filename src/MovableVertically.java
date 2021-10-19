public interface MovableVertically {
    default boolean canMoveVertically(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (chessBoard.board[toLine][toColumn] == null && Math.abs(toLine - line) == 1) return true;
        if (Math.abs(toLine - line) > 1){
            for (int i = Math.min(line, toLine) + 1; i < Math.max(line, toLine); i++){
                if (chessBoard.board[i][column] != null) return false;
            }
        }
        return true;
    }
}
