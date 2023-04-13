package Tic_Tac_Toe;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Ankit");
        System.out.println(p1);
        Player p2 = new Player("Suraj");
        System.out.println(p2);

        Board board = new Board(4);
        Game game = new Game(board, new Player[]{p1, p2});
//        Game game = new OnePlayerGame(board, new Player[]{p1, p2});
        game.play();
    }
}