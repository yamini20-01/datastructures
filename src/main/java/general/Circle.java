package general;

import general.Shape.Shape;

public class Circle implements Shape {


    @Override
    public int area() {
        int result = (22 / 7) * 7 * 7;
        Shape c = new Cylinder();

        return result * c.area();
    }
}
