/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Write a property management application
 * Due: 11/11/2024
 * Platform/compiler: Eclipse.
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ugonna Umunna.
*/


package package1;

public class Plot {
    private int x, y, width, depth;

    // Constructors
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    // Getters and Setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    
    public int getDepth() { return depth; }
    public void setDepth(int depth) { this.depth = depth; }

    // Overlaps method
    public boolean overlaps(Plot other) {
        return !(x + width <= other.x || other.x + other.width <= x || y + depth <= other.y || other.y + other.depth <= y);
    }

    // Encompasses method
    public boolean encompasses(Plot other) {
        return x <= other.x && y <= other.y && x + width >= other.x + other.width && y + depth >= other.y + other.depth;
    }

    // toString method
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}
