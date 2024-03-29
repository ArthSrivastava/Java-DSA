package Graph.PepCoding;

import java.util.Scanner;

public class KnightsTour {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess, r, c, 1, n);
    }
    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove, int n) {
        if(r >= n || c >= n || r < 0 || c < 0 || chess[r][c] != 0) {
            return;
        }
        if (upcomingMove == n * n) {
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingMove;
        printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1, n);
        printKnightsTour(chess, r - 1, c + 2, upcomingMove + 1, n);
        printKnightsTour(chess, r + 1, c + 2, upcomingMove + 1, n);
        printKnightsTour(chess, r + 2, c + 1, upcomingMove + 1, n);
        printKnightsTour(chess, r + 2, c - 1, upcomingMove + 1, n);
        printKnightsTour(chess, r + 1, c - 2, upcomingMove + 1, n);
        printKnightsTour(chess, r - 1, c - 2, upcomingMove + 1, n);
        printKnightsTour(chess, r - 2, c - 1, upcomingMove + 1, n);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
