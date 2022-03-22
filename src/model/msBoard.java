package model;

/**
 * Models Magic Square entities
 *
 * @author Nathan Twite
 * @version 1.0
 * @since 2022-03-22
 */
public class msBoard  {
    /**
     * A 3 by 3 2D Array of integers preset to contain all zeros
     */
    int[][] magicSquare = { {0,0,0}, {0,0,0}, {0,0,0} };

    public int[][] getMagicSquare() {
        return magicSquare;
    }

    public void setMagicSquare(int row, int col, int aDigit) {
        this.magicSquare[row][col] = aDigit;
    }
}
