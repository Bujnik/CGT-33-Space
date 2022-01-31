package main;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    /**
     * This method will set a point with x,y coordinates to color c
     */
    public void setPoint(double x, double y, char c){
        if(x < 0 || y < 0
                || y >= matrix.length
                || x >= matrix[0].length) return;

        matrix[(int) Math.round(y)][(int) Math.round(x)] = c;
    }

    /**
     * This method will copy passed image to Canvas matrix array
     * It will go through all pixels of passed image
     * and paint corresponding points in main matrix
     */
    public void drawMatrix(double x, double y, int[][]matrix, char c){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) setPoint(x + j, y + i, c);
            }
        }
    }

    /**
     * This method clears the matrix
     */
    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }

    /**
     * This method prints matrix on the screen
     */
    public void print() {
        System.out.println();

        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                System.out.print(" ");
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
