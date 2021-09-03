import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int turns = 0;
        Player player1 = new Player(1, 'X');
        Player player2 = new Player(2, 'O');
        Board board = new Board();
        board.drawBoard();
        board.setCurrentPlayer(player1);


        while (!board.isResult()) {


            int row, col;
            Scanner scan = new Scanner(System.in);


            System.out.println("\nPlayer " + board.getCurrentPlayer().getId() + ": ");
            do {
                System.out.println("Please enter row number (1 to 3)");
                row = scan.nextInt() - 1;

                System.out.println("Please enter column number (1 to 3)");
                col = scan.nextInt() - 1;

            }

            while (row > 2 || row < 0 || col > 2 || col < 0 || !board.takeInput(row, col, board.getCurrentPlayer()));

            board.takeInput(row, col, board.getCurrentPlayer());
            board.getCurrentPlayer().setInputs((board.getCurrentPlayer().getInputs() + 1));
            System.out.println("Player " + board.getCurrentPlayer().getId() + " inputs: " + board.getCurrentPlayer().getInputs());
            board.drawBoard();
            turns++;

            if (board.checkWin() == true) {

                System.out.println("\nPlayer " + board.getCurrentPlayer().getId() + " won the game!");
                board.setResult(true);

            }
            if (turns > 8) {
                System.out.println("\nDraw!");
                board.setResult(true);
            }
            board.switchPlayer(player1, player2);


        }


    }


}
