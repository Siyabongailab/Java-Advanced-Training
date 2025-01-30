package Chapter7.interfaces;

/**
 * interfaces for the calculation and return of the  area and parameter of a shape.
 * @return
 */
public interface IShape {
// methods inside an interface are both public and abstract by default.

    /**
     * calculates area of a shape and returns the value
     * @return
     */
    double getArea();


    /**
     * calculates parameter of a shape and returns the value
     * @return
     */
    double getPerimeter();

}
