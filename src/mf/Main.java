package mf;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("MINEFIELD");
        int rows = 5;
        int columns = 5;
        boolean minefield[][] = new boolean[rows][columns];
        for (int g = 0; g <= columns * 2; g++) {
            System.out.print("=");
        }
        System.out.println();
        //let's fill that one with some random stuff!!
        Random rnd = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int mine = rnd.nextInt(2);
                if (mine > 0) {
                    minefield[i][j] = true;
                } else {
                    minefield[i][j] = false;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                if (minefield[i][j]) {
                    System.out.print("*|");
                } else {
                    System.out.printf(" |");
                }

            }
            System.out.println("");
            for (int g = 0; g <= columns * 2; g++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }

}
