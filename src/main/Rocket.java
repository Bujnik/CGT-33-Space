package main;

public class Rocket extends BaseObject{
    public Rocket(double x, double y) {
        super(x, y, 1);
    }

    /**
     * Draw the object on the canvas.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'R');
    }

    /**
     * Move the object down by one step.
     */
    @Override
    public void move() {
        y--;
    }
}
