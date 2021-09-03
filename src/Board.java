public class Board {

    char[][] board = new char[3][3];
    private Player currentPlayer;
    private boolean result;

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean checkWin() {
        //TRY DOING IT ONLY WHEN USER HAS MORE THAN 2 INPUTS
        if (board[0][0] == currentPlayer.getSign() && board[0][1] == currentPlayer.getSign() && board[0][2] == currentPlayer.getSign()) {
            return true;
        } else if (board[1][0] == currentPlayer.getSign() && board[1][1] == currentPlayer.getSign() && board[1][2] == currentPlayer.getSign()) {
            return true;
        } else if (board[2][0] == currentPlayer.getSign() && board[2][1] == currentPlayer.getSign() && board[2][2] == currentPlayer.getSign()) {
            return true;
        } else if (board[0][0] == currentPlayer.getSign() && board[1][0] == currentPlayer.getSign() && board[2][0] == currentPlayer.getSign()) {
            return true;
        } else if (board[0][1] == currentPlayer.getSign() && board[1][1] == currentPlayer.getSign() && board[2][1] == currentPlayer.getSign()) {
            return true;
        } else if (board[0][2] == currentPlayer.getSign() && board[1][2] == currentPlayer.getSign() && board[2][2] == currentPlayer.getSign()) {
            return true;
        } else if (board[0][0] == currentPlayer.getSign() && board[1][1] == currentPlayer.getSign() && board[2][2] == currentPlayer.getSign()) {
            return true;
        } else if (board[0][2] == currentPlayer.getSign() && board[1][1] == currentPlayer.getSign() && board[2][0] == currentPlayer.getSign()) {
            return true;
        }

        return false;
    }

    public void drawBoard() {
        for (int row = 0; row < board.length; row++) {
            if (row != 0) {
                System.out.println();
                System.out.println("-----");
            }
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
                if (column != 2) {
                    System.out.print("|");
                }
            }
        }
    }

    public void switchPlayer(Player player1, Player player2) {
        if (currentPlayer.getSign() == player1.getSign()) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public boolean takeInput(int row, int col, Player player) {
        if (board[row][col] == '\u0000') {
            board[row][col] = player.getSign();
            return true;
        }
        return false;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
