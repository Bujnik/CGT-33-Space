package main;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;
    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * This method draws the object on the canvas.
     */
    public abstract void draw(Canvas canvas);

    /**
     * Move by one step.
     */
    public abstract void move();

    public void die(){
        isAlive = false;
    }

    public boolean intersects(BaseObject o) {
        double distX = this.getX() - o.getX();
        double distY = this.getY() - o.getY();
        double maxRadius = Math.max(this.getRadius(), o.getRadius());
        /**
         * We check if circle is within of another:
         * We measure distance between centers (sqrt(distX^2 + distY^2)
         * and compare it to bigger radius (maxRadius)
         */
        return Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2)) < maxRadius;
    }

    /**
     * Check whether (x, y) is beyond the borders.
     */
    public void checkBorders(double minx, double maxx, double miny, double maxy) {
        if (x < minx) x = minx;
        if (x > maxx) x = maxx;
        if (y < miny) y = miny;
        if (y > maxy) y = maxy;
    }
}
