public interface MovableDiagonally {
    default boolean canMoveDiagonally(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (chessBoard.board[toLine][toColumn] == null &&
                Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1) return true;
        int checkLine = line;
        int checkColumn = column;
        if (toLine > line){
            if (toColumn > column){
                for (int i = line + 1; i < toLine; i++) {
                    checkLine++;
                    checkColumn++;
                    if (chessBoard.board[checkLine][checkColumn] != null) return false;
                }
            }
            else {
                for (int i = line + 1; i < toLine; i++){
                    checkLine ++;
                    checkColumn --;
                    if (chessBoard.board[checkLine][checkColumn] != null) return false;
                }
            }
        }
        else{
            if (toColumn > column){
                for (int i = line - 1; i > toLine; i--){
                    checkLine--;
                    checkColumn++;
                    if (chessBoard.board[checkLine][checkColumn] != null) return false;
                }
            }
            else {
                for (int i = line - 1; i > toLine; i--){
                    checkLine--;
                    checkColumn--;
                    if (chessBoard.board[checkLine][checkColumn] != null) return false;
                }
            }
        }
        return true;
    }
}
