package GameOfLife;

import java.util.Scanner;

public class Generator {

    // main application
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // create board
        Board board = new Board(15, 15);

        // setting cells on board
        boolean set = true;
        System.out.println("Initializing cells on board...");
        System.out.println("To bring a cell to life, enter the board coordinates on which it will reside.");
        System.out.println("To kill a cell, re-enter the board coordinates on which it currently resides.");

        while (set) {
            display(board);

            System.out.println("Enter X coordinate: ");
            int x = in.nextInt();

            System.out.println("Enter Y coordinate: ");
            int y = in.nextInt();

            board.setCell(x, y);
        }
    }

    public static void display(Board board) {

    }
}
