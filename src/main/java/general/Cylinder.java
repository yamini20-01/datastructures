package general;

import general.Shape.Shape;

public class Cylinder implements Shape {


    @Override
    public int area() {
        int result = (22 / 7) * 7 * 7 * 10;
        return result;
    }
}
