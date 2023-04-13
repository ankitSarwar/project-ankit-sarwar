package Tic_Tac_Toe;

import java.util.*;

public class OnePlayerGame extends Game {

    public OnePlayerGame(Board board, Player[] players) {
        super(board, players);
    }

    @Override
    public int[] getIndex() {
        if(this.turn == 1) {
            while(true){
                int idx =(int)(Math.random() * ((board.size * board.size - 1) + 1)); // Math.random gives value from 0.0 to 1.0 //and +1 because in random function 8.999-->is 8 so we want 9 so we add 1
                int rn = idx / board.size, cn = idx % board.size;
                if(board.board[rn][cn] != '-') {
                    System.out.println("Position already filled, try again");
                    continue;
                }
                return new int[] {rn, cn};
            }
        }

        while(true) {
            System.out.println(players[turn].name + "'s turn, give index: ");
            int idx = scn.nextInt() - 1;
            int rn = idx / board.size, cn = idx % board.size;
            if(rn < 0 || cn < 0 || rn >= board.size || cn >= board.size) {
                System.out.println("Out of bound index");
                continue;
            }
            if(board.board[rn][cn] != '-') {
                System.out.println("Position already filled, try again");
                continue;
            }
            return new int[]{rn, cn};
        }
    }
}