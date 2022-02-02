package main;

public class Ufo extends BaseObject{
    // Picture for drawing
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
    };

    public Ufo(double x, double y) {
        super(x, y, 3);
    }

    /**
     * This method draws the object on the canvas.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'U');
    }

    /**
     * Move the object by one step in a random direction.
     */
    @Override
    public void move() {
        x += Math.random() * 2 - 1;;
        y += Math.random() * 2 - 1;;

        checkBorders(radius, Space.game.getWidth() - radius + 1, radius - 1, Space.game.getHeight() / 2d - 1);

        if (Math.random() > 0.9) fire();
    }

    /**
     * We're shooting.
     * Drop (create) one bomb directly below.
     */
    public void fire() {
        Space.game.getBombs().add(new Bomb(x, y + radius));
    }
}
